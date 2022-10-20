package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.config.SpringConfig;
import com.kaluka.domain.ForMoney;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ForMoneyServiceTest {
    @Autowired
    private ForMoneyService forMoneyService;

    @Test
    public void testAddAllForMoney(){
        ForMoney forMoney = new ForMoney(null,1,10000,false,0);
        forMoneyService.addForMoney(forMoney);
        System.out.println(forMoney);
    }

    @Test
    public void testUpdateForMoney(){
        ForMoney forMoney = new ForMoney(3,null,10000,true,1);
        forMoneyService.updateForMoney(forMoney);
        System.out.println(forMoney);
    }

    @Test
    public void testGetAllForMoney(){
        PageInfo<ForMoney> all = forMoneyService.getAllForMoney(1);
        System.out.println(all);
    }
}
