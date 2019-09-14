package biblioteka;

public abstract class Spis {

    protected String naslov;

    protected int brojStrana;

    public String vratiNaslov() {
        return this.naslov;
    }

    public int vratiBrojStrana() {
        return this.brojStrana;
    }

    @Override
    public abstract String toString();
}
