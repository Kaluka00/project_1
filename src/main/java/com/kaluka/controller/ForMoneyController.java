package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.ForMoney;
import com.kaluka.service.ForMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forMoneys")//公共映射
public class ForMoneyController {
    @Autowired
    private ForMoneyService forMoneyService;

    @PostMapping
    public Result addForMoney(@RequestBody ForMoney forMoney){
        boolean result = forMoneyService.addForMoney(forMoney);
        return new Result(result ? "申请成功，请等待财务审核":"申请失败，请检查信息无误后重新申请",result ? Code.ADD_OK:Code.ADD_ERR,forMoney);
    }
    @DeleteMapping("/{mId}")
    public Result deleteForMoney(@PathVariable Integer mId){
        boolean result = forMoneyService.deleteForMoney(mId);
        return new Result(result ? "删除成功":"不存在此申请",result ? Code.DELETE_OK:Code.DELETE_ERR,mId);
    }
    @PutMapping
    public Result updateForMoney(@RequestBody ForMoney forMoney){
        boolean result = forMoneyService.updateForMoney(forMoney);
        return new Result(result ? "审核成功":"不存在此申请",result ? Code.UPDATE_OK:Code.UPDATE_ERR,forMoney);
    }
    @GetMapping("/{mId}")
    public Result getForMoneyById(@PathVariable Integer mId){
        ForMoney result = forMoneyService.getForMoneyById(mId);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，没有此申请";
        return new Result(msg,code,result);
    }
    @GetMapping("/page/{pageNum}")
    public Result getAllForMoney(@PathVariable Integer pageNum){
        PageInfo<ForMoney> result = forMoneyService.getAllForMoney(pageNum);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下，资金流水如下":"查询失败，请检查无误后再试";
        return new Result(msg,code,result);
    }
}

