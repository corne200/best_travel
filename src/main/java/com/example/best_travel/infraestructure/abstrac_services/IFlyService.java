package com.example.best_travel.infraestructure.abstrac_services;

import com.example.best_travel.api.models.response.FlyResponse;

import java.util.Set;

public interface IFlyService extends CatalogService<FlyResponse> {

    Set<FlyResponse> readByOriginDestiny(String origen, String destiny);

}
