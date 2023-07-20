package com.assesment.tax.service;

import com.assesment.tax.response.Response;
import com.assesment.tax.util.TaxUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TaxService {

    public Response calculate(Double annualIncome){
        List<Map<String, Object>> taxSlabs = TaxUtil.getTaxSlab();

        double result = 0;
        String taxSlab = "";

        for (int i = 0; i < taxSlabs.size(); i++) {
            double min = Double.valueOf((Double) taxSlabs.get(i).get("min"));
            double max = Double.valueOf((Double) taxSlabs.get(i).get("max"));
            double taxRate = Double.valueOf((Double) taxSlabs.get(i).get("rate"));

            if (annualIncome > min && annualIncome <= max) {
                result += (annualIncome - min) * (taxRate / 100);
                taxSlab = taxSlabs.get(i).get("category").toString();
                break;
            } else if (annualIncome > max) {
                result += (max - min) * (taxRate / 100);
            }
        }

        return new Response(result, taxSlab, getTaxClaimOptions());
    }

    public String[] getTaxClaimOptions(){
        List<Map<String, String>> taxReliefData = TaxUtil.getTaxClaimOptions();

        String[] taxReliefOptions = new String[taxReliefData.size()];
        for (int i = 0; i < taxReliefData.size(); i++) {
            taxReliefOptions[i] = taxReliefData.get(i).get("type");
        }

        return taxReliefOptions;
    }
}
