public class L8Verwaltung {
    
public static void main(String[] args){
// erstellt neues objekt
    L8Auto auto = new L8Auto();

//  settermethoden in action
    auto.setFahrgestellNr("4711");
    auto.setPs(120);
    auto.setHubraum(2.1f);
    auto.setTyp("golf 7");


// constructor test
/*    L8Auto auto2 = new L8Auto("penis", 169, "golf 8", 1.23f);
    L8Auto auto3 = new L8Auto("Golf 9");
    L8Auto auto4 = new L8Auto("vw", "penis", 169, "golf 8", 1.23f);

    // Ausgabe 
     System.out.println(auto.toString());
    System.out.println(auto2.toString());
    System.out.println(auto3.toString());
    System.out.println(auto4.toString()); */

    //Test ausgabe Constructor gewicht
/* dunno, fuinktioniert nicht als construktor 
    L8Auto auto5 = new L8Auto(105, 1000);
        auto5.setPs(1500); */

    L8Auto auto5 = new L8Auto(105);

try{
    System.out.println(auto5.berechneLeistungsgewicht(1000));
} catch (ArithmeticException aex){
    System.out.println("Fehler:" + aex );
}
//mit eigener Fehlkerbehandlung und Standardfehlermeldung aus StandardException konstruktor
try{
    System.out.println(auto5.berechneLeistungsgewichtMeldung(1000));
} catch (L8GewichtNullException gne) {
    System.out.println("Fehler:" + gne.getMessage());
}
// mit eiegner Fehlerbehandlung und eigener Fehlermeldung aus neuem Konstruktor
try{
    System.out.println(auto5.berechneLeistungsgewichtEigeneMeldung(1000));
} catch (L8GewichtNullException gne) {
    System.out.println("Fehler:" + gne.getMessage());
}


//Nullpointer Exception Stuff

L8Auto auto6 = new L8Auto("VW ", "1231", 105, "Kleinwagen", 1023);
System.out.println(auto6.toString());


//Ende
}}





