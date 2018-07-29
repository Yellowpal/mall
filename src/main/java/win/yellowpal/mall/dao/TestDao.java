package win.yellowpal.mall.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import win.yellowpal.mall.domain.Test;


@Mapper
public interface TestDao {
	
	@Select("select * from test where id=#{id}")
	public Test getById(@Param("id")int id);
}
