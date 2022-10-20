package com.kaluka.dao;

import com.kaluka.domain.AllMoney;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AllMoneyDao {
    @Insert("insert into a_money values (#{aId},#{aMoney})")
    public boolean addAllMoney(AllMoney allMoney);

    @Update("update a_money set a_money = #{aMoney} where a_id= #{aId}")
    public boolean updateAllMoney(AllMoney allMoney);


    @Delete("delete from a_money where a_id = #{aId}")
    public boolean deleteAllMoney(Integer mId);

    @Select("select * from a_money where a_id = #{aId}")
    public AllMoney getAllMoneyById(Integer mId);


    @Select("select * from a_money")
    public List<AllMoney> getAllAllMoney();

    @Select("select a_money from a_money order by a_id desc limit 0,1")
    Integer getAllMoney();
}
