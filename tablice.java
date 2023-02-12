package com.example.rzeczy;

public class tablice {
    public static void main(String[] args) {
        int tab[] = {3, 5, 7, 8};

        System.out.println("Dlugosc tablicy: " + tab.length);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]); // wypisuje co jest w tablicy tab
        }

        int[] tab2 = new int[100];


        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]); ///// wypisuje co jest w tablicy tab2, tu sa zera
        }

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = 1;  // tu wrzucamy jedynki do tablicy
        }

        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]); // wypisuje co jest w tablicy tab2,  tu sa jedynki
        }

    }
}
