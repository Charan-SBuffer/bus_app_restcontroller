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

import com.practise.model.BUS;

import com.practise.servise.BusServiceDAO;

@RestController
@CrossOrigin("*")
public class BusController {
	
	@Autowired
	BusServiceDAO bservice;
	
	@GetMapping("/getallbusses")
	public ResponseEntity<?> getallbuses(){
		
		List<BUS> lb=bservice.getall();
		if(lb.size()>0) {
			return new ResponseEntity<List<BUS>>(lb,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Empty",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/getonbusid")
	public ResponseEntity<?> getbusbasedonID(@RequestParam("id")String id){
		BUS b=bservice.getbusonID(id);
		if(b!=null) {
			return new ResponseEntity<BUS>(b,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Empty",HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@PostMapping("/addBus")
	public ResponseEntity<?> addbus(@ModelAttribute("b") BUS b){
		boolean added=bservice.addbus(b);
		if(added==false) {
			return new ResponseEntity<String>("Sucess",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Fail",HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deletbus")
	public ResponseEntity<?> deletebus(@RequestParam("id")String id)
	{
		boolean added=bservice.deletebuss(id);
		if(added==false) {
		return new ResponseEntity<String>("Sucess",HttpStatus.OK);}
		else {
			return new ResponseEntity<String>("False",HttpStatus.NOT_FOUND);
		}
		
	}

}
