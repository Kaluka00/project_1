package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.Sign;
import com.kaluka.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signs")
public class SignController {
    @Autowired
    private SignService signService;

    @PostMapping
    public Result Sign(){
        boolean result = signService.sign();
        return new Result(result ? "发起签到成功":"发起签到失败",result ? Code.ADD_OK:Code.ADD_ERR);
    }
    @DeleteMapping("/{uId}")
    public Result deleteSign(@PathVariable Integer uId){
        boolean result = signService.deleteSign(uId);
        return new Result(result ? "删除成功":"不存在此员工",result ? Code.DELETE_OK:Code.DELETE_ERR,uId);
    }
    @PutMapping("/{uId}")
    public Result sign(@PathVariable Integer uId){
        boolean result = signService.Sign(uId);
        return new Result(result ? "签到成功":"不存在此员工号码",result ? Code.UPDATE_OK:Code.UPDATE_ERR,uId);
    }
    @GetMapping("/{uSign}")
    public Result getSignById(@PathVariable Integer uSign){
        List<Sign> result = signService.getSignById(uSign);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，或没有此状态员工";
        return new Result(msg,code,result);
    }
    @GetMapping("/page/{pageNum}")
    public Result getAllUserSign(@PathVariable Integer pageNum){
        PageInfo<Sign> result = signService.getAllUserSign(pageNum);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败";
        return new Result(msg,code,result);
    }
}
