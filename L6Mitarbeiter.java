public abstract class L6Mitarbeiter {

//    private String personalNR;
//    private String vorname;
    private String name;
    private double grundgehalt = 2000;

public double getGrundgehalt() {
    return this.grundgehalt;
}

public void setName(String name){
    this.name=name;
}

public abstract double monatsBrutto();

public String getName() {
    return name;
}

public void setGrundgehalt(double grundgehalt) {
    this.grundgehalt = grundgehalt;
}


}