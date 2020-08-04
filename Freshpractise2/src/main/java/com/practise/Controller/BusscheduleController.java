package com.practise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.model.BUSSCHEDULE;
import com.practise.servise.BusschedulesserviceINT;

@RestController
@CrossOrigin("*")
public class BusscheduleController {

	@Autowired
	BusschedulesserviceINT bservice;
	
	@GetMapping("/getallbusschedules")
	public ResponseEntity<?> getallbusschedules(){
	List<BUSSCHEDULE > bs=	bservice.getallbusschedules();
	if(bs.size()>0) {
		return new ResponseEntity<List<BUSSCHEDULE>>(bs,HttpStatus.OK);

	}
	else {
		return new ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	}
		
	}
	
	
	@GetMapping("/getbusscheduleonID")
	public ResponseEntity<?> getScheduleonID(@RequestParam("id")String id){
		BUSSCHEDULE  bs=bservice.getbusonID(id);
		if(bs!=null) {
			return new ResponseEntity<BUSSCHEDULE >(bs,HttpStatus.OK); 
		}
		else {
			return new ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addbusschedule")
	public ResponseEntity<?> addbusschedule(@ModelAttribute ("bs") BUSSCHEDULE  bs){
		bservice.addbusschedule(bs);
		return new ResponseEntity<String>("Sucess",HttpStatus.OK);
		}
	
	@DeleteMapping("/deletebusschedule")
	public ResponseEntity<?> deletebusschedule(@RequestParam("id")String id){
		return new ResponseEntity<String>("Sucess",HttpStatus.OK);
		
	}
}
