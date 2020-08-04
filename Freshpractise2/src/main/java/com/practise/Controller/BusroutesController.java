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

import com.practise.model.BUSROUTES;
import com.practise.servise.BusroutesserviceINT;

@RestController
@CrossOrigin("*")
public class BusroutesController {
	
	@Autowired
	BusroutesserviceINT bsint;
	
	@GetMapping("/getallbusroutes")
	public ResponseEntity<?> getallbuses(){
		
		List<BUSROUTES> lbr=bsint.getall();
		if(lbr.size()>0) {
			return new ResponseEntity<List<BUSROUTES>>(lbr,HttpStatus.OK);
		}
		else {
		
		return new ResponseEntity<String>("Not Foiund",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/getbusrouteonID")
	public ResponseEntity<?> getonID(@RequestParam("id")String id){
		BUSROUTES br=bsint.getbusonID(id);
		if(br!=null) {
			return new ResponseEntity<BUSROUTES>(br,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Fail",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/addbusroute")
	public ResponseEntity<?> addbusroute(@ModelAttribute("br")BUSROUTES br){
		
		bsint.addbus(br);
 return new ResponseEntity<String>("Sucess",HttpStatus.OK);		
	}
	
	@DeleteMapping("/deletbusroute")
	public ResponseEntity<?>   deletebusroute(@RequestParam("id")String id){
		return new ResponseEntity<String>("Sucess",HttpStatus.OK);
	}

}
