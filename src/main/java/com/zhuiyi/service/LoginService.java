package com.zhuiyi.service;


import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.dto.LoginDTO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public interface LoginService {

    Map<String, String> getCode(HttpServletResponse response) throws IOException;


    ResponseResult login(LoginDTO vo);
}
