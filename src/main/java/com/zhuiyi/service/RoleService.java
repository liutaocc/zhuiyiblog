package com.zhuiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.Role;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 */
public interface RoleService extends IService<Role> {


    ResponseResult listRole(String name);

     ResponseResult insertRole(Role role);

    ResponseResult updateRole(Role role);

    ResponseResult deleteBatch(List<Integer> ids);

    ResponseResult getCurrentUserRole();

    ResponseResult selectById(Integer roleId);

}
