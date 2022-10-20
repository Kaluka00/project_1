package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.*;
import com.kaluka.domain.*;
import com.kaluka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 自动装配
     */
    @Resource
    private UserDao userDao;//自动代理,Idea设置问题，报错但没问题
    @Resource
    private SignDao signDao;
    @Resource
    private MoneyDao moneyDao;
    @Resource
    private WorkMoreDao workMoreDao;
    @Resource
    private TUserDao tUserDao;
    public boolean add(User user){
        boolean result = userDao.add(user);
        /*User user1 = new User();*/
        /*Integer id = user.getuId();*/

        return result;
    }
    public boolean add1(User user){
        boolean result = userDao.add(user);
        Integer id = user.getuId();
        Sign sign = new Sign(id,false);
        Money money = new Money(id,5000);
        TUser tUser = new TUser(id,null,null,null,null,null);
        WorkMore workMore = new WorkMore(id,0,false);
        signDao.addSign(sign);
        moneyDao.addMoney(money);
        tUserDao.addTUser(tUser);
        workMoreDao.addWorkMore(workMore);
        return result;
    }
    public boolean update(User user){
        boolean result = userDao.update(user);
        return result;
    }
    public boolean delete(Integer uId){
        signDao.deleteSign(uId);
        moneyDao.deleteMoney(uId);
        tUserDao.deleteTUser(uId);
        workMoreDao.deleteWorkMore(uId);
        boolean result = userDao.delete(uId);
        return result;
    }
    public PageInfo<User> getAllUser(int pageNum) {
        PageHelper.startPage(pageNum,10);
        List<User> posts = userDao.getAllUser();
        return new PageInfo<User>(posts);
    }
    public User getById(Integer uId){
        return userDao.getById(uId);
    }
    public boolean getByPassword(Password password){
        User user = userDao.getByPassword(password);
        if (user != null){
            return true;
        }
        return false;
    }




}
