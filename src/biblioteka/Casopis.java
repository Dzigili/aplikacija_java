package biblioteka;

import java.time.LocalDate;
import java.util.Date;

public class Casopis extends Spis {
    private LocalDate datumIzdanja;

    public Casopis(LocalDate datumIzdanja, String naslov, int brojStrana) {
        this.datumIzdanja = datumIzdanja;
        super.naslov = naslov;
        super.brojStrana = brojStrana;
    }

    public LocalDate vratiDatumIzdanja() {
        return this.datumIzdanja;
    }

    @Override
    public String toString() {
        return naslov + ", " + datumIzdanja.getMonthValue() + '/' + datumIzdanja.getYear();
    }
}
