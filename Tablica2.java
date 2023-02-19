package com.example.rzeczy;

public class Tablica2 {
    public static void main(String[] args) {
        int[]  tablica1 = {5,-3,18,-10,3,14};
        double sumaTab = 0;
        double roznicaTab = 0;
        double iloczynTab = 1;
        double ilorazTab = 1;

        //"Wypisuje elementy tablicy a i suma
        for (int i = 0; i < tablica1.length; i++) {
            System.out.println("Element w tablicy a o indeksie " + i + " czyli pierwszy, to: "  + tablica1[i]);
            sumaTab += tablica1[i];
            roznicaTab -= tablica1[i];
            iloczynTab *= tablica1[i];
            ilorazTab /= tablica1[i];
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Suma elementów tablicy a wynosi " + sumaTab);
        System.out.println("Różnica elementów tablicy a wynosi " + roznicaTab);
        System.out.println("Iloczyn elementów tablicy a wynosi " + iloczynTab);
        System.out.println("Iloraz elementów tablicy a wynosi " + ilorazTab);

        }
    }

