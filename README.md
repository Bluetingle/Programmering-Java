# Programmering-Java
repository för kursen Java för testare

GENERATOR APP.JAVA

Generator.java är en app som slumpar fram ett tal mellan 1 och hundra.
Den består av en main metod och 2 andra metoder
Den fungerar enligt följande.
Först kommer en uppmaning om att mata in ett tal mellan 1 och 100. Man skriver då in ett tal och trycker på ”Enter”.  Efter inmatning får man besked ifall man gissat för högt eller för lågt och uppmanas försöka på nytt. Vid gissning av rätt tal får man besked att man gissat rätt och för frågan om man vill spela igen.
Väljer man att spela igen genereras ett nytt tal och man kan börja gissa igen. Väljer man att inte fortsätta kommer appen att avslutas.

Krav som finns på appen
•	Ska generera ett tal mellan 1 och 100
•	Ska inte krascha om text matas in
•	Att den inmatade textsträngen omvandlas till en integer
•	Att Metoden ska extractInt skalar bort text och bara behåller siffror

Hur den koden fungerar
Main
I main ligger en while loop som anropar metoden guess så länge som värdet för variabeln ”fortsatt” är satt till true. Efter varje loop av guess frågas efter svar om spelaren vill fortsätta eller inte. Beroende på svar så sätt variabeln ”fortsatt” till true eller false. Sätts ”fortsatt” till false kommer slingan att brytas och programmet avslutas.
Metoden extractInt
Denna metod används för att modifiera en sträng. Först så tar den bort alla tecken utom siffror och ersätter dem med blanksteg istället. I nästa steg trimmas alla blanksteg bort och sedan skickas det modifierade värdet tillbaks.
Metoden guess
Först genereras ett slumptal mellan 1 och 100. Sedan instansieras ett nytt Scannerobjekt. Scannerobjektet används för att ta emot tangentbordsinmatningar.
Efter att texten med att gissa ett tal kommit upp så startas do-while slinga där den tar värdet från tangentbordsinmatningen och skickar den till ”extractInt” för att plocka bort eventuella feltecken. Efter att ha fått tillbaka strängen omvandlas den till en integer med hjälp av Integer.parseInt(). Sedan jämför den värdet mot det som slumpades fram för att se om man gissat för högt, för lågt eller rätt. Gissar man rätt kommer do-while slingan att avbrytas och man hamnar tillbaka i main annars kommer man få en ledtråd och uppmanas gissa igen.

