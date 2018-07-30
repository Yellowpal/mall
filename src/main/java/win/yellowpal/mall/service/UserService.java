package win.yellowpal.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import win.yellowpal.mall.dao.UserDao;
import win.yellowpal.mall.domain.User;
import win.yellowpal.mall.util.MD5Util;
import win.yellowpal.mall.vo.LoginVo;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public boolean login(LoginVo loginVo){
		if(loginVo == null){
			return false;
		}
		User user = userDao.getByName(loginVo.getName());
		if(user == null){
			return false;
		}
		
		if(user.getPassword().equals(MD5Util.md5(loginVo.getPassword()))){
			return true;
		}
		
		return false;
		
	}
}
