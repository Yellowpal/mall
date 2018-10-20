package win.yellowpal.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import win.yellowpal.mall.dao.ItemDao;
import win.yellowpal.mall.domain.Item;

@Service
public class ItemService {

	
	@Autowired
	ItemDao itemDao;
	
	public List<Item> listAll(){
		
		return itemDao.listAll();
	}
	
	
	public Item getById(long id){
		return itemDao.getById(id);
	}
	
	public boolean reduceStock(long saleStock, long id) {
		int ret = itemDao.updateStock(saleStock, id);
		return ret > 0;
	}
}
