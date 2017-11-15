/* Lavet af Mikkel Sørensen
Mikk4211@edu.easj.dk
EASJ Næstved, DAT 1 */

package com.company;

public class Aktie {
    //Deklarerer variabler, uinstancierede.
    String symbol;
    String navn;

    double tidlPris;
    double nuvPris;

    //Arg constructor
    Aktie(String nySymbol, String nyNavn) {

        symbol = nySymbol;
        navn = nyNavn;
    }
    
    //Får differencen i %
    double getDiff() {

        return ((nuvPris - tidlPris) / tidlPris) * 100;

    }

}
