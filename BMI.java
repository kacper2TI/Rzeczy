package com.example.rzeczy;
//Program obliczający wskaźnik BMI
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj wagę");//Podaję wagę
        double waga = wej.nextDouble();
        System.out.println("Podaj wzrost");//Podaję wzrost
        double wzrost = wej.nextDouble();
        double BMI = waga / Math.pow(wzrost,2);//Obliczanie wskaźnika BMI
        System.out.println("Twój wskaźnik BMI wynosi " + BMI);
        if(BMI <= 18.5) //jeśli obliczony wskaźnik jest mniejszy równy 18.5 program wyświetla |
        {                                                                                     |
            System.out.println("Jesteś za chudy. PRZYTYJ !");     <----------------------------
        } else if (BMI>18.5 && BMI < 25) { //jeśli obliczony wskaźnik jest większy od 18.5 i mniejszy od 25 program wyświetla |
            System.out.println("Jesteś w optymalnej wadze");       <-----------------------------------------------------------
        } else if (BMI >= 25) //jeśli obliczony wskaźnik jest większy równy 25 program wyświetla |
        {                                                                                        |
            System.out.println("Jesteś za gruby. SCHUDNIJ !");     <------------------------------
        }
    }
}
