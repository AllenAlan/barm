package com.barm.tree.core.service.impl;

import com.barm.tree.api.exception.InitException;
import com.barm.tree.core.LeafConfiguration;
import com.barm.tree.core.service.IdService;
import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.ZeroIDGen;
import com.sankuai.inf.leaf.snowflake.SnowflakeIDGenImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Slf4j
@Service("SnowflakeService")
public class SnowflakeServiceImpl implements IdService {

    private IDGen idGen;

    @Resource
    private LeafConfiguration leafConfiguration;

    @PostConstruct
    public void init() throws InitException {
        if (leafConfiguration.getSnowflakeEnable()) {
            String zkAddress = leafConfiguration.getZkIp();
            int port = leafConfiguration.getZkPort();
            idGen = new SnowflakeIDGenImpl(zkAddress, port);
            if (idGen.init()) {
                log.info("Snowflake Service Init Successfully");
            } else {
                throw new InitException("Snowflake Service Init Fail");
            }
        } else {
            idGen = new ZeroIDGen();
            log.info("Zero ID Gen Service Init Successfully");
        }
    }

    @Override
    public Result leafId(String key) {
        return idGen.get(key);
    }
}
