public class L5Bank {
    public static void main(String[] args){

        L5Girokonto gkto = new L5Girokonto();
        gkto.einzahlen(100);
        System.out.println(gkto.auszahlen(10));

//Zuweisungskompatibilität
//Lektion5 kto = new L5Girokonto();
//ektion5 kto2 = new L5Sparkonto();


    }
}
