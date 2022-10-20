package com.kaluka.dao;

import com.kaluka.domain.*;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AllDao {
    @Select("select * from user")
        @Results({
            @Result(column = "u_id",property = "uId"),
            @Result(column = "u_name",property = "uName"),
            @Result(column = "u_password",property = "uPassword"),
            @Result(column = "u_grade",property = "uGrade"),
            @Result(column = "u_id",property = "money",javaType = Money.class, one = @One(select = "com.kaluka.dao.MoneyDao.getMoneyById")),
            @Result(column = "u_id",property = "sign",javaType = Sign.class, one = @One(select = "com.kaluka.dao.SignDao.getSignById")),
            @Result(column = "u_id",property = "workMore",javaType = WorkMore.class, one = @One(select = "com.kaluka.dao.WorkMoreDao.getWorkMoreById")),
            @Result(column = "u_id",property = "tUser",javaType = TUser.class, one = @One(select = "com.kaluka.dao.TUserDao.getTUserById")),
    })
    public List<All> getAll();

    @Select("select * from user where u_id = #{uId}")
    @Results({
            @Result(column = "u_id",property = "uId"),
            @Result(column = "u_name",property = "uName"),
            @Result(column = "u_password",property = "uPassword"),
            @Result(column = "u_grade",property = "uGrade"),
            @Result(column = "u_id",property = "money",javaType = Money.class, one = @One(select = "com.kaluka.dao.MoneyDao.getMoneyById")),
            @Result(column = "u_id",property = "sign",javaType = Sign.class, one = @One(select = "com.kaluka.dao.SignDao.getSignById")),
            @Result(column = "u_id",property = "workMore",javaType = WorkMore.class, one = @One(select = "com.kaluka.dao.WorkMoreDao.getWorkMoreById")),
            @Result(column = "u_id",property = "tUser",javaType = TUser.class, one = @One(select = "com.kaluka.dao.TUserDao.getTUserById")),
    })
    public All getAllById(Integer uId);
}
