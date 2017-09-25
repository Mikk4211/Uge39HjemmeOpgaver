package com.company;

public class Main {

    public static void main(String[] args) {
        // Her skabes der er en ny aktie

        Aktie aktie = new Aktie("CB", "Carlsberg Bryggeri");

        // Så skal vi indtaste data for aktien
        aktie.tidlPris = 694.0;
        aktie.nuvPris = 700.0;

        // Her skriver jeg så forskellen mellem de to priser samt fortæller at der er en ny aktie
        System.out.println("Ny aktie  " + aktie.symbol + ". Navnet på firmaet: " + aktie.navn);
        System.out.println("Igår var prisen på aktien: " + aktie.tidlPris);
        System.out.println("Idag er prisen på aktien: " + aktie.nuvPris);
        System.out.println("Forskellen i pris: " + aktie.getDiff() + "%");





    }
}
