package com.kaluka.service;

import com.github.pagehelper.PageInfo;
import com.kaluka.domain.User;
import com.kaluka.domain.WorkMore;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface WorkMoreService {
    /**
     * 增加用户
     * @param workMore
     * @return
     */
    public boolean addWorkMore(WorkMore workMore);
    /**
     * 按id修改,请假与审批
     * @param workMore
     * @return
     */
    public boolean updateWorkMore(WorkMore workMore);
    /**
     * 按id删除
     * @param uId
     * @return
     */
    public boolean deleteWorkMore(Integer uId);
    /**
     * 查询所有员工加班情况
     * @return
     */
/*    public List<WorkMore> getAllUserWorkMore();*/
    PageInfo<WorkMore> getAllUserWorkMore(int pageNum);
    /**
     * 按id查找员工共加班情况
     * @param uId
     * @return
     */
    public WorkMore getWorkMoreById(Integer uId);
}
