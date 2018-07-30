package win.yellowpal.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import win.yellowpal.mall.domain.User;

@Mapper
public interface UserDao {
	
	
	@Select("select * from user where name = #{name} limit 1 ")
	public User getByName(@Param("name") String name);
}
