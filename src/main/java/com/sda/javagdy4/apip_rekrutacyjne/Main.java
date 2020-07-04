package com.sda.javagdy4.apip_rekrutacyjne;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NBPApiParameters parameters = new NBPApiParameters();

        loadAndSetCurrency(scanner, parameters);
    }

    private static void loadAndSetCurrency(Scanner scanner, NBPApiParameters parameters) {
        do {
            System.out.print("Please enter currency [dollar, euro, ruble]: ");
            Optional<NBPCurrency> optionalCurrency = NBPCurrency.parse(scanner.nextLine());
            if(optionalCurrency.isPresent()) {
                parameters.setCurrency(optionalCurrency.get());
            }
        } while (parameters.getCurrency() == null); // wykonuj pętle, dopóki currency == null
    }
}
