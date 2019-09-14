package biblioteka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Polica {
    static int ID = 0;
    private int id = 0;
    private ArrayList<Knjiga>knjige;

    public Polica() {
        ID++;
        this.knjige = new ArrayList<Knjiga>();
        this.id = ID;
    }

    public void dodajKnjigu(Knjiga knjiga) {
        this.knjige.add(knjiga);
    }

    public int vratId() {
        return this.id;
    }

    public Knjiga pronadjiKnjiguPoNaslovu(String naslov) {
        Knjiga knjiga = null;
        for (Knjiga temp: this.knjige) {
            if (temp.naslov == naslov) {
                knjiga = temp;
                break;
            }
        }
        return knjiga;
    }

    public ArrayList<Knjiga> pronadjiKnjiguPoImenuAutora(String imeAutora) {
        ArrayList<Knjiga> knjige = new ArrayList<Knjiga>();
        for (Knjiga temp: this.knjige) {
            Autor autor = temp.vratiAutora();
            if (autor.vratiPunoIme().equals(imeAutora)) {
                knjige.add(temp);
            }
        }
        return knjige;
    }

    public String vratiListuKnjiga() {

        Comparator<Knjiga> komparator = new Comparator<Knjiga>() {
            @Override
            public int compare(Knjiga knjiga1, Knjiga knjiga2) {
                return knjiga1.toString().compareTo(knjiga2.toString());
            }
        };
        Collections.sort(this.knjige, komparator);
        String izlaz = "";
        izlaz += "Polica " + this.id;
        izlaz +="\n";
        izlaz += "--------------------------";
        izlaz +="\n";
        for (Knjiga temp: this.knjige) {
            izlaz += "- " + temp.toString() +"\n";
        }
        izlaz += "--------------------------";

        return  izlaz;
    }

    @Override
    public String toString() {
        return "Polica " + this.id;
    }
}

