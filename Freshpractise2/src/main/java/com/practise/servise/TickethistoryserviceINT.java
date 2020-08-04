package com.practise.servise;

import java.util.List;

import com.practise.model.TICKETHISTORY;

public interface TickethistoryserviceINT {

	public List<TICKETHISTORY > getallbookinghistory();
	public void addbooking(String th,String vwbustypeid);
}
