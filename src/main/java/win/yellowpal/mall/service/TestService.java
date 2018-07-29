package win.yellowpal.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import win.yellowpal.mall.dao.TestDao;
import win.yellowpal.mall.domain.Test;

@Service
public class TestService {
	
	@Autowired
	TestDao testDao;
	
	public Test getById(int id){
		return testDao.getById(id);
	}
}
