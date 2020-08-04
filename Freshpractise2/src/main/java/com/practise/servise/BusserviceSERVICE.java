package com.practise.servise;

import java.util.List;

import com.practise.model.BUSSERVICE;

public interface BusserviceSERVICE {
public List<BUSSERVICE > getall();
	
	public BUSSERVICE  getbusonID(String id);
	
	public boolean addbus(BUSSERVICE  b);
	
	public boolean deletebuss(String b);
}
