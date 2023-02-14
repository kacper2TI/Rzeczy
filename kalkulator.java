package com.example.rzeczy;
import java.lang.Math;


import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        double liczba_1;
        double liczba_2 ;
        char znak;
        Scanner wej = new Scanner(System.in);
        System.out.println("Dodawanie ==> +");
        System.out.println("Odejmowanie ==> -");
        System.out.println("Mnożenie ==> *");
        System.out.println("Dzielenie ==> /");
        System.out.println("Reszta z dzielenia ==> %");
        System.out.println("Potęgowanie ==> ^");
        System.out.println("Pierwiastkowanie ==> V");
        System.out.println("Pierwiastkowanie 3 stopnia ==> √ @");
        System.out.println("");
        System.out.println("");
        System.out.println("Podaj pierwszą liczbę");
        liczba_1 = wej.nextDouble();

        System.out.println("Podaj znak");

        znak = wej.next().charAt(0);
        switch (znak) {
            case '+':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextDouble();
                System.out.println(liczba_1 + liczba_2);
                break;
            }
            case '-':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextDouble();
                System.out.println(liczba_1 - liczba_2);
                break;
            }
            case'*':
            {
                System.out.println("Podaj druga liczbe");

                liczba_2 = wej.nextDouble();
                System.out.println(liczba_1 * liczba_2);
                break;
            }
            case '/':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextDouble();
                System.out.println(liczba_1 / liczba_2);
                break;
            }
            case '%':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextDouble();
                System.out.println(liczba_1 % liczba_2);
                break;
            }
            case '^':
            {
                System.out.println("Podaj potege");
                liczba_2 = wej.nextDouble();
                int power = (int) Math.pow(liczba_1, liczba_2);
                System.out.println(power);
                break;
            }
            case 'V':
            {
                System.out.println(Math.sqrt(liczba_1));
                break;
            }
            case '@':
            {
                System.out.println(Math.cbrt(liczba_1));
                break;
            }
            default:
            {
                System.out.println("Nie ma takiej opcji");
            }


        }

    }
}
