package biblioteka;

import java.time.LocalDate;

public class Casopis extends Spis {
    private int datumIzdanja;
//    private int mesec;
//    private int godina;


    public Casopis(int datumIzdanja, int mesec, int godina, String naslov, int brStrana) {
        this.datumIzdanja = datumIzdanja;
//        this.mesec = mesec;
//        this.godina = godina;
        super.naslov = naslov;
        super.brStrana = brStrana;
    }

    public int getDatumIzdanja() {
        return datumIzdanja;
    }

    @Override
    public String toString() {
        return naslov + ", " + datumIzdanja;
    }
}
