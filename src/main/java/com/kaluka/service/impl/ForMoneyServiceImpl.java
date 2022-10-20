package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.AllMoneyDao;
import com.kaluka.dao.ForMoneyDao;
import com.kaluka.domain.AllMoney;
import com.kaluka.domain.ForMoney;
import com.kaluka.domain.User;
import com.kaluka.service.ForMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForMoneyServiceImpl implements ForMoneyService {

    @Resource
    private ForMoneyDao forMoneyDao;
    @Resource
    private AllMoneyDao allMoneyDao;

    public boolean addForMoney(ForMoney forMoney) {
        boolean result = forMoneyDao.addForMoney(forMoney);
        return result;
    }

    public boolean updateForMoney(ForMoney forMoney) {
        forMoneyDao.updateForMoney(forMoney);
        if (forMoney.getPermit()){
            Integer money1 = allMoneyDao.getAllMoney();
            Integer money2 = forMoney.getnMoney();
            Integer allMoney = money1;
            allMoney = allMoney-money2;
            AllMoney money = new AllMoney(null,allMoney);
            allMoneyDao.addAllMoney(money);
        }
        return true;
    }

    public boolean deleteForMoney(Integer mId) {
        boolean result = forMoneyDao.deleteForMoney(mId);
        return result;
    }

    public ForMoney getForMoneyById(Integer mId) {
        return forMoneyDao.getForMoneyById(mId);

    }
   /* public List<ForMoney> getAllForMoney() {

        return forMoneyDao.getAllForMoney();
    }*/
    public PageInfo<ForMoney> getAllForMoney(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<ForMoney> posts = forMoneyDao.getAllForMoney();
        return new PageInfo<ForMoney>(posts);
    }
}
