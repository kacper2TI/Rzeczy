package com.example.rzeczy;

import java.util.Scanner;

public class srednia {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        int srednia = 0;
        System.out.println("Ile liczb chcesz dodać ?");
        int a = wej.nextInt();
        System.out.println("Podaj liczby:");
        for (int i = 0; i < a; i++) {
            double b = wej.nextDouble();
            srednia += b;
        }
        double wynik = srednia/a;
        double reszta = srednia % a;
        System.out.println("Średnia jest równa " + wynik);
        System.out.println("Reszta jest równa " + reszta);
    }
}
