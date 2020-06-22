package com.wenyu.p2p.mapper;

import com.wenyu.p2p.model.FinanceAccount;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FinanceAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinanceAccount record);

    int insertSelective(FinanceAccount record);

    FinanceAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinanceAccount record);

    int updateByPrimaryKey(FinanceAccount record);
}