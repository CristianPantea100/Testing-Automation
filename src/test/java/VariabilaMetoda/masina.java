package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi", "Q3", 2020);
        dateMasina("BMW","Seria 1",  2021);

        calculMedie(5.0, 10.0);
        calculMedie(7.0, 9.8);


    }
    public void dateMasina(String param1, String param2, Integer param3){

        marca = param1;
        model = param2;
        anFabricatie = param3 ;

        System.out.println( "Marca masinii este: " + marca );
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie este: " + anFabricatie);

    }
//calculam media a doua numere

    public void calculMedie(Double nota1, Double nota2){
        Double rezultat = (nota1 + nota2)/2;
        System.out.println("Media celor 2 note este: " + rezultat);
    }





}
