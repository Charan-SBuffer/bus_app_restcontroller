package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.BusserviceINT;
import com.practise.model.BUSSERVICE;

@Service
public class BusserviceServiceDAO implements BusserviceSERVICE {

	@Autowired
	BusserviceINT bint;
	
	@Override
	public List<BUSSERVICE > getall() {
		// TODO Auto-generated method stub
		List<BUSSERVICE > lbs=bint.getallbuses();
		return lbs;
	}

	@Override
	public BUSSERVICE  getbusonID(String id) {
		// TODO Auto-generated method stub
		BUSSERVICE  bs= bint.getserviceID(id);
		return bs;
	}

	@Override
	public boolean addbus(BUSSERVICE  b) {
		// TODO Auto-generated method stub
		bint.addbusservice(b);
		return false;
	}

	@Override
	public boolean deletebuss(String b) {
		// TODO Auto-generated method stub
		bint.deletbusservice(b);
		return false;
	}

}
