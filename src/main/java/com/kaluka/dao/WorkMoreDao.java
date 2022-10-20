package com.kaluka.dao;

import com.kaluka.domain.WorkMore;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WorkMoreDao {
    @Insert("insert into t_work values (#{uId},#{count},#{workMore})")
    public boolean addWorkMore(WorkMore workMore);

    @Update("update t_work set count = #{count},work_more = #{workMore} where u_id= #{uId}")
    public boolean updateWorkMore(WorkMore workMore);


    @Delete("delete from t_work where u_id = #{uId}")
    public boolean deleteWorkMore(Integer uId);


    @Select("select * from t_work where u_id = #{uId}")
    public WorkMore getWorkMoreById(Integer uId);


    @Select("select * from t_work")
    public List<WorkMore> getAllUserWorkMore();
}
