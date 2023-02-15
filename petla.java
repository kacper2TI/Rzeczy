package com.example.rzeczy;

import java.util.Scanner;
//pętla wypisująca liczby parzyste
public class petla {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++ ) {
            if(i%2==0)
            System.out.print(i+",");
        }
    }

}
