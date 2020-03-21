package com.barm.archetypes.data.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.barm.archetypes.data.domain.db.UserMainDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @description UserMainDOMapper
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/6 21:32
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Mapper
public interface UserMainDOMapper extends BaseMapper<UserMainDO> {

    List<UserMainDO> selectAllByNicknameAndDeleted(@Param("nickname")String nickname,@Param("deleted")Boolean deleted);

    List<UserMainDO> findByAll(UserMainDO userMainDO);
}