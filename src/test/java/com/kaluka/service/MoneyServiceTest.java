package com.kaluka.service;

import com.kaluka.config.SpringConfig;
import com.kaluka.domain.Money;
import com.kaluka.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class MoneyServiceTest {
    @Autowired
    private MoneyService moneyService;

    @Test
    public void testAddUserMoney(){
        Money money = new Money(1,15000);
        Boolean result = moneyService.addMoney(money);
        System.out.println(result);
        System.out.println(money);
    }

    /*@Test
    public void testSelectAllMoney(){
        List<Money> allUser =moneyService.getAllUserMoney();
        System.out.println(allUser);
    }*/
}
