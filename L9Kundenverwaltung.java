public class L9Kundenverwaltung {
    
    //Neuer Kunde generieren über L9 Privatkunden Konstruktor
    private IKunde kd1 = new L9Privatkunde(1000, "maier");
    private IKunde kd2 = new L9Geschaeftskunde(1000, 1250000);

    //Nutzen der berechneSteuern methode aus den klassen für die entsprechenden Kunden, die oben erzeugt wurden
    public void steuernAusgeben(){
        System.out.println("Steuer Privat: " + kd1.berechneSteuern());
        System.out.println("Steuer Geschaeftskunde: " + kd2.berechneSteuern());
    }
    

    public static void main(String[] args) {

        //neues objekt wird instanziert, um die methode auszugeben
        L9Kundenverwaltung kv = new L9Kundenverwaltung();
        kv.steuernAusgeben();

    }
}
