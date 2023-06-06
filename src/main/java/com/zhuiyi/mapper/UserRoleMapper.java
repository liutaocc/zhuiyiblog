package com.zhuiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuiyi.entity.Menu;
import com.zhuiyi.entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 系统管理 - 用户角色关联表  Mapper 接口
 * </p>
 */
@Repository
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<Menu> selectMenuByUserId(Long id);
}
