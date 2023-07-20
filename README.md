# tax-calculator
Source code for backend application, to run the application, type command : mvn spring-boot:run 
to build the application, type command : mvn clean install

Sample Request:
GET /tax?annualIncome=2100000

Response:
Content-Type: application/json
{
    "taxAmount": 1500.0,
    "taxSlab": "D",
    "taxClaimOptions": [
        "Individual and dependent relatives",
        "Medical treatment, special needs and carer expenses for parents (Medical condition certified by medical practitioner)",
        "Purchase of basic supporting equipment for disabled self, spouse, child or parent",
        "Disabled individual",
        "Education fees (Self):\nOther than a degree at masters or doctorate level – Course of study in law, accounting, islamic financing, technical, vocational, industrial, scientific or technology\nDegree at masters or doctorate level – Any course of study\nCourse of study undertaken for the purpose of upskilling or self-enhancement (Restricted to RM2,000)",
        "Medical expenses on:\nSerious diseases for self, spouse or child\nFertility treatment for self or spouse\nVaccination for self, spouse and child (Restricted to RM1,000)",
        "Expenses (Restricted to RM1,000) on:\nComplete medical examination for self, spouse or child\nCOVID-19 detection test including purchase of self-detection test kit for self, spouse or child\nMental health examination or consultation for self, spouse or child",
        "Lifestyle – Expenses for the use / benefit of self, spouse or child in respect of:\nPurchase or subscription of books / journals / magazines / newspapers / other similar publications (Not banned reading materials)\nPurchase of personal computer, smartphone or tablet (Not for business use)\nPurchase of sports equipment for sports activity defined under the Sports Development Act 1997 and payment of gym membership\nPayment of monthly bill for internet subscription (Under own name)",
        "Lifestyle – Additional relief for the use / benefit of self, spouse or child in respect of:\nPurchase of sports equipment for any sports activity as defined under the Sports Development Act 1997\nPayment of rental or entrance fee to any sports facility\nPayment of registration fee for any sports competition where the organizer is approved and licensed by the Commissioner of Sports under the Sports Development Act 1997",
        "Lifestyle – Purchase of personal computer, smartphone or tablet for own use / benefit or for spouse or child and not for business use",
        "Purchase of breastfeeding equipment for own use for a child aged 2 years and below (Deduction allowed once in every TWO (2) years of assessment)",
        "Child care fees to a registered child care centre / kindergarten for a child aged 6 years and below",
        "Net deposit in Skim Simpanan Pendidikan Nasional (Net deposit is the total deposit in 2022 MINUS total withdrawal in 2022)",
        "Husband / wife / payment of alimony to former wife",
        "Disabled husband / wife",
        "Each unmarried child and under the age of 18 years old",
        "Each unmarried child of 18 years and above who is receiving full-time education (\"A-Level\", certificate, matriculation or preparatory courses).",
        "Each unmarried child of 18 years and above that:\nreceiving further education in Malaysia in respect of an award of diploma or higher (excluding matriculation/ preparatory courses).\nreceiving further education outside Malaysia in respect of an award of degree or its equivalent (including Master or Doctorate).\nthe instruction and educational establishment shall be approved by the relevant government authority.",
        "Disabled child",
        "Additional exemption of RM8,000 disable child age 18 years old and above, not married and pursuing diplomas or above qualification in Malaysia @ bachelor degree or above outside Malaysia in program and in Higher Education Institute that is accredited by related Government authorities",
        "Life insurance and EPF\nPensionable public servant category who do not contribute to EPF or any approved scheme\nLife insurance premium\nOR\nOTHER than 16(i) category\nLife insurance premium (Restricted to RM3,000)\nContribution to EPF / approved scheme (Restricted to RM4,000)",
        "Deferred Annuity and Private Retirement Scheme (PRS)",
        "Education and medical insurance",
        "Contribution to the Social Security Organization (SOCSO)",
        "Domestic tourism expenses on:\nPayment of accommodation at the premises registered (Click here) with the Commissioner of Tourism under the Tourism Industry Act 1992\nPayment of entrance fee to a tourist attraction\nPurchase of domestic tour package through a licensed travel agent registered with the Commissioner of Tourism under the Tourism Industry Act 1992",
        "Expenses on charging facilities for Electric Vehicle (Not for business use)"
    ]
}