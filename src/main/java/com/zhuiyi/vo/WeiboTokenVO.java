package com.zhuiyi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微博token
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeiboTokenVO {

    /**
     * 微博uid
     */
    private String uid;

    /**
     * 访问令牌
     */
    private String access_token;

}
