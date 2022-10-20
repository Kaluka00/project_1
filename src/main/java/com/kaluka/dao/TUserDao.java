package com.kaluka.dao;

import com.kaluka.domain.TUser;
import com.kaluka.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TUserDao {
    @Insert("insert into t_user values (${uId},#{years},#{birth},#{eMail},#{hPeople},#{mPhone})")
    public boolean addTUser(TUser tUser);

    boolean updateTUser(TUser tUser);


    @Delete("delete from t_user where u_id = #{uId}")
    public boolean deleteTUser(Integer uId);


    @Select("select * from t_user where u_id = #{uId}")
    public TUser getTUserById(Integer uId);


    @Select("select * from t_user")
    public List<TUser> getAllTUser();
}
