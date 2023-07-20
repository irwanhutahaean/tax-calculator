# tax-calculator
Source code for backend application, to run the application, type command : mvn spring-boot:run
to build the application, type command : mvn clean install

Sample Request:
GET /tax?annualIncome=50000

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
        ....
    ]
}