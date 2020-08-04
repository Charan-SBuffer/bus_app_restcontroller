package com.practise.servise;

import java.util.List;

import com.practise.model.BUS;

public interface BusServiceINT {

	public List<BUS> getall();
	
	public BUS getbusonID(String id);
	
	public boolean addbus(BUS b);
	
	public boolean deletebuss(String b);
}
