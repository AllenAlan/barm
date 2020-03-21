package com.barm.archetypes.server.domain.assembler;

import com.barm.archetypes.core.domain.bo.UserMainBO;
import com.barm.archetypes.server.domain.vo.UserMainVO;
import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;

/**
 * @description UserMainBOMapping
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/6 21:39
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Mapper(componentModel = "spring")
public interface UserMainVOMapping {
    PageInfo<UserMainVO> toVOpage(PageInfo<UserMainBO> userMainBO);
}
