package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.Bustypeint;
import com.practise.model.BUSTYPE;


@Service
public class BussTypeerviceDAO implements BustypeserviceINT {

	@Autowired
	Bustypeint bint;
	@Override
	public List<BUSTYPE> getallbustypes() {
		// TODO Auto-generated method stub
		List<BUSTYPE> bt=bint.getallBustypes();
		return bt;
	}

	@Override
	public boolean addbus(BUSTYPE bt) {
		// TODO Auto-generated method stub
		bint.addbustype(bt);
		return false;
	}

	@Override
	public boolean deletebustype(String id) {
		// TODO Auto-generated method stub
		bint.deletbustype(id);
		return false;
	}

	@Override
	public BUSTYPE getbusonID(String id) {
		// TODO Auto-generated method stub
		BUSTYPE bt=bint.getbustypeonID(id);
		return bt;
	}

	
}
