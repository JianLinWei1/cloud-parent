package com.jian.client2service.TestHystrixImpl;

import com.jian.client2service.TestService;
import org.springframework.stereotype.Component;

/**
 * @auther JianLinWei
 * @date 2019/8/6 14:26
 */
@Component
public class TestServiceImpl   implements TestService {


    @Override
    public String get(String str) {
        return "error";
    }
}
