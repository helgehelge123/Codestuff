public class L7Verwaltung {
    
public static void main(String[] args){
// erstellt neues objekt
    L7Auto auto = new L7Auto();

//  settermethoden in action
    auto.setFahrgestellNr("4711");
    auto.setPs(120);
    auto.setHubraum(2.1f);
    auto.setTyp("golf 7");


// constructor test
    L7Auto auto2 = new L7Auto("penis", 169, "golf 8", 1.23f);
    L7Auto auto3 = new L7Auto("Golf 9");

    // Ausgabe 
    System.out.println(auto.toString());
    System.out.print(auto2.toString());
    System.out.print(auto3.toString());
}

}
