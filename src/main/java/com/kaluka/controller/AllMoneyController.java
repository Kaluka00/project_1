package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.AllMoney;
import com.kaluka.service.AllMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allMoneys")//公共映射
public class AllMoneyController {
    @Autowired
    private AllMoneyService allMoneyService;

    @PostMapping
    public Result addAllMoney(@RequestBody AllMoney allMoney){
        boolean result = allMoneyService.addAllMoney(allMoney);
        return new Result(result ? "添加成功":"添加失败，请重新提交",result ? Code.ADD_OK:Code.ADD_ERR,allMoney);
    }
    @DeleteMapping("/{aId}")
    public Result deleteAllMoney(@PathVariable Integer aId){
        boolean result = allMoneyService.deleteAllMoney(aId);
        return new Result(result ? "删除成功":"不存在此流水",result ? Code.DELETE_OK:Code.DELETE_ERR,aId);
    }
    @PutMapping
    public Result updateAllMoney(@RequestBody AllMoney allMoney){
        boolean result = allMoneyService.updateAllMoney(allMoney);
        return new Result(result ? "修改成功":"不存在此流水号码",result ? Code.UPDATE_OK:Code.UPDATE_ERR,allMoney);
    }
    @GetMapping("/{aId}")
    public Result getAllMoneyById(@PathVariable Integer aId){
        AllMoney result = allMoneyService.getAllMoneyById(aId);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，没有此流水";
        return new Result(msg,code,result);
    }
    @GetMapping("/page/{pageNum}")
    public Result getAllAllMoney(@PathVariable Integer pageNum){
        PageInfo<AllMoney> result = allMoneyService.getAllAllMoney(pageNum);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，请检查后再试";
        return new Result(msg,code,result);
    }
}
