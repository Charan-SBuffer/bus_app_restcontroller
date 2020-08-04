package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.Vw_bus_complete_dataint;
import com.practise.model.VW_BUS_COMPLETE_DATA;


@Service
public class Vwbusservice implements VwbuserviceInt{

	@Autowired
	Vw_bus_complete_dataint vwint;

	public List<VW_BUS_COMPLETE_DATA> getallbuses() {
List<com.practise.model.VW_BUS_COMPLETE_DATA>	lv=vwint.getlistoffulldata();
return lv;
	}

	@Override
	public VW_BUS_COMPLETE_DATA getonID(String id) {
		// TODO Auto-generated method stub
		VW_BUS_COMPLETE_DATA vw=vwint.getonID(id);
		return vw;
	}

	@Override
	public List<VW_BUS_COMPLETE_DATA> getallbusesoftypes(String bustype) {
		// TODO Auto-generated method stub
		List<VW_BUS_COMPLETE_DATA> lbustypes=vwint.getlistofbusestype(bustype);
		return lbustypes;
	}

	@Override
	public void deletvwofid(String id) {
		vwint.deletvwbus(id);
		
	}

}
