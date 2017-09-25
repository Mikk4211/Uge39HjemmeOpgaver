package com.company;

public class Aktie {

    String symbol;
    String navn;

    double tidlPris;
    double nuvPris;

    Aktie(String nySymbol, String nyNavn) {

        symbol = nySymbol;
        navn = nyNavn;
    }

    double getDiff() {

        return ((nuvPris - tidlPris) / tidlPris) * 100;

    }

}
