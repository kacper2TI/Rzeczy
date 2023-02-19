package com.example.rzeczy;

import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        Random liczba  = new Random();
        int
                los = liczba.nextInt(51);
        System.out.println("Wylosuj liczbę");
        int a = wej.nextInt();
        while(a != los) {
            if (a <= los) {
                System.out.println("Liczba jest za mała");
                System.out.println("Podaj inną liczbę");
                a = wej.nextInt();
            } else if (a >= los) {
                System.out.println("liczba jest za duża");
                System.out.println("Podaj inną liczbę");
                a = wej.nextInt();
            }
            if (a == los) {
                System.out.println("Brawo ! Wygrałeś !");
            }
        }
    }
}
