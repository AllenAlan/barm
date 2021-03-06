package com.barm.archetypes.server.controller;

import com.barm.archetypes.core.domain.bo.UserMainBO;
import com.barm.archetypes.core.service.UserMainSerivce;
import com.barm.archetypes.server.domain.assembler.UserMainVOMapping;
import com.barm.archetypes.server.domain.vo.UserMainVO;
import com.barm.archetypes.util.IDGenerator;
import com.barm.common.domain.enums.ResultEnum;
import com.barm.common.domain.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Allen
 * @version 1.0.0
 * @description UserMainController
 * @create 2020/3/6 21:44
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@RestController
@RequestMapping("userMain")
public class UserMainController {

    @Resource
    private UserMainSerivce userMainSerivce;
    @Resource
    private UserMainVOMapping userMainVOMapping;
    @Resource
    private IDGenerator idGenerator;

    @GetMapping("/page")
    public ResultVO<UserMainVO> page(int page, int pageSize, String nickname){
        PageInfo<UserMainBO> boPageInfo = userMainSerivce.page(page, pageSize, nickname, Boolean.FALSE);
        return new ResultVO(ResultEnum.SUCCESS, userMainVOMapping.toVOpage(boPageInfo));
    }

    @GetMapping("tree/id")
    public ResultVO<String> tree(){
       return new ResultVO(idGenerator.leafIdStr());
    }

}
