package biblioteka;

import java.util.ArrayList;

public class Polica {
    public static int ID = 0;
    private int id;
    private ArrayList<Knjiga>knjige;

    public Polica(int id) {
        this.id = id;
        knjige = new ArrayList<>();
    }

    public void dodajKnjigu(Knjiga knjiga) {
        knjige.add(knjiga);
    }

    public int getId() {
        return id;
    }
}
