package com.example.rzeczy;

import java.util.Scanner;

public class prostokat {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj długość prostokąta");
        int a = wej.nextInt();
        System.out.println("Podaj szerokość prostokąta");
        int b = wej.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("* ");
            }
            System.out.println();

            
        }
    }
}
