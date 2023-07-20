package com.assesment.tax.controller;

import com.assesment.tax.response.Response;
import com.assesment.tax.service.TaxService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@WebMvcTest(TaxCalculator.class)
class TaxCalculatorTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaxService taxService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void calculateTax() throws Exception {
        //create dummy response
        Response mockResponse = new Response(1500d, "D", new String[]{"exampleClaim1", "exampleClaim2"});
        when(taxService.calculate(anyDouble())).thenReturn(mockResponse);

        double annualIncome = 50000d;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/tax")
                .param("annualIncome", String.valueOf(annualIncome))
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        Response response = objectMapper.readValue(result.getResponse().getContentAsString(), Response.class);

        assertEquals(1500, response.getTaxAmount());
        assertEquals("D", response.getTaxSlab());
        assertEquals(2, response.getTaxClaimOptions().length);
    }
}