package com.cykj.springboot2.service;

import com.cykj.springboot2.entity.TbUser;
import com.cykj.springboot2.mapper.TbuserMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("tbUserServiceImp")
public class TbUserServiceImp implements TbUserservice {


    @Resource
//    @Autowired
    private TbuserMapper tbuserMapper;

    @Override
    public TbUser userlogin(TbUser tbUser) {
        return tbuserMapper.userlogin(tbUser);
    }


}
