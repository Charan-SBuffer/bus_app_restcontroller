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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.model.BUSSERVICE;

import com.practise.servise.BusserviceSERVICE;

@RestController
@CrossOrigin("*")
public class BusserviceController {
@Autowired
	BusserviceSERVICE bint;

@RequestMapping("/getallbusservices")
public ResponseEntity<?> getallbuses(){
	List<BUSSERVICE> bt=bint.getall();
	
	if(bt.size()>0) {
		return  new ResponseEntity<List<BUSSERVICE>>(bt,HttpStatus.OK);
	}
	else {
		return new ResponseEntity<String>("Failure",HttpStatus.NOT_ACCEPTABLE);
	}}

@GetMapping("/getbusserviceonID")
public ResponseEntity<?> getonID(@RequestParam("id") String id) {
	
	BUSSERVICE  bt=bint.getbusonID(id);
	if(bt!=null) {
		return new ResponseEntity<BUSSERVICE>(bt,HttpStatus.OK);
	}
	else {
		return new ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
	}
	
}
@PostMapping("/addbusservice")
public ResponseEntity<?> addbustype(@ModelAttribute("bt") BUSSERVICE  bt) {
	bint.addbus(bt);
	
	return new ResponseEntity<String>("Sucess",HttpStatus.OK);
}

@DeleteMapping("/deletbusservice")
public ResponseEntity<?> deletebustype(@RequestParam("id")String id){
	bint.deletebuss(id);
	return new ResponseEntity<String>("Sucess",HttpStatus.OK);
}


}
