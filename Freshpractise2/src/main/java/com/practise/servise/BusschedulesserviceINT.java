package com.practise.servise;

import java.util.List;

import com.practise.model.BUSSCHEDULE;

public interface BusschedulesserviceINT {

	public List<BUSSCHEDULE > getallbusschedules();
	
	public boolean addbusschedule(BUSSCHEDULE  b);
	
	public boolean deletebus(String id);
	
	public BUSSCHEDULE  getbusonID(String id);
}
