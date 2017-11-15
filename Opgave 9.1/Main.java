/* Lavet af Mikkel Sørensen
Mikk4211@edu.easj.dk
EASJ Næstved, DAT 1 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Firkant firkant1 = new Firkant(4, 40);

        Firkant firkant2 = new Firkant(3.5, 35.9);

        // Data og resultat fra Firkant1
        System.out.println("Firkant 1: ");
        System.out.println("--");
        //Printer højden
        System.out.println("Højden er " + firkant1.højde);
        //Printer længden
        System.out.println("Længden er " + firkant1.længde);
        //Printer arealet
        System.out.println("Arealet er " + firkant1.getAreal());
        //Printer omkreds
        System.out.println("Omkredsen er " + firkant1.getOmkreds());

        //Data og resultat fra Firkant2
        System.out.println("Firkant 2: ");
        System.out.println("--");
        System.out.println("Højden er " + firkant2.højde);
        System.out.println("Længden er " + firkant2.længde);
        System.out.println("Arealet er " + firkant2.getAreal());
        System.out.println("Omkredsen er  " + firkant2.getOmkreds());






    }
}
