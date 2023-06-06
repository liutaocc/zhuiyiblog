package com.zhuiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.Menu;
import java.util.List;

public interface MenuService extends IService<Menu>{

    List<Menu> listMenuTree(List<Menu> list);

    ResponseResult listMenuApi(Integer id);

    ResponseResult insertMenu(Menu menu);

    ResponseResult updateMenu(Menu menu);

    ResponseResult deleteMenuById(Integer id);
}
