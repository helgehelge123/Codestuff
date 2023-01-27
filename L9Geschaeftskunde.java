public class L9Geschaeftskunde implements IKunde, IUnternehmen{

//Attribute setzen
    private static double STEUERSATZ = 50;
    private double zinsen;
    private double umsatz;


//Konstruktor
    public L9Geschaeftskunde(double zinsen, double u) {
        this.zinsen = zinsen;
        this.umsatz = u;
    }

// implementierte Methode aus Interface IKunde
    @Override
    public double berechneSteuern() {
        return (this.zinsen+this.umsatz)*(STEUERSATZ/100);

    }
//Implementiere Methode aus Interface IUnternehmen
    @Override
    public void setGesellschaft(String gf) {
    System.out.println(gf);
        
    }
    
    


}
