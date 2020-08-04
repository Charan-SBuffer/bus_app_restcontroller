package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.Busroutesint;
import com.practise.model.BUSROUTES;

@Service
public class BusroutesserviceDAO implements BusroutesserviceINT {

	@Autowired
	Busroutesint broutesint;

	@Override
	public List<BUSROUTES> getall() {
		// TODO Auto-generated method stub
		List<BUSROUTES> lbr=broutesint.getallbusses();
		return lbr;
	}

	@Override
	public BUSROUTES getbusonID(String id) {
		// TODO Auto-generated method stub
		BUSROUTES br=broutesint.getbusrouteonID(id);
		return br;
	}

	@Override
	public boolean addbus(BUSROUTES b) {
		// TODO Auto-generated method stub
		broutesint.addbusroute(b);
		return false;
	}

	@Override
	public boolean deletebuss(String b) {
		// TODO Auto-generated method stub
		broutesint.deletbusroute(b);
		return false;
	}
	
}
