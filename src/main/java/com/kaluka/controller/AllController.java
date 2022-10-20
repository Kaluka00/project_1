package com.kaluka.controller;


import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.All;
import com.kaluka.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alls")
public class AllController {
    @Autowired
    private AllService allService;
    @GetMapping("/page/{pageNum}")
    public Result getAll(@PathVariable int pageNum) {
        PageInfo<All> result = allService.getAll(pageNum);
        Integer code = result != null ? Code.GET_OK : Code.GET_ERR;
        String msg = result != null ? "所有员工共基本数据查询结果如下" : "查询失败，请检查后再试";
        return new Result(msg, code, result);
    }
    @GetMapping("/{uId}")
    public Result getAllById(@PathVariable Integer uId) {
        All result = allService.getAllById(uId);
        Integer code = result != null ? Code.GET_OK : Code.GET_ERR;
        String msg = result != null ? "查询结果如下" : "查询失败，请检查工号是否正确";
        return new Result(msg, code, result);
    }
}