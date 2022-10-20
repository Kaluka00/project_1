package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.User;
import com.kaluka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//使用REST风格,控制器类
@RestController
@RequestMapping("/users")//公共映射
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result add(@RequestBody User user){
        boolean result = userService.add1(user);
        return new Result(result ? "添加成功":"添加失败",result ? Code.ADD_OK:Code.ADD_ERR,user);
    }
    @DeleteMapping("/{uId}")
    public Result delete(@PathVariable Integer uId){
        boolean result = userService.delete(uId);
        return new Result(result ? "删除成功":"不存在此员工",result ? Code.DELETE_OK:Code.DELETE_ERR,uId);
    }
    @PutMapping
    public Result update(@RequestBody User user){
        boolean result = userService.update(user);
        return new Result(result ? "修改成功":"不存在此员工号码",result ? Code.UPDATE_OK:Code.UPDATE_ERR,user);
    }
    @GetMapping("/{uId}")
    public Result getById(@PathVariable Integer uId){
        User result = userService.getById(uId);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，没有此员工";
        return new Result(msg,code,result);
    }
    @GetMapping("/page/{pageNum}")
    public Result getAllUser(@PathVariable Integer pageNum){
        PageInfo<User> result = userService.getAllUser(pageNum);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败";
        return new Result(msg,code,result);
    }



}
