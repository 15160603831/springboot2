package com.cykj.springboot2.controller;


import com.alibaba.fastjson.JSON;
import com.cykj.springboot2.entity.TbUser;
import com.cykj.springboot2.mapper.TbuserMapper;
import com.cykj.springboot2.service.TbUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tbuser")
public class MyFileController {
    @Autowired
    private TbUserservice tbUserservice;

    //1323
    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        TbUser tbUser = new TbUser();
        tbUser.setUserAcount("1");
        TbUser tbUser1 = tbUserservice.userlogin(tbUser);
        return JSON.toJSONString(tbUser1);
    }

}
