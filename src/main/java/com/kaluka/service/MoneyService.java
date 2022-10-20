package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.Money;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MoneyService {
    /**
     * 增加用户
     * @param money
     * @return
     */
    public boolean addMoney(Money money);
    /**
     * 按id修改
     * @param money
     * @return
     */
    public boolean updateMoney(Money money);
    /**
     * 按id删除
     * @param uId
     * @return
     */
    public boolean deleteMoney(Integer uId);
    /**
     * 查询所有员工
     * @return
     */
    /*public List<Money> getAllUserMoney();*/
    PageInfo<Money> getAllUserMoney(int pageNum);
    /**
     * 按id查找
     * @param uId
     * @return
     */
    public Money getMoneyById(Integer uId);
}
