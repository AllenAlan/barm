#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.domain.assembler;

import ${package}.api.domain.dto.result.UserMainDTO;
import ${package}.api.domain.dto.spec.UserMainSpec;
import ${package}.core.domain.bo.UserMainBO;
import ${package}.data.domain.db.UserMainDO;
import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @description UserMainBOMapping
 * @author Allen
 * @version 1.0.0
 * @create 2020/3/6 21:39
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
@Mapper(componentModel = "spring")
public interface UserMainMapping {

    UserMainDO specToDO(UserMainSpec spec);
    List<UserMainDTO> toDTO(List<UserMainDO> userMainDO);
    PageInfo<UserMainBO> toBO(PageInfo<UserMainDO> userMainDO);

}
