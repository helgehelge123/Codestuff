public class L6Rechteck extends L6Figur {

    private int a,b;

    public L6Rechteck() {

    }

    public L6Rechteck(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double berechneFlaeche(){
        return a*b;
    }

    public static boolean istQuadrat(int a, int b) {
        if (a == b) 
        return true;
        else 
        return false;
    }

}
