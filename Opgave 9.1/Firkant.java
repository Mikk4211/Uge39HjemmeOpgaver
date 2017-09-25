package com.company;

public class Firkant {

    double længde;
    double højde;

    // Constructor
    Firkant(double nyHøjde, double nyLængde) {

        højde = nyHøjde;
        længde = nyLængde;

    }

    // Arealet som double, da arealet godt kan være i decimaltal
    double getAreal() {

        return længde * højde;

    }

    // Omkredsen som double, da omkredsen ligeså også kan være i decimaltal
    double getOmkreds() {

        return (2 * (længde + højde));
    }
}
