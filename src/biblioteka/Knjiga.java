package biblioteka;

public class Knjiga extends Spis {
    private Autor autor;
    private String zanr;
    private int godinaIzdanja;

    public Knjiga(Autor autor, String zanr, int godinaIzdanja, String naslov, int brojStrana) {
        this.autor = autor;
        this.zanr = zanr;
        this.godinaIzdanja = godinaIzdanja;
        super.naslov = naslov;
        super.brojStrana = brojStrana;
    }

    public Autor vratiAutora() {
        return this.autor;
    }

    public String vratiZanr() {
        return this.zanr;
    }

    public int vratiGodinaIzdanju() {
        return this.godinaIzdanja;
    }

    @Override
    public String toString() {
        return this.naslov + ", " + this.autor + ", " + this.godinaIzdanja + ", " + this.zanr;
    }
}
