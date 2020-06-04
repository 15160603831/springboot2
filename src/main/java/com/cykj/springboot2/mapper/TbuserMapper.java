package com.cykj.springboot2.mapper;

import com.cykj.springboot2.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TbuserMapper {

    public TbUser userlogin(TbUser tbUser); //查询登入账号和密码


}
