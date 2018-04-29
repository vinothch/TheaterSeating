package com.theater.service;

import java.util.List;

import com.theater.model.TheaterLayout;
import com.theater.model.TheaterRequest;

public interface TheaterSeatingService {
    
    TheaterLayout getTheaterLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(TheaterLayout layout, List<TheaterRequest> requests);

}
