package com.kaluka.service;

import com.kaluka.config.SpringConfig;
import com.kaluka.domain.AllMoney;
import com.kaluka.domain.ForMoney;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AllMoneyServiceTest {
    @Autowired
    private AllMoneyService allMoneyService;

    @Test
    public void testAddAllMoney(){
        AllMoney allMoney = new AllMoney(2,450000000);
        allMoneyService.addAllMoney(allMoney);
        System.out.println(allMoney);
    }

    /*@Test
    public void testGetAllAllMoney(){
        List<AllMoney> all = allMoneyService.getAllAllMoney();
        System.out.println(all);
    }*/
}