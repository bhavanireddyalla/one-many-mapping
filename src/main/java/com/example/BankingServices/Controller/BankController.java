package com.example.BankingServices.Controller;

import com.example.BankingServices.Model.BankInfo;
import com.example.BankingServices.Repository.AccountRepository;
import com.example.BankingServices.Repository.Bankinforepository;
import com.example.BankingServices.dto.Bankinforequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unionbank")


public class BankController {
    @Autowired
    private Bankinforepository bankrepo;
    @Autowired
    private AccountRepository accountrepo;

    @PostMapping("/addaccounts")
    public BankInfo addaccounts(@RequestBody Bankinforequest bank){
        return bankrepo.save(bank.getBankinfo());
    }
}
