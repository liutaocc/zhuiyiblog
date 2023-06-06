package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 字典表 服务类
 * </p>
 */
public interface DictService extends IService<Dict> {

    ResponseResult listDict(String name, Integer isPublish, String descColumn, String ascColumn);

    ResponseResult insertDict(Dict dict);

    ResponseResult updateDict(Dict dict);

    ResponseResult deleteDict(int id);

    ResponseResult deleteBatch(List<Long> list);

}
