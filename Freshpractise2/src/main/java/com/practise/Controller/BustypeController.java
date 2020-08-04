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

import com.practise.model.BUSTYPE;
import com.practise.servise.BustypeserviceINT;

/*
@RestController
@CrossOrigin("*")*/
@CrossOrigin("*")
@RestController
public class BustypeController {

	@Autowired
	BustypeserviceINT bint;
	
	@GetMapping("/getallbustypes")
	public ResponseEntity<?> getallbustypes(){
		
		List<BUSTYPE> bt=bint.getallbustypes();
		if(bt.size()>0) {
			return new ResponseEntity<List<BUSTYPE>>(bt,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Failure",HttpStatus.NOT_ACCEPTABLE);
		}
				
	}
	
	@GetMapping("/getbustypeonID")
	public ResponseEntity<?> getonID(@RequestParam("id") String id) {
		
		BUSTYPE bt=bint.getbusonID(id);
		if(bt!=null) {
			return new ResponseEntity<BUSTYPE>(bt,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Failure",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/addbustype")
	public ResponseEntity<?> addbustype(@ModelAttribute("bt") BUSTYPE bt) {
		bint.addbus(bt);
		
		return new ResponseEntity<String>("Sucess",HttpStatus.OK);
	}
	
@DeleteMapping("/deletebustype")
public ResponseEntity<?> deletebustype(@RequestParam("bustypeid")String id){
	bint.deletebustype(id);
	return new ResponseEntity<String>("Sucess",HttpStatus.OK);
}}
