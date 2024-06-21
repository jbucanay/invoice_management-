package com.gilbert.invoice.controllers;

import com.gilbert.invoice.models.State;
import com.gilbert.invoice.services.StateTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stateTax")
public class StateTaxController {
    @Autowired
    private StateTaxService stateTaxService;

    @PostMapping
    public State saveAState(@RequestBody State state){
        System.out.println(state.toString());
        return stateTaxService.createState(state);
    }
}
