package com.zhuiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuiyi.vo.SystemUserVO;
import com.zhuiyi.vo.UserVO;
import com.zhuiyi.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 系统管理-用户基础信息表 Mapper 接口
 * </p>
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    void insertBackId(User user);

    List<Integer> getMenuId(Integer userId);

    Page<UserVO> selectPageRecord(@Param("page") Page<UserVO> page, @Param("username")String username, @Param("loginType")Integer loginType);

    SystemUserVO getById(Object id);

    User selectNameAndPassword(@Param("username") String username, @Param("password") String password);

    void updateLoginInfo(@Param("loginId")Object loginId,@Param("ip") String ip, @Param("cityInfo")String cityInfo,
                         @Param("os") String os,@Param("browser") String browser);
}
