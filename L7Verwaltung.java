public class L7Verwaltung {
    
public static void main(String[] args){
// erstellt neues objekt
    L7Auto auto = new L7Auto();

// settermethoden in action
    auto.setFahrgestellNr("4711");
    auto.setPs(120);
    auto.setHubraum(2.1f);
    auto.setTyp("golf 7");

// Ausgabe 
    System.out.println(auto.toString());
}

}
