package com.ssh.controller;

import com.ssh.service.TestService;
import com.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/7/10.
 */
@Controller
public class MainController {
    @Autowired
    private TestService testService;

    @Autowired
    private UserService userService;
    @RequestMapping(value = "test", method = RequestMethod.GET )
    public  String test() {
      return  "test";
    }

    @RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }

    @ResponseBody
    @RequestMapping(value = "saveUser" , method = RequestMethod.GET)
    public String saveUser() {
         userService.saveUser();
        return  "success!!!!!!";
    }

}
