package com.kaluka.service;

import com.kaluka.config.SpringConfig;
import com.kaluka.domain.TUser;
import com.kaluka.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TUserServiceTest {
    @Autowired
    private TUserService tUserService;


    @Test
    public void testAddTUser() {
        TUser tUser = new TUser(4,23,20000101,"12346@qq.com",3,"1234567897");
        Boolean result = tUserService.addTUser(tUser);
        System.out.println(result);
        System.out.println(tUser);
    }
    @Test
    public void testUpdateTUser(){
        TUser tUser = new TUser(4,25,20000101,"12346@qq.com",3,"12345678972");
        Boolean result = tUserService.updateTUser(tUser);
        System.out.println(result);
        System.out.println(tUser);
    }
    /*@Test
    public void testSelectAllTUser(){
        List<TUser> allUser =tUserService.getAllTUser();
        System.out.println(allUser);
    }*/
}