package com.assesment.tax.service;

import com.assesment.tax.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxServiceTest {

    @Test
    void getTaxClaimOptions() {
        TaxService taxService = new TaxService();
        String[] result = taxService.getTaxClaimOptions();
        Assertions.assertEquals(26, result.length);
    }

    @Test
    void calculate() {
        TaxService taxService = new TaxService();

        double income = 3000;
        Response response = taxService.calculate(income);
        Assertions.assertEquals(0, response.getTaxAmount());
        Assertions.assertEquals("A", response.getTaxSlab());
        Assertions.assertEquals(26, response.getTaxClaimOptions().length);

        double income2 = 20000;
        Response response2 = taxService.calculate(income2);
        Assertions.assertEquals(150, response2.getTaxAmount());
        Assertions.assertEquals("B", response2.getTaxSlab());

        double income3 = 600000;
        Response response3 = taxService.calculate(income3);
        Assertions.assertEquals(136400, response3.getTaxAmount());
        Assertions.assertEquals("H", response3.getTaxSlab());
    }

}