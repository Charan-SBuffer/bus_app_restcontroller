package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.UserINT;
import com.practise.model.USER;
@Service
public class UserserviceDAO implements UserserviceINT {

	@Autowired
	UserINT userint;
	
	@Override
	public List<USER> getallusers() {
		// TODO Auto-generated method stub
		List<USER> lu=userint.getallusers();
		return lu;
	}

	@Override
	public String adduser(USER user) {
		// TODO Auto-generated method stub
		String uid=userint.adduser(user);
return uid;
	}

	@Override
	public USER getuseronid(String id) {
		// TODO Auto-generated method stub
		USER user=userint.getuseronid(id);
		return user;
	}

	@Override
	public boolean loginceck(String id, String password) {
		// TODO Auto-generated method stub
		boolean found=userint.logincheck(id, password);
		return found;
	}

}
