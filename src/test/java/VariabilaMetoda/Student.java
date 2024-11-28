package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //- clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice

    // - intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa

    //avem mai multe cu acelasi nume

    // - intr-o clasa putem, defini propirtetaile si actiunile entitatii

    //- variabila  =  propietatea unei clase

    // - variabliele pot fi de 2 feluri : global si local

    // - variabilele globale - sunt vizibile peste tot in proiect

    // - variabilele locale = sunt vizibile doar in locul unde le-am declarat

    //- ca sa definim o variabila globala: accesscontrol(public = nu vreau sa setez nici o  restrictie legata

    //de vizibilitate), tip variabila, nume variabila

    //  cand definim o variabila nu este obligatoriu sa ii dam o valoare

    // METODA = actiunea unei clase

    // exista 2 tipuri de metode :  void si return

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate; // Float este o alternativa la Double

    public Character Sex;

    public Boolean AreDiploma;


    @Test
    public void prezentareStudent(){
        Nume= "Briciu";
        Prenume = "Alex";
        Varsta = 41;
        Adresa = "Taberei";
        Inaltime = 1.70;
        Greutate = 68.00f; //float-ul trebuie sa aiba in capat dupa valoare un f mic
        Sex = 'M';
        AreDiploma = true;

        //System.out.println(Nume + " " + Prenume + " " + Varsta+ " " + Adresa);
        //System.out.println(Inaltime);

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("gREUTATEA studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Are studentul diploma? " + AreDiploma);


        calculMedie();

    }

    public void calculMedie(){

        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer medie = (nota1 + nota2 + nota3)/3;

        System.out.println("Media studentului este: " + medie);


    }

}
