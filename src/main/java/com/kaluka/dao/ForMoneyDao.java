package com.kaluka.dao;

import com.kaluka.domain.ForMoney;
import com.kaluka.domain.Money;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ForMoneyDao {
    @Insert("insert into t_money values (#{mId},#{uId},#{nMoney},#{permit},#{pId},#{time})")
  /*  @Options(useGeneratedKeys = true, keyProperty = "mId", keyColumn = "m_id")*/
    public boolean addForMoney(ForMoney forMoney);

    boolean updateForMoney(ForMoney forMoney);


    @Delete("delete from t_money where m_id = #{mId}")
    public boolean deleteForMoney(Integer mId);

    @Select("select * from t_money where m_id = #{mId}")
    public ForMoney getForMoneyById(Integer mId);


    @Select("select * from t_money")
    public List<ForMoney> getAllForMoney();
}
