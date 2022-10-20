package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.TUserDao;
import com.kaluka.dao.UserDao;
import com.kaluka.domain.TUser;
import com.kaluka.domain.User;
import com.kaluka.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TUserServiceImpl implements TUserService{
    @Autowired

    private TUserDao tUserDao;//自动代理,Idea设置问题，报错但没问题
    public boolean addTUser(TUser tUser){
        boolean result = tUserDao.addTUser(tUser);
        return result;
    }
    public boolean updateTUser(TUser tUser){
        boolean result = tUserDao.updateTUser(tUser);
        return result;
    }
    public boolean deleteTUser(Integer uId){
        boolean result = tUserDao.deleteTUser(uId);
        return result;
    }
/*    public List<TUser> getAllTUser(){

        return tUserDao.getAllTUser();
    }*/
    public PageInfo<TUser> getAllTUser(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<TUser> posts = tUserDao.getAllTUser();
        return new PageInfo<TUser>(posts);
    }
    public TUser getTUserById(Integer uId){
        return tUserDao.getTUserById(uId);
    }
}
