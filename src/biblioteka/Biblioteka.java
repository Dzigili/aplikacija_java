package biblioteka;

import java.util.ArrayList;

public class Biblioteka {
    private String adresa;
    private ArrayList<Polica> police;
    private ArrayList<Casopis> casopisi;
    private ArrayList<Citalac> citalaci;

    public Biblioteka(String adresa) {
        this.adresa = adresa;
        police = new ArrayList<>();
        casopisi = new ArrayList<>();
        citalaci = new ArrayList<>();
    }
}
