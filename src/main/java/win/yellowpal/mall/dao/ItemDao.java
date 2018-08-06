package win.yellowpal.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import win.yellowpal.mall.domain.Item;

@Mapper
public interface ItemDao {
	
	
	@Select("select * from item")
	public List<Item> listAll();
	
	@Select("select * from item where id=#{id}")
	public Item getById(@Param("id")long id);

}
