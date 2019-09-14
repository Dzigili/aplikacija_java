package com.company;

import biblioteka.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Autor IvoAndric = new Autor("Ivo", "Andric", 1892);
        System.out.println(IvoAndric);

        Knjiga NaDriniCuprija = new Knjiga(IvoAndric, "roman", 1945, "Na Drini Cuprija", 376);
        System.out.println(NaDriniCuprija);

        Autor BranislavNusic = new Autor("Branislav", "Nusic", 1864);
        Knjiga Hajduci = new Knjiga(BranislavNusic, "roman", 1933, "Hajduci", 80);
        System.out.println(Hajduci);


        Casopis NationalGeographic = new Casopis(LocalDate.of(2020, 12, 30), "National Geographic", 123);
        System.out.println(NationalGeographic.vratiDatumIzdanja());
        System.out.println(NationalGeographic);

        Casopis BluePlanet = new Casopis(LocalDate.of(2020, 12, 30), "Blue Planet", 123);
        System.out.println(BluePlanet.vratiDatumIzdanja());
        System.out.println(BluePlanet);

        Polica polica1 = new Polica();
        polica1.dodajKnjigu(NaDriniCuprija);
        polica1.dodajKnjigu(Hajduci);

        Polica polica2 = new Polica();
        polica2.dodajKnjigu(NaDriniCuprija);


        System.out.println(polica1.vratiListuKnjiga());

        System.out.println(polica1.pronadjiKnjiguPoNaslovu("Na Drini Cuprija"));
        System.out.println(polica1.pronadjiKnjiguPoImenuAutora("Ivo Andric"));


        Citalac IgorVujkovic = new Citalac("Igor", "Vujkovic", LocalDate.of(2018, 12, 30), 1);
        Citalac IvanObradovic = new Citalac("Ivan", "Obradovic", LocalDate.of(2018, 12, 30), 1);
        System.out.println(IgorVujkovic);
        System.out.println(IvanObradovic);
        IgorVujkovic.dodajIznajmljenSpis(NaDriniCuprija);
        IvanObradovic.dodajIznajmljenSpis(Hajduci);

        Biblioteka biblioteka = new Biblioteka("Kosovska 11");
        biblioteka.dodajCasopis(NationalGeographic);
        biblioteka.dodajCasopis(BluePlanet);
        biblioteka.dodajCitaoca(IgorVujkovic);
        biblioteka.dodajCitaoca(IvanObradovic);
        biblioteka.dodajPolicu(polica1);
        biblioteka.dodajPolicu(polica2);

        System.out.println(biblioteka.pronadjiCasopisPoNaslovu("National Geographic"));
        System.out.println(biblioteka.pronadjiKnjiguPoNaslovuNaPolici("Na Drini Cuprija"));
        System.out.println(biblioteka.pronadjiKnjigePoImenuAutoraNaPolici("Ivo Andric"));
        System.out.println(biblioteka.pronadjiCitaocaPoBrojuClanskeKarte(1));

        System.out.println(biblioteka);
    }
}
