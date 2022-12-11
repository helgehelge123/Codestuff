public class L6Personalverwaltung {

    public static void main (String[] args){

        L6Mitarbeiter ma1 = new L6Angestellter();
        System.out.println("Ein Angestellter hat ein Bruttogehalt von "+ ma1.monatsBrutto() + " Euro.");


        L6Mitarbeiter ma2 = new L6Arbeiter();
        System.out.println("Ein Arbeiter hat ein Bruttogehalt von "+ ma2.monatsBrutto() + " Euro.");

        
        L6Mitarbeiter ma3 = new L6Geschaeftsfuehrer();
        System.out.println("Ein Geschaeftsfuehrer hat ein Bruttogehalt von "+ ma3.monatsBrutto() + " Euro.");
    }
    
}
