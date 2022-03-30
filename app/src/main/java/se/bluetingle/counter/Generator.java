package se.bluetingle.counter;
//package rep;

import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
        boolean spela = true;
        String fortsatt;

        Generator g = new Generator();                                                // Instansiering av nytt objekt
//      Looper så länge man väljer att fortsätta
        while (spela = true) {
            try {
                g.guess();                                                            // Anropar guess metoden
            } catch (Exception e) {
                System.out.println("Potatisskalle inga decimaltal!!!!!!!! eller bokstaver");
            }
            Scanner svar = new Scanner(System.in);                                    // Nytt scanner objekt för att hämta in svar på om man vill fortsätta
            System.out.println("Spela igen? J/N" );
                fortsatt= svar.nextLine();                                            // svar inhämtas från tangentbordsinmatning
                    if(fortsatt.equalsIgnoreCase("J")){                    // Om svar j så sätts fortsatt till true
                        spela = true;}
                    else if (fortsatt.equalsIgnoreCase("N")){              // Om svar nej så sätt fortsatt till false
                        spela = false;
                        System.out.println("Tack för att du spelade!");
                        break;                                                        // Avbryter programmet
                    }
        }
    }

    // Metod att returnera en modifierad String
    static String extractInt(String str)
    {
        str = str.replaceAll("[^\\d]", " ");                          // Byter ut alla icke tecken som inte är siffror mellan 0-9 mot en blankrad
        str = str.trim();                                                             // Tar bort alla blankrader
        str = str.replaceAll(" +", " ");
        if (str.equals(""))                                                           // Om strängen är tom
            return "-1";                                                              // Returnera värdet -1
        return str;                                                                   // Returnerar strängen
    }
    public void guess () {
        int ranint = (new Random()).nextInt(100) + 1;                           // Genererar ett tal mella 1 och 100
        String antal ;
        int fromstring;

        Scanner myObj = new Scanner(System.in);                                       // instansiering av nytt scannerobject
        System.out.println("Gissa nummer mellan 1 och 100:");
//
//      Kör denna loop så länge som fromint inte matchar ranint
        do {
            antal = myObj.nextLine();                                                 // "antal" sätts till nästa rad som matas in från tangentbordet
            antal = extractInt(antal);                                                // kallar på metoden "extractint" för att få tillbaka en textsträng med bara siffror
            fromstring = Integer.parseInt(antal);                                     // Parsar strängen "antal" till en integer (omvandlar från String till int)
            if (fromstring > ranint)                                                  // För högt
                System.out.println("Du gissade för högt! Försök igen! :)");           // Hjälper spelaren att hitta rätt svar
            else
            if (fromstring < ranint)
                System.out.println("Du gissade för lågt! Försök igen! :)");          //Hjälper spelaren att hitta rätt svar
        } while (fromstring != ranint);
        System.out.println("Grattis du gissade rätt! rätt svar var "+ ranint);       // Om man gissat rätt!
    }
}
