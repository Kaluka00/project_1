package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.AllMoneyDao;
import com.kaluka.domain.AllMoney;
import com.kaluka.domain.Money;
import com.kaluka.domain.User;
import com.kaluka.service.AllMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllMoneyServiceImpl implements AllMoneyService {
    @Autowired
    private AllMoneyDao allMoneyDao;

    public boolean addAllMoney(AllMoney allMoney) {
        boolean result = allMoneyDao.addAllMoney(allMoney);
        return result;
    }

    public boolean updateAllMoney(AllMoney allMoney) {
        boolean result = allMoneyDao.updateAllMoney(allMoney);
        return result;
    }

    public boolean deleteAllMoney(Integer aId) {
        boolean result = allMoneyDao.deleteAllMoney(aId);
        return result;
    }

    /*public List<AllMoney> getAllAllMoney() {

        return allMoneyDao.getAllAllMoney();
    }*/
    public PageInfo<AllMoney> getAllAllMoney(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<AllMoney> posts = allMoneyDao.getAllAllMoney();
        return new PageInfo<AllMoney>(posts);
    }

    public AllMoney getAllMoneyById(Integer aId) {
        return allMoneyDao.getAllMoneyById(aId);

    }
}
