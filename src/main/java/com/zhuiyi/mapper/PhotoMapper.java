package com.zhuiyi.mapper;

import com.zhuiyi.entity.Photo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 照片 Mapper 接口
 * </p>
 */
@Repository
public interface PhotoMapper extends BaseMapper<Photo> {

    void movePhoto(@Param("idList") List<Integer> ids, @Param("albumId") Integer albumId);
}
