package VariabilaMetoda;

import org.testng.annotations.Test;

public class copil {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;

    @Test
    public void prezentareCopil(){
        Nume = "Muresan";
        Prenume = "Riana";
        Varsta = 5;
        Inaltime = 1.15;
        Greutate = 19.5f;
        Sex = 'F';

        System.out.println( " Copil " + Nume +" " + Prenume + " are varsta de " + Varsta + " si inaltimea de "
                + Inaltime + " cu greutatea de " + Greutate + " avand sexul " + Sex + " .");
    }

}
