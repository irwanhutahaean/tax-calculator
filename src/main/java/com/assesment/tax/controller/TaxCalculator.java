package com.assesment.tax.controller;

import com.assesment.tax.response.Response;
import com.assesment.tax.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaxCalculator {

    private final TaxService taxService;

    @Autowired
    public TaxCalculator(TaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping("/tax")
    public ResponseEntity<Response> calculateTax(@RequestParam Double annualIncome){
        Response response = taxService.calculate(annualIncome);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
