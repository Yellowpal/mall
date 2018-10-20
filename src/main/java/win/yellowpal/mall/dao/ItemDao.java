package win.yellowpal.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import win.yellowpal.mall.domain.Item;

@Mapper
public interface ItemDao {
	
	
	@Select("select * from item")
	public List<Item> listAll();
	
	@Select("select * from item where id=#{id}")
	public Item getById(@Param("id")long id);
	
	@Update("update item set stock=stock-#{saleStock} where id=#{id} and stock-#{saleStock}>=0")
//	@Update("update item set stock=stock-#{saleStock} where id=#{id}")
	public int updateStock(@Param("saleStock")long saleStock,@Param("id")long id);

}
