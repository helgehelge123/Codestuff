public class L8Auto extends L8Fahrzeug {
    
    private String fahrgestellNr;
    private int ps;
    private String typ;
    private float hubraum;


//Constructor
    public L8Auto(){
    }
// // Überladen des Standartkostruktors
//     public L8Auto(String fahrgestellNr, int ps, String typ, float hubraum) {
//         this.fahrgestellNr = fahrgestellNr;
//         this.ps = ps;
//         this.typ = typ;
//         this.hubraum = hubraum;
//     }

// Überladen des Standartkostruktors und extends thingi? 
//Erklärung Wenn der Konstruktor aufgerufen wird, wird durch this(fahrgestellNr) der public L7Auto(String fahrgestellNr){...} konstruktor aufgerufen
// und durch dessen this(); wird der standardkonstruktor aufgerufen. Danach geht es weiter mit this.ps.....
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

//gibt objekt als string aus
    public String toString(){
        return "Fahrgestellnummer:" + this.fahrgestellNr + ", " + this.typ + " mit " + this.hubraum + "l Hubraum und " + this.ps + "PS" + " von " + this.hersteller;
    }


}
