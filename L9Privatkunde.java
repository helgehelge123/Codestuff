public class L9Privatkunde extends L9Person implements IKunde{

//Attribute für Klasse
    private static double ABGELTUNGSSTEUER = 25;
    private double zinsen;

//Konstruktor
    public L9Privatkunde(double zinsen, String n) {
        this.zinsen = zinsen;
        this.setName(n);
    }


//Implementierte Methode aus IKunde
    @Override
    public double berechneSteuern() {
        return zinsen*(ABGELTUNGSSTEUER/100);
    }
    


}
