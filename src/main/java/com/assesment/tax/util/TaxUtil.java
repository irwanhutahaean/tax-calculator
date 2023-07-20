package com.assesment.tax.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxUtil {
    public static final List<Map<String, Object>> getTaxSlab(){
        List<Map<String, Object>> taxSlabs = new ArrayList<>();
        taxSlabs.add(createMap("A", (double) 0, 5000d, (double) 0));
        taxSlabs.add(createMap("B", 5000d, 20000d, 1d));
        taxSlabs.add(createMap("C", 20000d, 35000d, 3d));
        taxSlabs.add(createMap("D", 35000d, 50000d, 6d));
        taxSlabs.add(createMap("E", 50000d, 70000d, 11d));
        taxSlabs.add(createMap("F", 70000d, 100000d, 19d));
        taxSlabs.add(createMap("G", 100000d, 400000d, 25d));
        taxSlabs.add(createMap("H", 400000d, 600000d, 26d));
        taxSlabs.add(createMap("I", 600000d, 2000000d, 28d));
        taxSlabs.add(createMap("J", 2000000d, 999999999d, 30d));

        return taxSlabs;
    }

    public static final List<Map<String, String>> getTaxClaimOptions(){
        List<Map<String, String>> taxClaimOptions = new ArrayList<>();
        taxClaimOptions.add(createMap("Individual and dependent relatives", "9,000"));
        taxClaimOptions.add(createMap("Medical treatment, special needs and carer expenses for parents (Medical condition certified by medical practitioner)", "8,000 (Restricted)"));
        taxClaimOptions.add(createMap("Purchase of basic supporting equipment for disabled self, spouse, child or parent", "6,000 (Restricted)"));
        taxClaimOptions.add(createMap("Disabled individual", "6,000"));
        taxClaimOptions.add(createMap("Education fees (Self):\nOther than a degree at masters or doctorate level – Course of study in law, accounting, islamic financing, technical, vocational, industrial, scientific or technology\nDegree at masters or doctorate level – Any course of study\nCourse of study undertaken for the purpose of upskilling or self-enhancement (Restricted to RM2,000)", "7,000 (Restricted)"));
        taxClaimOptions.add(createMap("Medical expenses on:\nSerious diseases for self, spouse or child\nFertility treatment for self or spouse\nVaccination for self, spouse and child (Restricted to RM1,000)", "8,000 (Restricted)"));
        taxClaimOptions.add(createMap("Expenses (Restricted to RM1,000) on:\nComplete medical examination for self, spouse or child\nCOVID-19 detection test including purchase of self-detection test kit for self, spouse or child\nMental health examination or consultation for self, spouse or child", ""));
        taxClaimOptions.add(createMap("Lifestyle – Expenses for the use / benefit of self, spouse or child in respect of:\nPurchase or subscription of books / journals / magazines / newspapers / other similar publications (Not banned reading materials)\nPurchase of personal computer, smartphone or tablet (Not for business use)\nPurchase of sports equipment for sports activity defined under the Sports Development Act 1997 and payment of gym membership\nPayment of monthly bill for internet subscription (Under own name)", "2,500 (Restricted)"));
        taxClaimOptions.add(createMap("Lifestyle – Additional relief for the use / benefit of self, spouse or child in respect of:\nPurchase of sports equipment for any sports activity as defined under the Sports Development Act 1997\nPayment of rental or entrance fee to any sports facility\nPayment of registration fee for any sports competition where the organizer is approved and licensed by the Commissioner of Sports under the Sports Development Act 1997", "500 (Restricted)"));
        taxClaimOptions.add(createMap("Lifestyle – Purchase of personal computer, smartphone or tablet for own use / benefit or for spouse or child and not for business use", "2,500 (Restricted)"));
        taxClaimOptions.add(createMap("Purchase of breastfeeding equipment for own use for a child aged 2 years and below (Deduction allowed once in every TWO (2) years of assessment)", "1,000 (Restricted)"));
        taxClaimOptions.add(createMap("Child care fees to a registered child care centre / kindergarten for a child aged 6 years and below", "3,000 (Restricted)"));
        taxClaimOptions.add(createMap("Net deposit in Skim Simpanan Pendidikan Nasional (Net deposit is the total deposit in 2022 MINUS total withdrawal in 2022)", "8,000 (Restricted)"));
        taxClaimOptions.add(createMap("Husband / wife / payment of alimony to former wife", "4,000 (Restricted)"));
        taxClaimOptions.add(createMap("Disabled husband / wife", "5,000"));
        taxClaimOptions.add(createMap("Each unmarried child and under the age of 18 years old", "2,000"));
        taxClaimOptions.add(createMap("Each unmarried child of 18 years and above who is receiving full-time education (\"A-Level\", certificate, matriculation or preparatory courses).", "2,000"));
        taxClaimOptions.add(createMap("Each unmarried child of 18 years and above that:\nreceiving further education in Malaysia in respect of an award of diploma or higher (excluding matriculation/ preparatory courses).\nreceiving further education outside Malaysia in respect of an award of degree or its equivalent (including Master or Doctorate).\nthe instruction and educational establishment shall be approved by the relevant government authority.", "8,000"));
        taxClaimOptions.add(createMap("Disabled child", "6,000"));
        taxClaimOptions.add(createMap("Additional exemption of RM8,000 disable child age 18 years old and above, not married and pursuing diplomas or above qualification in Malaysia @ bachelor degree or above outside Malaysia in program and in Higher Education Institute that is accredited by related Government authorities", "8,000"));
        taxClaimOptions.add(createMap("Life insurance and EPF\nPensionable public servant category who do not contribute to EPF or any approved scheme\nLife insurance premium\nOR\nOTHER than 16(i) category\nLife insurance premium (Restricted to RM3,000)\nContribution to EPF / approved scheme (Restricted to RM4,000)", "7,000 (Restricted)"));
        taxClaimOptions.add(createMap("Deferred Annuity and Private Retirement Scheme (PRS)", "3,000 (Restricted)"));
        taxClaimOptions.add(createMap("Education and medical insurance", "3,000 (Restricted)"));
        taxClaimOptions.add(createMap("Contribution to the Social Security Organization (SOCSO)", "350 (Restricted)"));
        taxClaimOptions.add(createMap("Domestic tourism expenses on:\nPayment of accommodation at the premises registered (Click here) with the Commissioner of Tourism under the Tourism Industry Act 1992\nPayment of entrance fee to a tourist attraction\nPurchase of domestic tour package through a licensed travel agent registered with the Commissioner of Tourism under the Tourism Industry Act 1992", "1,000 (Restricted)"));
        taxClaimOptions.add(createMap("Expenses on charging facilities for Electric Vehicle (Not for business use)", "2,500 (Restricted)"));

        return taxClaimOptions;
    }

    private static Map<String, Object> createMap(String category, Double min, Double max, Double rate){
        Map<String, Object> map = new HashMap<>();
        map.put("category", category);
        map.put("min", min);
        map.put("max", max);
        map.put("rate", rate);
        return map;
    }

    private static Map<String, String> createMap(String type, String amount){
        Map<String, String> map = new HashMap<>();
        map.put("type", type);
        map.put("amount", amount);
        return map;
    }

}
