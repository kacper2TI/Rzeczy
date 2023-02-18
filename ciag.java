package com.example.rzeczy;

import java.util.Scanner;

public class ciag {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int numer = wej.nextInt();
        int m = 1;
        for (int i = 1; i <= numer; i++) {
            m = m * i;
        }
        System.out.println("Silnia liczby "+numer+" to: "+m);

    }
}
