package com.sda.javagdy4.api_rekrutacyjne;

import lombok.Data;

@Data
public class Rate {
    private String no;
    private String effectiveDate;
    private Double bid;
    private Double ask;
}