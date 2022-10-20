package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.config.SpringConfig;
import com.kaluka.domain.Money;
import com.kaluka.domain.Sign;
import com.kaluka.domain.User;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SignServiceTest {
    @Autowired
    private SignService signService;

    @Test
    public void testAddUserSign(){
        Sign sign = new Sign(1,false);
        Boolean result = signService.addSign(sign);
        System.out.println(result);
        System.out.println(sign);
    }
    @Test
    public void testSelectAllUserSign(){
        PageInfo<Sign> allUser =signService.getAllUserSign(1);
        System.out.println(allUser);
    }
    @Test
    public void testSign1(){
        Sign sign = new Sign(2,true);
        signService.updateSign(sign);
    }

    @Test
    public void testSign(){
        signService.Sign(1);
    }
}