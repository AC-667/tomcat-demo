package com.mapper;

import com.prjo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    //用户登录
    @Select("select * from user where username=#{username} and password=#{password}")
    User select(@Param("username") String username,@Param("password") String password);

    @Select("select username from user where username=#{username}")
    User SeletName(String username);

    @Insert("insert into user values (#{username},#{password})")
    void insertUser(User user);
}
