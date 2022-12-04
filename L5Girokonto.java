public class L5Girokonto extends Lektion5 {
    //Erben Stand und KOntonummer, Methoden einzahlen und auszahlen und setter und getter
private double dispohoehe;

    public void setDispohoehe(double dH){
        this.dispohoehe = dH;
    }

    public double getDispohoehe(){
        return this.dispohoehe;
    }

    //Methode überschreiben und dadurch anders nutzen Override

    public void einzahlen(double einzahlungsbetrag){
        setStand(getStand() + einzahlungsbetrag-0.1);
    }

    //überladen 
    public void einzahlen(){
        
    }
}
