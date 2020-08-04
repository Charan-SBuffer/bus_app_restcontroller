package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.CartINT;
import com.practise.model.CART;
import com.practise.model.Message;
@Service
public class CartserviceDAO implements CartserviceINT {

	@Autowired
	CartINT cint;
	
	public List<CART> getallcarts() {
		// TODO Auto-generated method stub
		List<CART> lcart=cint.getallcarts();
		return lcart;
	}

	public CART getcartonid(String id) {
		// TODO Auto-generated method stub\
		CART cart=cint.getcartonid(id);
		return cart;
	}

	public Message addtocart(CART id) {
		// TODO Auto-generated method stub
		Message mesage=cint.addtocart(id);
		return mesage;
	}

}
