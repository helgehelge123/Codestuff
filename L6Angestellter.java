public class L6Angestellter extends L6Mitarbeiter {

    private double ortszuschlag = 750;

    @Override
    public double monatsBrutto() {
        double ergebnis = 0;
        ergebnis = 2*ortszuschlag+this.getGrundgehalt();
        return ergebnis;
    }
    
}
