package io.github.hlg212.task.xxl.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * xxl 接口认证
 * @author huangligui
 * @since 2022/7/23 14:57
 */
public class XxlAuthRequestInterceptor implements RequestInterceptor {

    // todo 临时认证； 后期增加动态认证；
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String cookie = "XXL_JOB_LOGIN_IDENTITY=7b226964223a312c22757365726e616d65223a2261646d696e222c2270617373776f7264223a226531306164633339343962613539616262653536653035376632306638383365222c22726f6c65223a312c227065726d697373696f6e223a6e756c6c7d";
        requestTemplate.header("Cookie",cookie);

    }
}
