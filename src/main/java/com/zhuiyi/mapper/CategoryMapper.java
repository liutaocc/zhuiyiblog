package com.zhuiyi.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuiyi.vo.CategoryCountVO;
import com.zhuiyi.vo.CategoryVO;
import com.zhuiyi.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 博客分类表 Mapper 接口
 * </p>
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 分页获取分类
     * @param objectPage 分页对象
     * @param name 分类名
     * @return
     */
    Page<Category> selectCategory(@Param("page")Page<Category> objectPage, @Param("name")String name);

    /**
     * 统计分类
     * @return
     */
    List<CategoryCountVO> countArticle();

    /**
     * 首页获取所有分类
     * @return
     */
    List<CategoryVO> selectAll();

}
