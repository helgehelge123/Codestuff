public class L7Auto {
    
    private String fahrgestellNr;
    private int ps;
    private String Typ;
    private float hubraum;

//setter
    public void setPs(int ps) {
        this.ps = ps;
    }
    public void setTyp(String typ) {
        Typ = typ;
    }
    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }
    public void setFahrgestellNr(String fgnr) {
        this.fahrgestellNr = fgnr;
    }

    //gibt objekt als string aus
    public String toString(){
        return "Fahrgestellnummer:" + this.fahrgestellNr + ", " + this.Typ + " mit " + this.hubraum + "l Hubraum und " + this.ps + "PS.";
    }


}
