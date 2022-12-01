public class Lektion4 {

/** Inch to cm for fun
//Inch to cm for fun

    public static double berechneCm() {
      int a =6;
      double inch =2.56;
    return inch*a;
    }
    
    public static void main(String[] args) {
      System.out.println(berechneCm());
  }
*/

public static void main(String[] args) {

//If
/** //prüfung zahlen einfaches if
int eingabe = 11;

if(eingabe < 12 && istWahr == true) {
  System.out.println(eingabe + " ist kleiner als 12");
}
else{
  System.out.println("Eingabe größer gleich 12");
}
*/  

/** //If & Else if 
int eingabe = 9;
boolean istWahr = false;

if(istWahr == !true){
  System.out.println("Fuck off");
}
else if(eingabe <= 10) {
  System.out.println(eingabe + " ist kleiner als 10");
}
else {
  System.out.println(eingabe + " ist größer als 10");
}
*/

//Schleifen
/** //For schleife
int thomasiq = 2;
for( int i=0; i<=5; i++) {
  thomasiq = thomasiq*thomasiq;
  System.out.println(thomasiq);
  }
*/ 

//While Schleife

 //While + If 
    int thomasiq = 62;
    while(thomasiq < 120){
  thomasiq = thomasiq + 11;
    if(thomasiq<120){ 
      System.out.println("thomas lernt etwas und der IQ steigt auf "+thomasiq);
    }
    else{
      System.out.println("Thomas ist jetzt schlau genug und der IQ ist auf "+thomasiq+" gestiegen =)");
    }
}





}




}
