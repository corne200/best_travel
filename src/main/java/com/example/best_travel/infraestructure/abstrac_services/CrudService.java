package com.example.best_travel.infraestructure.abstrac_services;

public interface CrudService <RQ, RS, ID>{

    RS create(RQ request);

    RS read(ID id);

    RS update(RQ request, ID id);

    void delete(ID id);

}
