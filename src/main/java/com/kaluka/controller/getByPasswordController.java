package com.kaluka.controller;

import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.Password;
import com.kaluka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passwords")//公共映射
public class getByPasswordController {
    @Autowired
    private UserService userService;


    @PostMapping
    public Result getAllUser(@RequestBody Password password){
        boolean result = userService.getByPassword(password);
        Integer code = result ? Code.GET_OK:Code.GET_ERR;
        String msg = result ? "登陆成功":"用户ID或密码错误";
        return new Result(msg,code,result);
    }
}
