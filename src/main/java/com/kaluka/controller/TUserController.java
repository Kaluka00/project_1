package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.TUser;
import com.kaluka.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tUsers")//公共映射
public class TUserController {
    @Autowired
    private TUserService tUserService;

    @PostMapping
    public Result addTUser(@RequestBody TUser tUser){
        boolean result = tUserService.addTUser(tUser);
        return new Result(result ? "添加成功":"添加失败",result ? Code.ADD_OK:Code.ADD_ERR,tUser);
    }
    @DeleteMapping("/{uId}")
    public Result deleteTUser(@PathVariable Integer uId){
        boolean result = tUserService.deleteTUser(uId);
        return new Result(result ? "删除成功":"不存在此员工",result ? Code.DELETE_OK:Code.DELETE_ERR,uId);
    }
    @PutMapping
    public Result updateTUser(@RequestBody TUser tUser){
        boolean result = tUserService.updateTUser(tUser);
        return new Result(result ? "修改成功":"不存在此员工号码",result ? Code.UPDATE_OK:Code.UPDATE_ERR,tUser);
    }
    @GetMapping("/{uId}")
    public Result getTUserById(@PathVariable Integer uId){
        TUser result = tUserService.getTUserById(uId);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，没有此员工";
        return new Result(msg,code,result);
    }
    @GetMapping("/page/{pageNum}")
    public Result getAllTUser(@PathVariable Integer pageNum){
        PageInfo<TUser> result = tUserService.getAllTUser(pageNum);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败";
        return new Result(msg,code,result);
    }
}