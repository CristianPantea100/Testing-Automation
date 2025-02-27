package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

/* public class masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public  void metodaTest(){
//        dateMasina("Audi", "Q3", 2020);
//        dateMasina("BMW","Seria 1",  2021);
//
//        calculMedie(5.0, 10.0);
//        calculMedie(7.0, 9.8);
        //citireNote();


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
*/

public class masina{
    public static void main(String[] args) {
        //System.out.print("Introduceti Nota :");
        //citireNote();
        //printareValoriWhile();
        //printValDoWhile();
        printareValoriFor();

    }
        public static void citireNote () {
            Scanner scanner = new Scanner(System.in);
            int nota = scanner.nextInt();
            while (nota < 0 || nota > 10) {
                System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Introdu o valoare valida");
                nota = scanner.nextInt();
            }
            System.out.println("Nota este intre 1 si 10");
        }
        
        public static void printareValoriWhile() {
            int valoare = 6;
            while (valoare <= 5) {
                System.out.println("Valoarea este " + valoare);
                valoare++;
            }
            System.out.println("Valoarea dupa parcurgerea while este " + valoare);
        }

        public static void printValDoWhile(){
        int valoare = 6;
        do{
            System.out.println("Valoarea este " + valoare);
            valoare++;
        } while (valoare<=5);
            System.out.println("Valoarea dupa parcurgerea de do while este " + valoare);
        }
        public static void  printareValoriFor(){

            int valoare;
            for(valoare=1 ; valoare<=5; valoare++) {
            System.out.println("valoarea este " + valoare);
        }

        }

    }

