package com.example.rzeczy;

import java.util.Scanner;

public class procent {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Obliczanie procentów z danej liczby");
        System.out.println("Procent");
        double a = wej.nextDouble();
        System.out.println("z liczby ");
        double b = wej.nextDouble();
        double c = (a/100) * b;
        System.out.println(c);
    }
}
