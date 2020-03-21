#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server.domain.assembler;

import ${package}.core.domain.bo.UserMainBO;
import ${package}.server.domain.vo.UserMainVO;
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
