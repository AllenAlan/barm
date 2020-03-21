package com.barm.tree.api.provider;

import java.util.List;

/**
 * @description LeafProvider
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/20 15:53
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
public interface TreeProvider {

    Long leafId(String key);

    List<Long> batchLeafId(String key, Integer size);
}
