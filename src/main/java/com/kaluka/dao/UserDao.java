package com.kaluka.dao;

import com.kaluka.domain.All;
import com.kaluka.domain.Money;
import com.kaluka.domain.Password;
import com.kaluka.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Insert("insert into user values (#{uId},#{uName},#{uPassword},#{uGrade})")
    @Options(useGeneratedKeys = true, keyProperty = "uId", keyColumn = "u_id")
    public boolean add(User user);

/*    @Update("update user set u_name = #{uName},u_password = #{uPassword},u_grade = #{uGrade} where u_id= #{uId}")
    public */
    boolean update(User user);


    @Delete("delete from user where u_id = #{uId}")
    public boolean delete(Integer uId);


    @Select("select * from user where u_id = #{uId}")
    public User getById(Integer uId);
/*    //第一次注册默认为worker并获取ID
    @Select("select u_id from user where u_grade = worker")
    public Integer getId();*/

    @Select("select * from user where u_id = #{uId} and u_password = #{uPassword}")
    public User getByPassword(Password password);


    @Select("select * from user")
    public List<User> getAllUser();

}
