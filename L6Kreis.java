

public class L6Kreis extends L6Figur {

    private int radius;

    public static double PI_EINFACH = 3.14;

    public L6Kreis(){
    }
    
    public L6Kreis(int r){
        this.radius = r;
    }

    @Override
    public double berechneFlaeche(){
        return (radius*radius)*Math.PI;
    }

}

