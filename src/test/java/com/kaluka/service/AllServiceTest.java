package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.config.SpringConfig;
import com.kaluka.domain.All;
import com.kaluka.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AllServiceTest {
    @Autowired
    private AllService allService;

    @Test
    public void testGetAll(){
        PageInfo<All> all = allService.getAll(1);
        System.out.println(all);
    }
    @Test
    public void testGetAllById(){
        All all = allService.getAllById(3);
        System.out.println(all);
    }
}
