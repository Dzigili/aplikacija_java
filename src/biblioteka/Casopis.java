package biblioteka;

import java.time.LocalDate;

public class Casopis extends Spis {
    private int datumIzdanja;
//    private int mesec;
//    private int godina;

    public Casopis(int datumIzdanja, String naslov, int brStrana) {
        this.datumIzdanja = datumIzdanja;
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
