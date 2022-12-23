package com.BikkadIT.IRCTCResourceApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.IRCTCResourceApp.model.Passanger;
import com.BikkadIT.IRCTCResourceApp.model.Ticket;
import com.BikkadIT.IRCTCResourceApp.repositry.PassangerRepo;
import com.BikkadIT.IRCTCResourceApp.repositry.TicketRepo;

@Service
public class PassangerServiceImpl  implements PassangerServiceI{
	@Autowired
	private PassangerRepo passangerRepo;
	
	@Autowired
	private TicketRepo ticketRepo;

	@Override
	public Ticket bookTicket(Passanger psg) {
		 Passanger passanger = passangerRepo.save(psg);
		 if(passanger!=null) {
	Ticket ticket=ticketRepo.findById(1).get();
		 }
		return null;
	}

}
