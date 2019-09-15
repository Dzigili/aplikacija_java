package com.company;

import biblioteka.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Autor IvoAndric = new Autor("Ivo", "Andric", 1892);
        System.out.println(IvoAndric);

        Knjiga NaDriniCuprija = new Knjiga(IvoAndric, "istorijski roman", 1945, "Na Drini Cuprija", 376);
        System.out.println(NaDriniCuprija);

        Autor BranislavNusic = new Autor("Branislav", "Nusic", 1864);

        Knjiga Hajduci = new Knjiga(BranislavNusic, "roman", 1933, "Hajduci", 80);
        System.out.println(Hajduci);

        Autor DobricaCosic = new Autor("Dobrica", "Cosic", 1921);

        Knjiga Koreni = new Knjiga(DobricaCosic, "roman", 1954, "Koreni", 370);
        System.out.println(Koreni);


        Casopis NationalGeographic = new Casopis(LocalDate.of(2020, 12, 30), "National Geographic", 123);
        System.out.println(NationalGeographic.vratiDatumIzdanja());
        System.out.println(NationalGeographic);

        Casopis BluePlanet = new Casopis(LocalDate.of(2020, 12, 30), "Blue Planet", 123);
        System.out.println(BluePlanet.vratiDatumIzdanja());
        System.out.println(BluePlanet);

        Polica polica1 = new Polica();
        polica1.dodajKnjigu(Hajduci);
        polica1.dodajKnjigu(Koreni);

        Polica polica2 = new Polica();
        polica2.dodajKnjigu(NaDriniCuprija);


        System.out.println(polica1.vratiListuKnjiga());
        System.out.println(polica2.vratiListuKnjiga());

        System.out.println(polica1.pronadjiKnjiguPoNaslovu("Koreni"));
        System.out.println(polica1.pronadjiKnjiguPoImenuAutora("Ivo Andric"));
        System.out.println(polica2.pronadjiKnjiguPoNaslovu("Na Drini Cuprija"));


        Citalac IgorVujkovic = new Citalac("Igor", "Vujkovic", LocalDate.of(2018, 12, 30), 1);
        Citalac DusanRajcevic = new Citalac("Dusan", "Rajcevic", LocalDate.of(2018, 11, 20), 2);
        Citalac PeraPeric = new Citalac("Pera", "Peric", LocalDate.of(2018, 10, 11), 10);
        System.out.println(IgorVujkovic);
        System.out.println(DusanRajcevic);
        System.out.println(PeraPeric);
        IgorVujkovic.dodajIznajmljenSpis(NaDriniCuprija);
        DusanRajcevic.dodajIznajmljenSpis(Hajduci);
        PeraPeric.dodajIznajmljenSpis(NationalGeographic);

        Biblioteka biblioteka = new Biblioteka("Jevrejska 24");
        biblioteka.dodajCasopis(NationalGeographic);
        biblioteka.dodajCasopis(BluePlanet);
        biblioteka.dodajCitaoca(IgorVujkovic);
        biblioteka.dodajCitaoca(DusanRajcevic);
        biblioteka.dodajCitaoca(PeraPeric);
        biblioteka.dodajPolicu(polica1);
        biblioteka.dodajPolicu(polica2);

        System.out.println(biblioteka.pronadjiCasopisPoNaslovu("National Geographic"));
        System.out.println(biblioteka.pronadjiKnjiguPoNaslovuNaPolici("Na Drini Cuprija"));
        System.out.println(biblioteka.pronadjiKnjigePoImenuAutoraNaPolici("Ivo Andric"));
        System.out.println(biblioteka.pronadjiCitaocaPoBrojuClanskeKarte(2));

        System.out.println(biblioteka);
    }
}
