package win.yellowpal.mall.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import win.yellowpal.mall.dao.OrderDao;
import win.yellowpal.mall.domain.Order;

@Service
public class OrderService {

	@Autowired
	OrderDao orderDao;
	
	@Autowired
	ItemService itemService;
	
	
	public Order getByUserIdAndItemId(long userId,long itemId){
		return orderDao.getByUserIdAndItemId(userId, itemId);
	}
	
	@Transactional
	public long create(long userId,long itemId){
		boolean result = itemService.reduceStock(1, itemId);
		long id = 0;
		if(result){
			System.out.println(Thread.currentThread().getName());
			
			Order order = new Order();
			order.setUserId(userId);
			order.setItemId(itemId);
			order.setSaleStock(1);
			order.setOrderTime(new Date());
			orderDao.insert(order);
			id = order.getId();
		}
		
		return id;
	}
}
