package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.WorkMoreDao;
import com.kaluka.domain.WorkMore;
import com.kaluka.domain.User;
import com.kaluka.service.WorkMoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkMoreServiceImpl implements WorkMoreService {
    @Autowired
    private WorkMoreDao workMoreDao;//自动代理,Idea设置问题，报错但没问题
    public boolean addWorkMore(WorkMore workMore){
        boolean result = workMoreDao.addWorkMore(workMore);
        return result;
    }
    public boolean updateWorkMore(WorkMore workMore){
        boolean result = workMoreDao.updateWorkMore(workMore);
        return result;
    }
    public boolean deleteWorkMore(Integer uId){
        boolean result = workMoreDao.deleteWorkMore(uId);
        return result;
    }
    public PageInfo<WorkMore> getAllUserWorkMore(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<WorkMore> posts = workMoreDao.getAllUserWorkMore();
        return new PageInfo<WorkMore>(posts);
    }
    public WorkMore getWorkMoreById(Integer uId){
        return workMoreDao.getWorkMoreById(uId);

    }
}
