package com.wenyu.p2p.mapper;

import com.wenyu.p2p.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByPhone(String phone);

    void updateByLastLongTime(@Param("id") Integer id,@Param("LastLongTime") Date date);
}