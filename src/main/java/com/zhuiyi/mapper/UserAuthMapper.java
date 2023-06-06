package com.zhuiyi.mapper;

import com.zhuiyi.entity.UserAuth;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Repository
public interface UserAuthMapper extends BaseMapper<UserAuth> {

    void deleteByUserIds(@Param("ids") List<Integer> ids);

    UserAuth getByUserId(Object loginId);
}
