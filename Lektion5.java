public class Lektion5 {
    
    private String ktoNr;
    private double stand;

        public void einzahlen (double einzahlungsbetrag){
            this.stand += einzahlungsbetrag;
        }

        public double auszahlen (double auszahlungsbetrag){
            this.stand -= auszahlungsbetrag;
            return this.stand;
        }

        public void setKtoNr(String ktoNr){
            this.ktoNr = ktoNr;
        }

        public String getKtoNr(){
            return this.ktoNr;
        }

        public void setStand(double stand){
            this.stand = stand;
        }

        public double getStand(){
            return this.stand;
        }

}

