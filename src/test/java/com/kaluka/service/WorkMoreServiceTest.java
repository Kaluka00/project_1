package com.kaluka.service;

import com.kaluka.config.SpringConfig;
import com.kaluka.domain.Money;
import com.kaluka.domain.User;
import com.kaluka.domain.WorkMore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class WorkMoreServiceTest {
    @Autowired
    private WorkMoreService workMoreService;

    @Test
    public void testAddUserWorkMore(){
        WorkMore workMore = new WorkMore(4,0,false);
        Boolean result = workMoreService.addWorkMore(workMore);
        System.out.println(result);
        System.out.println(workMore);
    }
    @Test
    public void testUpdateWorkMore(){
        WorkMore workMore = new WorkMore(3,0,true);
        Boolean result = workMoreService.updateWorkMore(workMore);
        System.out.println(result);
        System.out.println(workMore);
    }
    @Test
    public void testSelectWorkMoreById(){
        WorkMore workMore = workMoreService.getWorkMoreById(1);
        System.out.println("User :" + workMore);
    }
    /*@Test
    public void testSelectWorkMore(){
        List<WorkMore> allUser =workMoreService.getAllUserWorkMore();
        System.out.println(allUser);
    }*/
}