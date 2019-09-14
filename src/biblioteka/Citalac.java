package biblioteka;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Citalac {
    private String ime;
    private String prezime;
    private LocalDate datumUclanjivanja;
    private int brojClanskeKarte;
    HashMap<Spis, LocalDate> iznajmljeniSpisi = new HashMap<Spis, LocalDate>();

    public Citalac(String ime, String prezime, LocalDate datumUclanjivanja, int brojClanskeKarte) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumUclanjivanja = datumUclanjivanja;
        this.brojClanskeKarte = brojClanskeKarte;
    }

    public boolean daLiJeIsteklaClanarina(){
        LocalDate danasnjiDatum = LocalDate.now();
        LocalDate datumPreGodinuDana = danasnjiDatum.minusYears(1);
        if (datumPreGodinuDana.compareTo(this.datumUclanjivanja) > 0) {
            return  true;
        }
        return false;
    }

    public void dodajIznajmljenSpis(Spis spis) {
        if (this.daLiJeIsteklaClanarina()) {
            System.out.println("Istekla clanarina. Ne mozete iznajmiti knjigu");
        } else {
           this.iznajmljeniSpisi.put(spis, LocalDate.now());
        }
    }

    public void vratiIznajmljeniSpis(Spis spis) {
        this.iznajmljeniSpisi.remove(spis);
    }

    public void produziClanarinu() {
        this.datumUclanjivanja = LocalDate.now();
    }

    public int vratiBrojClanskeKarte() {
        return this.brojClanskeKarte;
    }

    @Override
    public String toString() {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        String izlaz = "";
        izlaz += this.ime + " " + " " + this.prezime + "," + this.brojClanskeKarte + ", " + formater.format(this.datumUclanjivanja);
        izlaz += "\n";
        for (Map.Entry<Spis, LocalDate> temp: this.iznajmljeniSpisi.entrySet()) {
            izlaz += temp.getKey().toString() + "," + "(" + temp.getValue().toString() + ")";
            izlaz += "\n";
            izlaz += "--------------------------";
            izlaz += "\n";
        }
        return izlaz;
    }
}
