package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.SignDao;
import com.kaluka.domain.Sign;
import com.kaluka.domain.User;
import com.kaluka.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignDao signDao;

    public boolean addSign(Sign sign) {
        boolean result = signDao.addSign(sign);
        return result;
    }

    public boolean updateSign(Sign sign) {
        boolean result = signDao.updateSign(sign);
        return result;
    }
    public boolean sign(){
        boolean result = signDao.sign();
        return result;
    }
    public boolean Sign(Integer uId){
        boolean result = signDao.Sign(uId);
        return result;
    }
    public boolean deleteSign(Integer uId) {
        boolean result = signDao.deleteSign(uId);
        return result;
    }

    /*public List<Sign> getAllUserSign() {

        return signDao.getAllUserSign();
    }*/
    public PageInfo<Sign> getAllUserSign(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sign> posts = signDao.getAllUserSign();
        return new PageInfo<Sign>(posts);
    }

    public List<Sign> getSignById(Integer uId) {
        return signDao.getSignById(uId);

    }
}
