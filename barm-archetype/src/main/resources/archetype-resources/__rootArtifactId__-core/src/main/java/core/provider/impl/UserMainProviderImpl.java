#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.provider.impl;

import ${package}.api.domain.dto.result.UserMainDTO;
import ${package}.api.domain.dto.spec.UserMainSpec;
import ${package}.api.provider.UserMainProvider;
import ${package}.core.domain.assembler.UserMainMapping;
import ${package}.data.domain.db.UserMainDO;
import ${package}.data.domain.mapper.UserMainDOMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Protocol;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @version 1.0.0
 * @description UseMainProviderImpl
 * @create 2020/3/16 14:32
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Service
@Component
public class UserMainProviderImpl implements UserMainProvider {

    @Resource
    private UserMainDOMapper userMainDOMapper;

    @Resource
    private UserMainMapping userMainMapping;

    @Override
    public PageInfo<UserMainDTO> page(UserMainSpec spec) {
        PageHelper.startPage(spec.getPage(), spec.getPageSize());
        UserMainDO params = userMainMapping.specToDO(spec);
        List<UserMainDO> list = userMainDOMapper.findByAll(params);
        return new PageInfo(userMainMapping.toDTO(list));
    }
}
