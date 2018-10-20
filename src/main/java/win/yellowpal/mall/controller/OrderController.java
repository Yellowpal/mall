package win.yellowpal.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import win.yellowpal.mall.domain.Order;
import win.yellowpal.mall.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@RequestMapping("/order")
	@ResponseBody
	public String order(long userId,long itemId){
		Order order = orderService.getByUserIdAndItemId(userId, itemId);
		if(order != null){
			return "repeat";
		}
		
		long id = orderService.create(userId, itemId);
		
		return id+"";
	}
}
