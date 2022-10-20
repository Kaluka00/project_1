package com.kaluka.dao;

import com.kaluka.domain.Money;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MoneyDao {
    @Insert("insert into money values (#{uId},#{uMoney})")
    public boolean addMoney(Money money);

    @Update("update money set u_money = #{uMoney} where u_id= #{uId}")
    public boolean updateMoney(Money money);


    @Delete("delete from money where u_id = #{uId}")
    public boolean deleteMoney(Integer uId);


    @Select("select * from money where u_id = #{uId}")
    public Money getMoneyById(Integer uId);

    @Select("select uMoney from money where u_id = #{uId}")
    public Integer getMoneysById(Integer uId);


    @Select("select * from money")
    public List<Money> getAllUserMoney();
}
