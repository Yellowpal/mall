package win.yellowpal.mall.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import win.yellowpal.mall.domain.Order;

@Mapper
public interface OrderDao {
	
	@Select("select * from orderinfo where userId=#{userId} and itemId=#{itemId} limit 1")
	public Order getByUserIdAndItemId(@Param("userId")long userId,@Param("itemId")long itemId);
	
	@Insert("insert into orderinfo (userId,itemId,saleStock,orderTime) values (#{userId},#{itemId},#{saleStock},#{orderTime})")
	@SelectKey(keyColumn="id",keyProperty="id",resultType=Long.class, before=false, statement="select last_insert_id()")
	public long insert(Order order);
}
