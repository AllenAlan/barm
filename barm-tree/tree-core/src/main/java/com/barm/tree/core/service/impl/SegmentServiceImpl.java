package com.barm.tree.core.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.barm.tree.api.exception.InitException;
import com.barm.tree.core.LeafConfiguration;
import com.barm.tree.core.service.IdService;
import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.ZeroIDGen;
import com.sankuai.inf.leaf.segment.SegmentIDGenImpl;
import com.sankuai.inf.leaf.segment.dao.IDAllocDao;
import com.sankuai.inf.leaf.segment.dao.impl.IDAllocDaoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.sql.SQLException;

@Slf4j
@Service("SegmentService")
public class SegmentServiceImpl implements IdService {

    private IDGen idGen;
    private DruidDataSource dataSource;

    @Resource
    private LeafConfiguration leafConfiguration;

    @PostConstruct
    public void init() throws SQLException, InitException {
        if (leafConfiguration.getSegmentEnable()) {
            // Config dataSource
            dataSource = new DruidDataSource();
            dataSource.setUrl(leafConfiguration.getUrl());
            dataSource.setUsername(leafConfiguration.getUsername());
            dataSource.setPassword(leafConfiguration.getPassword());
            dataSource.init();

            // Config Dao
            IDAllocDao dao = new IDAllocDaoImpl(dataSource);

            // Config ID Gen
            idGen = new SegmentIDGenImpl();
            ((SegmentIDGenImpl) idGen).setDao(dao);
            if (idGen.init()) {
                log.info("Segment Service Init Successfully");
            } else {
                throw new InitException("Segment Service Init Fail");
            }
        } else {
            idGen = new ZeroIDGen();
            log.info("Zero ID Gen Service Init Successfully");
        }
    }

    public SegmentIDGenImpl getIdGen() {
        if (idGen instanceof SegmentIDGenImpl) {
            return (SegmentIDGenImpl) idGen;
        }
        return null;
    }

    @Override
    public Result leafId(String key) {
        return idGen.get(key);
    }
}
