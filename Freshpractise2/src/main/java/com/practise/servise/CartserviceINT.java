package com.practise.servise;

import java.util.List;

import com.practise.model.CART;
import com.practise.model.Message;

public interface CartserviceINT {

	public List<CART> getallcarts();
	public CART getcartonid(String id);
	public Message addtocart(CART cart);
}
