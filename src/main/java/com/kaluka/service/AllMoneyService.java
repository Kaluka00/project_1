package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.AllMoney;
import com.kaluka.domain.ForMoney;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AllMoneyService{
    /**
     * 申请资金
     * @param allMoney
     * @return
     */
    public boolean addAllMoney(AllMoney allMoney);
    /**
     * 按id修改
     * @param allMoney
     * @return
     */
    public boolean updateAllMoney(AllMoney allMoney);
    /**
     * 按id删除
     * @param aId
     * @return
     */
    public boolean deleteAllMoney(Integer aId);
    /**
     * 查询所有员工
     * @return
     */
    /*public List<AllMoney> getAllAllMoney();*/
    PageInfo<AllMoney> getAllAllMoney(int pageNum);
    /**
     * 按id查找
     * @param aId
     * @return
     */
    public AllMoney getAllMoneyById(Integer aId);
}