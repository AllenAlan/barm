package com.barm.tree.core.provider.impl;

import com.barm.tree.api.exception.LeafServerException;
import com.barm.tree.api.provider.TreeProvider;
import com.barm.tree.core.service.IdService;
import com.google.common.collect.Lists;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @version 1.0.0
 * @description LeafProviderImpl
 * @create 2020/3/20 15:59
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Service
public class TreeProviderImpl implements TreeProvider {

    @Resource(name = "SnowflakeService")
    private IdService idService;

    @Override
    public Long leafId(String key) {
        Result result = idService.leafId(key);
        if (result.getStatus().equals(Status.EXCEPTION)) {
            throw new LeafServerException(result.toString());
        }
        return Long.valueOf(result.getId());
    }

    @Override
    public List<Long> batchLeafId(String key, Integer size) {
        List<Long> list = Lists.newArrayList();
        for (Integer i = 0; i < size; i++) {
            Result result = idService.leafId(key);
            if (result.getStatus().equals(Status.EXCEPTION)) {
                throw new LeafServerException(result.toString());
            }
            list.add(Long.valueOf(result.getId()));
        }
        return list;
    }
}
