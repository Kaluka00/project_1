package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.config.SpringConfig;
import com.kaluka.domain.Password;
import com.kaluka.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;




    @Test
    public void testAddUser(){
        User user = new User(null,"赵六","123456","accounting");
        Boolean result = userService.add1(user);
        System.out.println(result);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser(){
        User user = new User(5,null,"654321",null);
        Boolean result = userService.update(user);
        System.out.println(result);
        System.out.println(user);
    }

    @Test
    public void testDeleteUserById(){
        Boolean result = userService.delete(6);
        System.out.println(result);
    }
    @Test
    public void testGetByPassword(){
        Password password = new Password(5,"123456");
        Boolean result = userService.getByPassword(password);
        System.out.println(result);
    }

    @Test
    public void testSelectUserById(){
        User allUser =userService.getById(1);
        System.out.println("User :" + allUser);
    }

    @Test
    public void testSelectAllUser(){
        PageInfo<User> allUser =userService.getAllUser(1);
        System.out.println(allUser);
    }


}
