package com.BikkadIT.IRCTCResourceApp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.IRCTCResourceApp.model.Ticket;

public interface TicketRepo  extends JpaRepository<Ticket, Integer>{

}
