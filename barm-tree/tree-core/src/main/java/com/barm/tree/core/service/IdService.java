package com.barm.tree.core.service;

import com.barm.tree.api.exception.LeafServerException;
import com.barm.tree.api.exception.NoKeyException;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Allen
 * @version 1.0.0
 * @description IdService
 * @create 2020/3/20 15:03
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
public interface IdService {
    Result leafId(String key);

    default Long leafIdLong(String key){
        if (StringUtils.isBlank(key)) {
            throw new NoKeyException();
        }
        Result result = this.leafId(key);
        if (result.getStatus().equals(Status.EXCEPTION)) {
            throw new LeafServerException(result.toString());
        }
        return Long.valueOf(result.getId());
    }

    default String leafIdStr(String key){
        if (key == null || key.isEmpty()) {
            throw new NoKeyException();
        }
        Result result = this.leafId(key);
        if (result.getStatus().equals(Status.EXCEPTION)) {
            throw new LeafServerException(result.toString());
        }
        return String.valueOf(result.getId());
    }

}
