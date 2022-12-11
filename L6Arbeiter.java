public class L6Arbeiter extends L6Mitarbeiter{

    private double akkordzuschlag = 1000;

    @Override
    public double monatsBrutto() {
        double ergebnis = 0;
        ergebnis = akkordzuschlag + this.getGrundgehalt();
        return ergebnis;
    }

}