package com.example.rzeczy;
import java.lang.Math;


import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        int liczba_1;
        int liczba_2 ;
        char znak;
        Scanner wej = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        liczba_1 = wej.nextInt();

        System.out.println("Podaj znak");

        znak = wej.next().charAt(0);
        switch (znak) {
            case '+':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextInt();
                System.out.println(liczba_1 + liczba_2);
                break;
            }
            case '-':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextInt();
                System.out.println(liczba_1 - liczba_2);
                break;
            }
            case'*':
            {
                System.out.println("Podaj druga liczbe");

                liczba_2 = wej.nextInt();
                System.out.println(liczba_1 * liczba_2);
                break;
            }
            case '/':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextInt();
                System.out.println(liczba_1 / liczba_2);
                break;
            }
            case '%':
            {
                System.out.println("Podaj druga liczbe");
                liczba_2 = wej.nextInt();
                System.out.println(liczba_1 % liczba_2);
                break;
            }
            case '^':
            {
                System.out.println("Podaj potege");
                liczba_2 = wej.nextInt();
                double power = Math.pow(liczba_1, liczba_2);
                System.out.println(power);
                break;
            }
            default:
            {
                System.out.println("Nie ma takiej opcji");

            }


        }

    }
}