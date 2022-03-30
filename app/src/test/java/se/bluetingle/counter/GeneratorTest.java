package se.bluetingle.counter;

import static org.junit.Assert.*;
import static se.bluetingle.counter.Generator.extractInt;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GeneratorTest {

    public static void main (String[] args){

    }

    @Test
    // Att ett tal mellan 1-100 genereras
    public void shouldGenerateNumber() throws Exception{
            int random = (new Random()).nextInt(100)+1;         // Genererar ett tal mellan 1 och 100
            int highest = 100;
            int lowest = 1;
            assertTrue("Error, random is too high", highest >= random); // Är värdet högre än tillåtet
            assertTrue("Error, random is too low",  lowest  <= random); // Är värdet lägre än tillåtet
            System.out.println("Test passed: " + random + " is within " + lowest + " and " + highest); // Värdet är inom gränsvärden
    }
    @Test
    public void shouldConvertToInt() throws Exception {
        // Att fromstring konventerar till integer
        String fromstring = "11";                                   // Strängen sätts till 11

        try {
            int parsed = Integer.parseInt(fromstring);              // Parsar från sträng till integer
            Integer.valueOf(parsed);                                // Sätter värdet till samma som värdet på integer "parsed". Om "parsed" inte är en integer kommer det inte att gå
            System.out.println(parsed + " är en integer!");
        } catch (NumberFormatException e) {                         // Om "parsed" inte är en integer fånga felet
            Assert.fail("Value '" + fromstring + " is not an Integer");
        }

    }

    @Test
    public void shouldBeAString() throws Exception {
// Att guess tar emot en sträng
        String antal = "null";
//      Kollar att det är en sträng
        if (antal != null) {                                // Om "antal" inte är null så är det en sträng
            System.out.println(antal + " Är en sträng");
            } else                                          // Om antal är null så är det inte en sträng
            {
                System.out.println(antal + " är inte en sträng");
            }
    }

    @Test
    public void  extractIntModifiesString() throws Exception{
        // Att extractint modifierar strängen
        String unmodifiedstr = "test123";                   // Sätter strängen till test123
        String modified = extractInt(unmodifiedstr);        // Anropar "extractInt" för att modifiera strängen
        System.out.println("Strängen som den ser ut från början: " + unmodifiedstr);
        System.out.println("Strängen ser nu ut så här: "+modified);     // Skriver ut den moddifierade strängen
    }
}