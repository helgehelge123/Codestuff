public class L6Geschaeftsfuehrer extends L6Mitarbeiter{

    private double provision = 500;

    @Override
    public double monatsBrutto() {
        double ergebnis =0;
        ergebnis = provision+this.getGrundgehalt();
        return ergebnis;
    }
    


}
