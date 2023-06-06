package com.zhuiyi.strategy;

import com.zhuiyi.vo.ArticleSearchVO;

import java.util.List;

/**
 * @apiNote 搜索策略
 */
public interface SearchStrategy {
    /**
     * 搜索文章
     *
     * @param keywords 关键字
     * @return {@link List< ArticleSearchVO >} 文章列表
     */
    List<ArticleSearchVO> searchArticle(String keywords);
}
