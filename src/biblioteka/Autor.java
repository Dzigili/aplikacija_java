package biblioteka;

public class Autor {
    private String ime;
    private String prezime;
    private int godinaRodjenja;

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
