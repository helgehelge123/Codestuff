public class L8Auto extends L8Fahrzeug {
    
    private String fahrgestellNr;
    private int ps;
    private String typ;
    private float hubraum;
    private int gewicht;


//Constructor
    public L8Auto(){
    }


    public L8Auto(String fahrgestellNr, int ps, String typ, float hubraum) {
        this(fahrgestellNr);
        this.ps = ps;
        this.typ = typ;
        this.hubraum = hubraum;
    }

    public L8Auto(String hersteller, String fahrgestellNr, int ps, String typ, float hubraum) {
        super(hersteller);
        this.fahrgestellNr = fahrgestellNr;
        this.ps = ps;
        this.typ = typ;
        this.hubraum = hubraum;
    }

    public L8Auto(int ps, int gewicht){

    }
// Überladen funktioniert nur mit ungleichen parameterlisten
// Würde nicht funktionieren, weil es 2 Konstruktoren mit Strings gibt
 
    // public L8Auto(String fahrgestellNr){
    // this.fahrgestellNr = fahrgestellNr;
    // }
    public L8Auto(String fahrgestellNr){
        this();
        this.fahrgestellNr=fahrgestellNr;
    }


//setter
    public void setPs(int ps) {
        this.ps = ps;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }
    public void setFahrgestellNr(String fgnr) {
        this.fahrgestellNr = fgnr;
    }
    public void setGewicht(int gewicht){
        this.gewicht= gewicht;
    }

//gibt objekt als string aus
    public String toString(){
        return "Fahrgestellnummer:" + this.fahrgestellNr + ", " + this.typ + " mit " + this.hubraum + "l Hubraum und " + this.ps + "PS" + " von " + this.hersteller;
    }

//Leistungsgewicht berechnen, Exeption Beispiel

//Exception wird direkt im Programm gecatcht.
/*public float berechneLeistungsgewicht(int gewicht){
    float lg = 0;
    try{ //kritische anweisung
        lg = this.ps / gewicht;
    }
    catch(Exception e) {
        System.out.println("division durch 0");
    } //alles nach dem catch block, wird nicht ausgeführt, wenn fehler gefangen wird.
    finally {
        return lg;
    }
}
*/
//Exception wird per throw gehandled
public float berechneLeistungsgewicht(int gewicht) throws ArithmeticException{
    float lg = 0;
        lg = this.ps / gewicht;
        return lg;

}

}
