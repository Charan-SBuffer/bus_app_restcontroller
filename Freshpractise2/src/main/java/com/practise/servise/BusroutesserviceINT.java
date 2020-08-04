package com.practise.servise;

import java.util.List;

import com.practise.model.BUSROUTES;


public interface BusroutesserviceINT {
public List<BUSROUTES> getall();
	
	public BUSROUTES getbusonID(String id);
	
	public boolean addbus(BUSROUTES b);
	
	public boolean deletebuss(String b);
	
}
