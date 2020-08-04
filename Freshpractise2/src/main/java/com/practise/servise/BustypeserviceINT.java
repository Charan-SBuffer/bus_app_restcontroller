package com.practise.servise;

import java.util.List;

import com.practise.model.BUSTYPE;



public interface BustypeserviceINT {

	public List<BUSTYPE> getallbustypes();
	
	public boolean addbus(BUSTYPE bt);
	
	public boolean deletebustype(String id);
	
	public BUSTYPE getbusonID(String id);
	
	
}
