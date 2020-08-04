package com.practise.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practise.model.Message;
import com.practise.model.USER;
import com.practise.servise.UserserviceINT;

@CrossOrigin("*")
@RestController
public class UserController1 {

	@Autowired
	UserserviceINT userint;
	
	
	@GetMapping(value="/getallusers")
	public ResponseEntity<?> getallusers(){
		List<USER> lusers=userint.getallusers();
		return new ResponseEntity<List<USER>>(lusers,HttpStatus.OK);
	}
	
	@RequestMapping(value="/addnewuser",method=RequestMethod.POST)
	public ResponseEntity<?> adduser(@RequestBody USER user){
		String userid=userint.adduser(user);
		return new ResponseEntity<Message>(new Message("S","Signup sucessfull Your ID : "+userid),HttpStatus.OK);
	}
	
	@RequestMapping(value="/logincheck",method=RequestMethod.POST)
	public ResponseEntity<?> logincheck(@RequestBody USER user){
		boolean found=userint.loginceck(user.getId(), user.getPassword());
		//
		if(found==false) {
			return new ResponseEntity<Message>(new Message("W","The ID or Password might be incorrect"),HttpStatus.NOT_FOUND);
		}
		else {
			USER userobj=userint.getuseronid(user.getId());
			return new ResponseEntity<USER>(userobj,HttpStatus.OK);
	}}
	
	@RequestMapping(value="/getuseronid",method=RequestMethod.GET)
	public ResponseEntity<?> getuseronid(@RequestBody String id) {
		USER user=userint.getuseronid(id);
		if(user==null) {
			return new ResponseEntity<Message>(new Message("W","The ID or Password might be incorrect"),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<USER>(user,HttpStatus.OK);
	}
}
