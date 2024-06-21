package com.gilbert.invoice.services;

import com.gilbert.invoice.models.State;
import com.gilbert.invoice.repositories.StateRepo;
import com.gilbert.invoice.repositories.TaxRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StateTaxService {
    @Autowired
    private StateRepo stateRepo;
    @Autowired
    private TaxRepo taxRepo;

    public State createState(State state){
        return stateRepo.save(state);
    }
}
