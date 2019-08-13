package com.jian.clien2Controller;

import com.jian.client2service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther JianLinWei
 * @date 2019/8/6 10:25
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/get")
    public  String  get(@RequestParam("str") String  str){
        System.out.println("调用了消费者client2" + str);
        return testService.get(str);
    }
}
