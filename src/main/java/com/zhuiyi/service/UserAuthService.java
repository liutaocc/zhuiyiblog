package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.UserAuth;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.dto.EmailLoginDTO;
import com.zhuiyi.dto.EmailRegisterDTO;
import com.zhuiyi.dto.QQLoginDTO;
import com.zhuiyi.dto.UserAuthDTO;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface UserAuthService extends IService<UserAuth> {

    ResponseResult emailRegister(EmailRegisterDTO emailRegisterDTO);

    ResponseResult updatePassword(EmailRegisterDTO emailRegisterDTO);

    ResponseResult emailLogin(EmailLoginDTO emailLoginDTO);

    ResponseResult qqLogin(QQLoginDTO qqLoginDTO);

    ResponseResult weiboLogin(String code);

    ResponseResult giteeLogin(String code);

    ResponseResult sendEmailCode(String email);

    ResponseResult bindEmail(UserAuthDTO vo);

    ResponseResult updateUser(UserAuthDTO vo);

}
