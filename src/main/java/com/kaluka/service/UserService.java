package com.kaluka.service;


import com.github.pagehelper.PageInfo;
import com.kaluka.domain.Money;
import com.kaluka.domain.Password;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    /**
     * 增加用户
     * @param user
     * @return
     */
    public boolean add(User user);
    public boolean add1(User user);
    /**
     * 按id修改
     * @param user
     * @return
     */
    public boolean update(User user);
    /**
     * 按id删除
     * @param uId
     * @return
     */
    public boolean delete(Integer uId);
    /**
     * 查询所有员工
     * @return
     */
     PageInfo<User> getAllUser(int pageNum);
    /**
     * 按id查找
     * @param uId
     * @return
     */
    public User getById(Integer uId);

    /**
     * 登录选项
     */
    public boolean getByPassword(Password password);
}
