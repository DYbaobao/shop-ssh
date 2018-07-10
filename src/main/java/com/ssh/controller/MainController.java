package com.ssh.controller;

import com.ssh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/7/10.
 */
@Controller
public class MainController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "test", method = RequestMethod.GET )
    public  String test() {
      return  "test";
    }

    @RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }
}
