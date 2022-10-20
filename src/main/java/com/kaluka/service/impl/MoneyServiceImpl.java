package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.MoneyDao;
import com.kaluka.domain.Money;
import com.kaluka.domain.User;
import com.kaluka.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyDao moneyDao;

    public boolean addMoney(Money money) {
        boolean result = moneyDao.addMoney(money);
        return result;
    }

    public boolean updateMoney(Money money) {
        boolean result = moneyDao.updateMoney(money);
        return result;
    }

    public boolean deleteMoney(Integer uId) {
        boolean result = moneyDao.deleteMoney(uId);
        return result;
    }

    /*public List<Money> getAllUserMoney() {

        return moneyDao.getAllUserMoney();
    }*/
    public PageInfo<Money> getAllUserMoney(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Money> posts = moneyDao.getAllUserMoney();
        return new PageInfo<Money>(posts);
    }

    public Money getMoneyById(Integer uId) {
        return moneyDao.getMoneyById(uId);

    }
}
