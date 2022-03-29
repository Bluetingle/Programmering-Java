package se.bluetingle.counter;
//package rep;

import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
        boolean spela = true;
        String fortsatt;

        Generator g = new Generator();
        while (spela = true) {
            try {
                g.guess();
            } catch (Exception e) {
                System.out.println("Potatisskalle inga decimaltal!!!!!!!! eller bokstaver");
            }
            Scanner svar = new Scanner(System.in);
            System.out.println("Spela igen? J/N" );
                fortsatt= svar.nextLine();
                    if(fortsatt.equalsIgnoreCase("J")){
                        spela = true;}
                    else if (fortsatt.equalsIgnoreCase("N")){
                        spela = false;
                        System.out.println("Tack för att du spelade!");
                        break;
                    }
        }
    }
    // Method to implement to return modified String
    static String extractInt(String str)
    {
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        if (str.equals(""))
            return "-1";

        return str;
    }
    public void guess () {
        int ranint = (new Random()).nextInt(100) + 1;
        String antal ;
        int fromstring;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Gissa nummer mellan 1 och 100:");
        do {
            antal = myObj.nextLine();
            antal = extractInt(antal);
            fromstring = Integer.parseInt(antal);
            if (fromstring > ranint)
                System.out.println("Du gissade för högt! Försök igen! :)"); //Hjälper spelaren att hitta rätt svar
            else
            if (fromstring < ranint)
                System.out.println("Du gissade för lågt! Försök igen! :)"); //Hjälper spelaren att hitta rätt svar
            //            if (fromstring != ranint) {
//                System.out.println("Du gissade: " + antal + " Det är fel, prova igen!");
//            }
        } while (fromstring != ranint);
        System.out.println("Grattis du gissade rätt!");
    }
}
