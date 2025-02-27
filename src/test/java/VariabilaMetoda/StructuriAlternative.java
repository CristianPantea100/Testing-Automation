package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class StructuriAlternative {


    // structuri alternative = if-then-else; switch-case
    @Test
    public void metodaTest(){

//        metodaVerificareNumar(7);
//        metodaVerificareNumar(4);
//        metodaVerificareNumar(5);

//        metodaVerificareNrParPozitiv(0);
//        metodaVerificareNrParPozitiv(4);
//        metodaVerificareNrParPozitiv(1);
//        metodaVerificareNrParPozitiv(-1);
//        metodaVerificareNrParPozitiv(-4);
        ZileSaptamana(3);

    }

    //verificam un nr mai mare decat 5
    public void metodaVerificareNumar(int Valoare){
        if (Valoare>5){
            System.out.println ("Numarul " + Valoare + " e mai mare decat 5.");
        } else if ( Valoare<5){
            System.out.println("Numarul " + Valoare+" este mai mic decat 5.");
        } else {
            System.out.println("Numarul " + Valoare + " este egal cu 5.");
        }
    }

    //Verificam daca un nr este par pozitiv sau negativ
    public void metodaVerificareNrParPozitiv(int Valoare) {

        if (Valoare > 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + Valoare + " este impar pozitiv");
            }
        } else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + Valoare + " este impar negativ");
            }
        } else if (Valoare == 0) {
            System.out.println("Numarul " + Valoare + " este 0.");
        }

    }

    // exemplu switch case. "IF"-ul are CONDITII !, "SWITCH"-ul are valoare deci cele 2 sunt extrem de diferite
    public void ZileSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Azi este Luni.");
                break;
            case 2:
                System.out.println(" Azi este Marti.");
                break;
            case 3:
                System.out.println("Azi este Mieruri");
                break;
            case 4:
                System.out.println("AZi este joi.");
                break;
            case 5:
                System.out.println("AZi este Vineri.");
                break;
            default:
                System.out.println("Nu mai sunt zile.");
        }
    }

}

