package com.BikkadIT.IRCTCResourceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.IRCTCResourceApp.model.Passanger;
import com.BikkadIT.IRCTCResourceApp.model.Ticket;
import com.BikkadIT.IRCTCResourceApp.service.PassangerServiceI;

@RestController
public class PassangerController {
@Autowired
	private PassangerServiceI passangerServiceI;

@PostMapping(value="/bookTicket",produces="application/json",consumes="application/json")
public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg){
Ticket ticket=	passangerServiceI.bookTicket(psg);
	return new ResponseEntity(ticket,HttpStatus.CREATED);
}
}
