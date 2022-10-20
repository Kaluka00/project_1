package com.kaluka.dao;

import com.kaluka.domain.Money;
import com.kaluka.domain.Sign;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SignDao {
    @Insert("insert into sign values (#{uId},#{uSign},#{time})")
    public boolean addSign(Sign sign);
    @Delete("delete from sign where u_id = #{uId}")
    public boolean deleteSign(Integer uId);
    @Update("update sign set u_sign = #{uSign},time=#{time} where u_id= #{uId}")
    public boolean updateSign(Sign sign);
    @Select("select * from sign where u_sign = #{uSign}")
    public List<Sign> getSignById(Integer uSign);
    @Select("select * from sign")
    public List<Sign> getAllUserSign();
    @Update("UPDATE SIGN SET u_sign=REPLACE(u_sign,'1','0')")
    public boolean sign();
    @Update("update sign set u_sign = true where u_id= #{uId}")
    boolean Sign(Integer uId);
}
