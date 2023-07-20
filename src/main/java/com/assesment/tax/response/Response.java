package com.assesment.tax.response;

public class Response {
    private Double taxAmount;
    private String taxSlab;
    private String[] taxClaimOptions;

    public Response() {}

    public Response(Double taxAmount, String taxSlab, String[] taxClaimOptions) {
        this.taxAmount = taxAmount;
        this.taxSlab = taxSlab;
        this.taxClaimOptions = taxClaimOptions;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxSlab() {
        return taxSlab;
    }

    public void setTaxSlab(String taxSlab) {
        this.taxSlab = taxSlab;
    }

    public String[] getTaxClaimOptions() {
        return taxClaimOptions;
    }

    public void setTaxClaimOptions(String[] taxClaimOptions) {
        this.taxClaimOptions = taxClaimOptions;
    }
}
