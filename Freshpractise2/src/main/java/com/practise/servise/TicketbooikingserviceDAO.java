package com.practise.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.Dao.TicketbookINT;
import com.practise.model.TICKETHISTORY;
@Service
public class TicketbooikingserviceDAO implements TickethistoryserviceINT {
@Autowired
TicketbookINT tdao;
	@Override
	public List<TICKETHISTORY> getallbookinghistory() {
		// TODO Auto-generated method stub
		List<TICKETHISTORY> lth=tdao.getfullhistoryofbookings();
		return lth;
	}

	@Override
	public void addbooking(String th,String vwbustypeid) {
		// TODO Auto-generated method stub
tdao.addticketbooking(th,vwbustypeid);
	}

}
