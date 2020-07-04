package com.sda.javagdy4.api_rekrutacyjne;

import java.util.Optional;

public enum NBPCurrency {
    UNITED_STATES_DOLLAR("USD"),
    RUSSIAN_RUBLE("RUB"),
    EURO("EUR");

    private String shortName;

    NBPCurrency(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public static Optional<NBPCurrency> parse(String input) {
        if (input.toUpperCase().contains("DOLAR")) {
            return Optional.of(NBPCurrency.UNITED_STATES_DOLLAR);
        } else if (input.toUpperCase().contains("RUBEL")) {
            return Optional.of(NBPCurrency.RUSSIAN_RUBLE);
        } else if (input.toUpperCase().contains("EURO")) {
            return Optional.of(NBPCurrency.EURO);
        }
        return Optional.empty();
    }

}