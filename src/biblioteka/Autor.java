package biblioteka;

public class Autor {

    private String ime;

    private String prezime;

    private int godinaRodjenja;

    public Autor(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }

    public int vratiGodinuRodjenja() {
        return this.godinaRodjenja;
    }

    @Override
    public String toString() {
        return this.vratiPunoIme();
    }

    public String vratiPunoIme() {
        return this.ime + " " + this.prezime;
    }
}
