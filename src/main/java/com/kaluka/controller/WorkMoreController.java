package com.kaluka.controller;

import com.github.pagehelper.PageInfo;
import com.kaluka.controller.result.Code;
import com.kaluka.controller.result.Result;
import com.kaluka.domain.WorkMore;
import com.kaluka.service.WorkMoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works")
public class WorkMoreController {
    @Autowired
    private WorkMoreService workMoreService;

    @PostMapping
    public Result addWorkMore(@RequestBody WorkMore workMore){
        boolean result = workMoreService.addWorkMore(workMore);
        return new Result(result ? "申请成功，请等待审批":"添加失败请重新尝试",result ? Code.ADD_OK:Code.ADD_ERR,workMore);
    }
    @DeleteMapping("/{uId}")
    public Result deleteWorkMore(@PathVariable Integer uId){
        boolean result = workMoreService.deleteWorkMore(uId);
        return new Result(result ? "删除成功":"不存在此员工",result ? Code.DELETE_OK:Code.DELETE_ERR,uId);
    }
    @PutMapping
    public Result updateWorkMore(@RequestBody WorkMore workMore){
        boolean result = workMoreService.updateWorkMore(workMore);
        return new Result(result ? "审核成功":"不存在此员工号码",result ? Code.UPDATE_OK:Code.UPDATE_ERR,workMore);
    }
    @GetMapping("/{uId}")
    public Result getWorkMoreById(@PathVariable Integer uId){
        WorkMore result = workMoreService.getWorkMoreById(uId);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败，没有此员工";
        return new Result(msg,code,result);
    }
    @GetMapping("/page/{pageNum}")
    public Result getAllUserWorkMore(@PathVariable Integer pageNum){
        PageInfo<WorkMore> result = workMoreService.getAllUserWorkMore(pageNum);
        Integer code = result != null ? Code.GET_OK:Code.GET_ERR;
        String msg = result != null ? "查询结果如下":"查询失败";
        return new Result(msg,code,result);
    }
}
