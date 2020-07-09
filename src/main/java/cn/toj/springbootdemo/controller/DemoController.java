package cn.toj.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/9
 */

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demoRequest() {

        return "request success.";

    }

}
