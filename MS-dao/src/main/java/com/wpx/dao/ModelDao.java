package com.wpx.dao;

import com.wpx.domain.Model;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelDao {
    @Select("select * from ttable where id=#{id}")
    Model Outprint(int id);
}
