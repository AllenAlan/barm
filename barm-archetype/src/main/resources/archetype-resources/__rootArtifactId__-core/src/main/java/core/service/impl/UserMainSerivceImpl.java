#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.service.impl;

import ${package}.core.domain.assembler.UserMainMapping;
import ${package}.core.domain.bo.UserMainBO;
import ${package}.core.service.UserMainSerivce;
import ${package}.data.domain.db.UserMainDO;
import ${package}.data.domain.mapper.UserMainDOMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @version 1.0.0
 * @description UserMainSerivce
 * @create 2020/3/6 21:29
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Service
public class UserMainSerivceImpl implements UserMainSerivce {
    @Resource
    private UserMainDOMapper userMainDOMapper;
    @Resource
    private UserMainMapping mapping;

    @Override
    public List<UserMainDO> selectAllByNicknameAndDeleted(String nickname, Boolean deleted) {
        return userMainDOMapper.selectAllByNicknameAndDeleted(nickname, deleted);
    }

    @Override
    public PageInfo<UserMainBO> page(int page, int pageSize, String nickname, Boolean deleted) {
        PageHelper.startPage(page, pageSize);
        PageInfo<UserMainDO> doPage = new PageInfo<>(userMainDOMapper.selectAllByNicknameAndDeleted(nickname, deleted));
        return mapping.toBO(doPage);
    }
}
