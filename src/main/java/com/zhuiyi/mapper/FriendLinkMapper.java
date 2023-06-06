package com.zhuiyi.mapper;

import com.zhuiyi.vo.FriendLinkVO;
import com.zhuiyi.entity.FriendLink;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 友情链接表 Mapper 接口
 * </p>
 */
@Repository
public interface FriendLinkMapper extends BaseMapper<FriendLink> {

    Integer getMaxSort();

    void top(@Param("id") Integer id, @Param("sort") int sort);

    List<FriendLinkVO> selectLinkList(@Param("status") Integer status);

}
