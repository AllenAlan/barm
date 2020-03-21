#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.provider;

import ${package}.api.domain.dto.result.UserMainDTO;
import ${package}.api.domain.dto.spec.UserMainSpec;
import com.github.pagehelper.PageInfo;

public interface UserMainProvider {

    PageInfo<UserMainDTO> page(UserMainSpec spec);

}
