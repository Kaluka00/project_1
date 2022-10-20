package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.Money;
import com.kaluka.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/moneys")
    public class MoneyController {
        @Autowired
        private MoneyService moneyService;

        @PostMapping
        public Result addMoney(@RequestBody Money money){
            boolean result = moneyService.addMoney(money);
            return new Result(result ? "添加成功":"添加失败，请检查工号是否存在",result ? Code.ADD_OK:Code.ADD_ERR,money);
        }
        @DeleteMapping("/{uId}")
        public Result deleteMoney(@PathVariable Integer uId){
            boolean result = moneyService.deleteMoney(uId);
            return new Result(result ? "删除成功":"不存在此员工",result ? Code.DELETE_OK:Code.DELETE_ERR,uId);
        }
        @PutMapping
        public Result updateMoney(@RequestBody Money money){
            boolean result = moneyService.updateMoney(money);
            return new Result(result ? "修改成功":"不存在此员工号码",result ? Code.UPDATE_OK:Code.UPDATE_ERR,money);
        }
        @GetMapping("/{uId}")
        public Result getMoneyById(@PathVariable Integer uId){
            Money result = moneyService.getMoneyById(uId);
            Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
            String msg = result != null ? "查询结果如下":"查询失败，没有此员工";
            return new Result(msg,code,result);
        }
        @GetMapping("/page/{pageNum}")
        public Result getAllUserMoney(@PathVariable Integer pageNum){
            PageInfo<Money> result = moneyService.getAllUserMoney(pageNum);
            Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
            String msg = result != null ? "查询结果如下":"查询失败，请检查后再试";
            return new Result(msg,code,result);
        }
}
