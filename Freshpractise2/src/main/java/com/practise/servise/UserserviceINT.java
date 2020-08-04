package com.practise.servise;

import java.util.List;

import com.practise.model.USER;

public interface UserserviceINT {

	public List<USER> getallusers();
	public String adduser(USER user);
	public USER getuseronid(String id);
	public boolean loginceck(String id,String password);
}
