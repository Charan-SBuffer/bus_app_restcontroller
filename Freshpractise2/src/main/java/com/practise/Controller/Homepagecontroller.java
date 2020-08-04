package com.practise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.model.VW_BUS_COMPLETE_DATA;
import com.practise.servise.VwbuserviceInt;

@CrossOrigin(origins = "*")
@RestController
public class Homepagecontroller {

	@Autowired
	VwbuserviceInt fservice;
	

	@GetMapping(value = "/")
	public String Homepage() {
		return "index";

	}

	@GetMapping(value = "/getall")
	public ResponseEntity<?> getallvwbuses() {
		List<VW_BUS_COMPLETE_DATA> lf = fservice.getallbuses();
		if (lf.size() > 0) {
			return new ResponseEntity<List<VW_BUS_COMPLETE_DATA>>(lf, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Empty",HttpStatus.NOT_FOUND);
		}
	}
@GetMapping(value="/getbustypefromvw")
public ResponseEntity<?> getontype(@RequestParam("getbustype") String bt){
	List<VW_BUS_COMPLETE_DATA> lf = fservice.getallbusesoftypes(bt);
	if( lf.size()>0) {
		return new ResponseEntity<List<VW_BUS_COMPLETE_DATA>>(lf,HttpStatus.OK);
	}
	else {
		return new ResponseEntity<String>("NotFound",HttpStatus.NOT_FOUND);
	}
	}
@GetMapping(value="/getvwonid")
	public ResponseEntity<?> getvwonID(@RequestParam("bustypeid")String id){
		VW_BUS_COMPLETE_DATA vw=fservice.getonID(id);
		if(vw!=null) {
			return new ResponseEntity<VW_BUS_COMPLETE_DATA>(vw,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Empty",HttpStatus.NOT_FOUND);
		}
	}

}

