package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Student {
    //- clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice

    // - intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa

    //avem mai multe cu acelasi nume)

    // - intr-o clasa putem, defini propirtetaile si actiunile entitatii

    //- variabila  =  propietatea unei clase

    // - variabliele pot fi de 2 feluri : global si local

    // - variabilele globale - sunt vizibile peste tot in proiect

    // - variabilele locale = sunt vizibile doar in locul unde le-am declarat

    //- ca sa definim o variabila globala: accesscontrol(public = nu vreau sa setez nici o  restrictie legata

    //de vizibilitate), tip variabila, nume variabila

    //  cand definim o variabila nu este obligatoriu sa ii definim si  o valoare

    // METODA = actiunea unei clase

    // exista 2 tipuri de metode :  void (executa actiunea si iti a posibilitatea sa vezi
    // rezultatul pe care l-ai facut, de Ex. "se executa actiunea ca te-ai dus la curs si
    // se vede rezultatul ca esti prezent la curs) si return (sunt niste metode care executa
    // actiunea si o returneaza doar pt noi de Ex: sti ca in data de 16 trebuie sa primesti
    // salariul dar nu sti cate persoane cunosc informatia respectiva)

    public String Nume; // ca sa definim o variabila globala trebuie sa incepem cu public + tipul de
    // variabila (String sau Integer,Double, Float, Character, Boolean) + numele ales de noi
    // al variabilelei (orice nume)

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate; // Float este o alternativa la Double

    public Character Sex;

    public Boolean AreDiploma;


    @Test //fiecare @Test reprezinta un singur test, care poate avea mai multe actiuni.
    // SE RECOMANDA CA INTR-O CLASA SA EXISTE UN SINGUR @Test
    public void prezentareStudent() {
        Nume = "Pantea";
        Prenume = "Cristian";
        Varsta = 40;
        Adresa = " Taberei nr. 40";
        Inaltime = 1.70;
        Greutate = 68.50f; //float-ul trebuie sa aiba in capat dupa valoare un f mic
        Sex = 'M';
        AreDiploma = true;


        //System.out.println(Nume + " " + Prenume + " " + Varsta+ " " + Adresa);
        //System.out.println(Inaltime);

        System.out.println(Nume + " este numele primului stundent.");
        System.out.println("Prenumele studentului este: " + Prenume + ".");
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("Greutatea studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Are studentul diploma? " + AreDiploma);

        calculMedie(); //apelam metoda calculMedie in @Test-ul nostru, pt ca nu se recomanda
        // sa avem mai multe @Test-uri intr-o clasa
        inaltimeTotalaStudenti();
        System.out.println(getSalariu());
    }

    public void calculMedie() {
        Integer nota1 = 10;
        Integer nota2 = 8;
        Integer nota3 = 5;
        Integer medie = (nota1+nota2+nota3)/3;

        System.out.println("Media studentului este: " + medie);
    }
    public void inaltimeTotalaStudenti(){
        Double inaltime1 = 1.83;
        Double inaltime2 = 1.63;
        Double inaltime3 = 1.77;
         Double inaltimeTotala = inaltime1+inaltime2+inaltime3;
         
         System.out.println("Inaltimea totala este: "+ inaltimeTotala + " metrii.");
    }


    //metode cu return
    public Integer getSalariu (){
        Integer salariu = 5000;
        return salariu;
    }
    

}



