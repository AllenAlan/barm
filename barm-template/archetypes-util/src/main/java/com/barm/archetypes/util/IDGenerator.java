package com.barm.archetypes.util;

import com.barm.tree.api.provider.TreeProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Allen
 * @version 1.0.0
 * @description TreeService 分布式ID 生成
 * @create 2020/3/20 16:04
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Service
public class IDGenerator {

    @Reference
    private TreeProvider treeProvider;

    @Value("${spring.application.name}")
    private String key;

    public Long leafId(){
        return treeProvider.leafId(key);
    }

    public String leafIdStr(){
        return leafId().toString();
    }

    public List<Long> batchLeafId(Integer size){
        return treeProvider.batchLeafId(key, size);
    }

}
