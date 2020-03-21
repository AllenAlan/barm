package com.barm.tree.server.controller;

import com.barm.tree.core.service.IdService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LeafController {

    @Resource(name = "SegmentService")
    private IdService segmentService;
    @Resource(name = "SnowflakeService")
    private IdService snowflakeService;

    @RequestMapping(value = "/api/segment/get/{key}")
    public String getSegmentId(@PathVariable("key") String key) {
        return segmentService.leafIdStr(key);
    }

    @RequestMapping(value = "/api/snowflake/get/{key}")
    public String getSnowflakeId(@PathVariable("key") String key) {
        return snowflakeService.leafIdStr(key);
    }

}
