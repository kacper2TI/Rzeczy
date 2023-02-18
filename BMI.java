package com.example.rzeczy;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj wagę");
        double waga = wej.nextDouble();
        System.out.println("Podaj wzrost");
        double wzrost = wej.nextDouble();
        double BMI = waga / Math.pow(wzrost,2);
        System.out.println("Twój wskaźnik BMI wynosi " + BMI);
        if(BMI <= 18.5)
        {
            System.out.println("Jesteś za chudy. PRZYTYJ !");
        } else if (BMI>18.5 && BMI < 25) {
            System.out.println("Jesteś w optymalnej wadze");
        } else if (BMI >= 25)
        {
            System.out.println("Jesteś za gruby. SCHUDNIJ !");
        }
    }
}
