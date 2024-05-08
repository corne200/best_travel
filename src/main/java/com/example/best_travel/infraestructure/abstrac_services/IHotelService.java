package com.example.best_travel.infraestructure.abstrac_services;

import com.example.best_travel.api.models.response.HotelResponse;

import java.util.Set;

public interface IHotelService extends CatalogService<HotelResponse> {

    Set<HotelResponse> readByRating(Integer rating);

}
