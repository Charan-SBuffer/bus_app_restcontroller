package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.Busint;
import com.practise.model.BUS;


@Service
public class BusServiceDAO implements BusServiceINT {
	
	@Autowired
	Busint bint;

	@Override
	public List<BUS> getall() {
		// TODO Auto-generated method stub
	List<BUS> lb = bint.getallbuses();
		return lb;
	}

	@Override
	public BUS getbusonID(String id) {
		// TODO Auto-generated method stub
		BUS b= bint.getbusonID(id);
		return b;
	}

	@Override
	public boolean addbus(BUS b) {
		// TODO Auto-generated method stub
		bint.addbus(b);
		return false;
	}

	@Override
	public boolean deletebuss(String id) {
		// TODO Auto-generated method stub
		bint.deletbud(id);
		return false;
	}
	

}
