package com.example.best_travel.infraestructure.abstrac_services;

import com.example.best_travel.api.models.request.TicketRequest;
import com.example.best_travel.api.models.response.TicketResponse;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public interface ITicketService extends CrudService<TicketRequest, TicketResponse, UUID> {

    BigDecimal findPrice(Long flyId);

}
