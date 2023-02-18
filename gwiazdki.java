package com.example.rzeczy;

import java.util.Scanner;

public class gwiazdki {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = wej.nextInt();
        for (int i = a; i >= 0; i--) {
            for (int j = i; j >= 0 ; j--)
                System.out.print(" ");
                for (int k = 2*(a-i); k >=0; k--)
                    System.out.print("*");
                    System.out.println();
        }
    }
}
