package com.practise.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practise.model.TICKETHISTORY;
import com.practise.servise.TickethistoryserviceINT;

@CrossOrigin("*")
@RestController
public class Tickethistorycontroller1 {

	@Autowired
	TickethistoryserviceINT thistoryservicint;
		
	@PostMapping(value="/bookticket")
	public ResponseEntity<?> bookaticket(@RequestBody  String id ,String vwbustypeid){
		thistoryservicint.addbooking(id, vwbustypeid);
		
		return new ResponseEntity<String>("Sucess",HttpStatus.OK);
	}
	
	@RequestMapping(value="/getfullbookinghistory",method = RequestMethod.GET)
	public ResponseEntity<?> getallbookingd(){
		
		List<TICKETHISTORY > lth=thistoryservicint.getallbookinghistory();
		return new ResponseEntity<List<TICKETHISTORY >>(lth,HttpStatus.OK);
	}

}
