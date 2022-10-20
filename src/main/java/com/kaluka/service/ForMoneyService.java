package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.ForMoney;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ForMoneyService{
    /**
     * 申请资金
     * @param forMoney
     * @return
     */
    public boolean addForMoney(ForMoney forMoney);
    /**
     * 按id修改
     * @param forMoney
     * @return
     */
    public boolean updateForMoney(ForMoney forMoney);
    /**
     * 按id删除
     * @param mId
     * @return
     */
    public boolean deleteForMoney(Integer mId);
    /**
     * 查询所有员工
     * @return
     */
    /*public List<ForMoney> getAllForMoney();*/
    PageInfo<ForMoney> getAllForMoney(int pageNum);
    /**
     * 按id查找
     * @param mId
     * @return
     */
    public ForMoney getForMoneyById(Integer mId);
}