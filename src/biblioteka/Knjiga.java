package biblioteka;

public class Knjiga extends Spis {
    private String autor;
    private String zanr;
    private int godinaIzdanja;

    public Knjiga(String autor, String zanr, int godinaIzdanja, String naslov, int brStrana) {
        this.autor = autor;
        this.zanr = zanr;
        this.godinaIzdanja = godinaIzdanja;
        super.naslov = naslov;
        super.brStrana = brStrana;
    }

    public String getAutor() {
        return autor;
    }

    public String getZanr() {
        return zanr;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    @Override
    public String toString() {
        return naslov + ", " + autor + ", " + godinaIzdanja + ", " + zanr;
    }
}
