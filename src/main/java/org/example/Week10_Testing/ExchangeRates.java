package org.example.Week10_Testing;

import java.util.Map;
import kong.unirest.Unirest;

import static input.InputUtils.doubleInput;

public class ExchangeRates {
    public static void main(String[] args) {

        String exchangeRateURL = "https://exchange-rates-1150.herokuapp.com/latest";

        Map<String, Object> params = Map.of("base", "USD", "symbols","EUR");

        RateResponse response = Unirest.get(exchangeRateURL)
                .queryString(params)
                .asObject(RateResponse.class)
                .getBody();
        double exchangeRate = response.rates.EUR;
        String dateRequested = response.date;
        System.out.println("The conversion rate between USD and Euro is " + exchangeRate);
        double dollars = doubleInput("Enter number of dollars to convert to euros: ");
        double euros = dollars * exchangeRate;
        System.out.printf("%.2f dollars is equivalent to %.2f euros", dollars, euros);
    }
}
class RateResponse {
    public Rates rates;
    public String base;
    public String date;
}

class Rates {
    public double EUR;
}