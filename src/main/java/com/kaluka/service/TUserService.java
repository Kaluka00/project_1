package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.TUser;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TUserService {
    /**
     * 增加用户基本信息
     * @param tUser
     * @return
     */
    public boolean addTUser(TUser tUser);
    /**
     * 按id修改用户基本信息
     * @param tUser
     * @return
     */
    public boolean updateTUser(TUser tUser);
    /**
     * 按id删除用户基本信息
     * @param uId
     * @return
     */
    public boolean deleteTUser(Integer uId);
    /**
     * 查询所有员工基本信息
     * @return
     */
    /*public List<TUser> getAllTUser();*/
    PageInfo<TUser> getAllTUser(int pageNum);
    /**
     * 按id查找员工基本信息
     * @param uId
     * @return
     */
    public TUser getTUserById(Integer uId);
}
