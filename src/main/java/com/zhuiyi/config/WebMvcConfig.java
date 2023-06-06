package com.zhuiyi.config;

import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;
import com.zhuiyi.config.intercept.AccessLimitIntercept;
import com.zhuiyi.config.intercept.PageableInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @apiNote
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    // 通过读取配置项获取的文件上传路径
    @Value("${file.upload-folder}")
    private String UPLOAD_FOLDER;

    /**
     * 这里需要先将限流拦截器入住，不然无法获取到拦截器中的redistemplate
     *
     * @return
     */
    @Bean
    public AccessLimitIntercept getAccessLimitIntercept() {
        return new AccessLimitIntercept();
    }

    /**
     * 注册sa-token的拦截器，打开注解式鉴权功能 (如果您不需要此功能，可以删除此类)
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册注解拦截器，并排除不需要注解鉴权的接口地址 (与登录拦截器无关)
        registry.addInterceptor(new SaAnnotationInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/doLogin", "/img/**");
        //分页拦截器
        registry.addInterceptor(new PageableInterceptor());
        //IP限流拦截器
        registry.addInterceptor(getAccessLimitIntercept()).addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*
         * 资源映射路径
         * addResourceHandler:访问映射路径
         * addResourceLocations:资源绝对路径
         */
        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        //配置本地图片虚拟映射地址, 用于页面展示本地的图片
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + UPLOAD_FOLDER);
    }
}
