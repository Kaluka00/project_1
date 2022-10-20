package com.kaluka.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaluka.dao.AllDao;
import com.kaluka.domain.All;
import com.kaluka.domain.User;
import com.kaluka.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AllServiceImpl implements AllService {
    @Autowired
    private AllDao allDao;

    /*public List<All> getAll() {
        return allDao.getAll();
    }*/
    public PageInfo<All> getAll(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<All> posts = allDao.getAll();
        return new PageInfo<All>(posts);
    }
    public All getAllById(Integer uId){return allDao.getAllById(uId);}
}
