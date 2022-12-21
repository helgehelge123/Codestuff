public class L7Auto {
    
    private String fahrgestellNr;
    private int ps;
    private String typ;
    private float hubraum;


//Constructor
    public L7Auto(){

    }
// Überladen des Standartkostruktors
    public L7Auto(String fahrgestellNr, int ps, String typ, float hubraum) {
        this.fahrgestellNr = fahrgestellNr;
        this.ps = ps;
        this.typ = typ;
        this.hubraum = hubraum;
    }
// Überladen funktioniert nur mit ungleichen parameterlisten
// Würde nicht funktionieren, weil es 2 Konstruktoren mit Strings gibt
 
    // public L7Auto(String fahrgestellNr){
    // this.fahrgestellNr = fahrgestellNr;
    // }
    public L7Auto(String typ){
        this.typ=typ;
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
        return "Fahrgestellnummer:" + this.fahrgestellNr + ", " + this.typ + " mit " + this.hubraum + "l Hubraum und " + this.ps + "PS.";
    }


}
