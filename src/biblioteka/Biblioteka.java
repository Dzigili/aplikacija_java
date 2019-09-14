package biblioteka;

import java.util.ArrayList;

public class Biblioteka {
    private String adresa;
    private ArrayList<Polica> police;
    private ArrayList<Casopis> casopisi;
    private ArrayList<Citalac> citaoaci;

    public Biblioteka(String adresa) {
        this.adresa = adresa;
        this.police = new ArrayList<Polica>();
        this.casopisi = new ArrayList<Casopis>();
        this.citaoaci = new ArrayList<Citalac>();
    }

    public void dodajPolicu(Polica polica) {
        this.police.add(polica);
    }

    public void dodajCasopis(Casopis casopis) {
        this.casopisi.add(casopis);
    }

    public void dodajCitaoca(Citalac citalac) {
        this.citaoaci.add(citalac);
    }

    public Knjiga pronadjiKnjiguPoNaslovuNaPolici(String naslov)
    {
        Knjiga knjiga = null;
        for (Polica polica: this.police) {
            Knjiga proonadjenaKnjiga = polica.pronadjiKnjiguPoNaslovu(naslov);
            if (null != proonadjenaKnjiga) {
                knjiga = proonadjenaKnjiga;
                break;
            }
        }
        return knjiga;
    }

    public ArrayList<Knjiga> pronadjiKnjigePoImenuAutoraNaPolici(String imeAutora)
    {
        ArrayList<Knjiga> knjige = new ArrayList<Knjiga>();
        for (Polica temp: this.police) {
            ArrayList<Knjiga> pronadjeneKnjige = temp.pronadjiKnjiguPoImenuAutora(imeAutora);
            pronadjeneKnjige.forEach(pronadjenaKnjiga -> knjige.add(pronadjenaKnjiga));
        }

        return knjige;
    }

    public Casopis pronadjiCasopisPoNaslovu(String naslov) {
        Casopis casopis = null;
        for (Casopis temp: this.casopisi) {
            if (temp.naslov == naslov) {
                casopis = temp;
                break;
            }
        }
        return casopis;
    }

    public Citalac pronadjiCitaocaPoBrojuClanskeKarte(int brojClanskeKarte) {
        Citalac citalac = null;
        for (Citalac temp: this.citaoaci) {
            if (temp.vratiBrojClanskeKarte() == brojClanskeKarte) {
                citalac = temp;
                break;
            }
        }
        return citalac;
    }

    @Override
    public String toString() {
        String izlaz = "";
        izlaz += this.adresa + "\n";
        izlaz += "*****************************" + "\n";
        for(Polica temp: this.police) {
            izlaz += temp.toString() + "\n";
        }
        izlaz += "*****************************" + "\n";
        for(Casopis temp: this.casopisi) {
            izlaz += temp.toString() + "\n";
        }
        izlaz += "*****************************" + "\n";
        for(Citalac temp: this.citaoaci) {
            izlaz += temp.toString() + "\n";
        }


        return izlaz;
    }
}
