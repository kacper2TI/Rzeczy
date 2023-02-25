package com.example.rzeczy;

import java.util.Scanner;

public class sortowanie {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        int tab[] = {34,56,12,7,5,207,45,2,80,156};
        int max = tab[0];
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > max){
                max = tab[i];
            }
            if(tab[i] < min){
                min = tab[i];
            }
        }
        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);
    }
}
