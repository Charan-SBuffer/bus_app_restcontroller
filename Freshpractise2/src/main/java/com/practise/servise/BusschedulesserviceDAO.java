package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.BusscheduleINT;
import com.practise.model.BUSSCHEDULE;


@Service
public class BusschedulesserviceDAO implements BusschedulesserviceINT {

	@Autowired
	BusscheduleINT busint; 
	@Override
	public List<BUSSCHEDULE > getallbusschedules() {
		// TODO Auto-generated method stub
		List<BUSSCHEDULE > lbs=busint.getallbusschedule();
		return lbs;
	}

	@Override
	public boolean addbusschedule(BUSSCHEDULE  b) {
		// TODO Auto-generated method stub
		busint.addbusschedule(b);
		return false;
	}

	@Override
	public boolean deletebus(String id) {
		// TODO Auto-generated method stub
		busint.deletbusschedule(id);
		return false;
	}

	@Override
	public BUSSCHEDULE  getbusonID(String id) {
		// TODO Auto-generated method stub
		BUSSCHEDULE  bs=busint.getscheduleonID(id);
		return bs;
	}

}
