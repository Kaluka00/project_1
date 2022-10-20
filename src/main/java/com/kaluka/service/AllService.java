package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.All;
import com.kaluka.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AllService {

    /*public List<All> getAll();*/
    PageInfo<All> getAll(int pageNum);

    public All getAllById(Integer uId);
}
