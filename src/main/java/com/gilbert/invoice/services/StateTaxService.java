package com.gilbert.invoice.services;

import com.gilbert.invoice.models.State;
import com.gilbert.invoice.repositories.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateTaxService {
    @Autowired
    private StateRepo stateRepo;

    public State createState(State state){
        System.out.println(state.toString());
        return stateRepo.save(state);
    }
}
