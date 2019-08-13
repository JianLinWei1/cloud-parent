package com.jian.client2service;

import com.jian.client2service.TestHystrixImpl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther JianLinWei
 * @date 2019/8/6 10:21
 */
@FeignClient(value = "eureka-client-1" , fallback = TestServiceImpl.class)
public interface TestService {

    @RequestMapping("/test/get")
    String  get( @RequestParam("str") String str);

}
