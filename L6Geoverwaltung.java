import java.util.*;

public class L6Geoverwaltung {
    
    public static void main(String[] args){

        //Zuweisungskompatibilitaet
        //L6Figur k= new L6Kreis();

        ArrayList<L6Figur> al = new ArrayList<L6Figur>();

        al.add(new L6Kreis(5));
        al.add(new L6Rechteck(2,5));

        double gesamtflaeche = 0;

        for (L6Figur f:al) {
            gesamtflaeche = f.berechneFlaeche() + gesamtflaeche;
        }

        System.out.println(gesamtflaeche + "ist die Gesamtfläche");
        //ändert PI_EINFACH, aber nur möglich, wenn Klassenattribut nicht final ist
//        L6Kreis.PI_EINFACH =12312;
        System.out.println(L6Kreis.PI_EINFACH);
        System.out.println(L6Rechteck.istQuadrat(2, 3));
    }
}
