#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.service;

import ${package}.core.domain.bo.UserMainBO;
import ${package}.data.domain.db.UserMainDO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Allen
 * @version 1.0.0
 * @description UserMainSerivce
 * @create 2020/3/6 21:29
 * @e-mail allenalan@139.com
 * @copyright 版权所有 (C) 2020 allennote
 */
public interface UserMainSerivce {
    List<UserMainDO> selectAllByNicknameAndDeleted(String nickname, Boolean deleted);

    PageInfo<UserMainBO> page(int page, int pageSize, String nickname, Boolean deleted);
}
