package com.example.rzeczy;

import java.util.Scanner;

public class Konwersja {
    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = wej.nextInt();
        System.out.println("Na jaki system chcesz przeliczyć ?");
        System.out.println("1.Dwójkowy (2)");
        System.out.println("2.Ósemkowy (8) ");
        System.out.println("3.Heksadecymalny (16)");
        int znak = wej.nextInt();
        String wynik = "";
        switch (znak)
        {
            case 1:
            {
                while (a > 0)
                {
                    wynik = (a % 2) + wynik;
                    a=a/2;
                }
                break;
            }
            case 2:
            {
                while (a>0){
                    wynik = (a%8) + wynik;
                    a=a/8;
                }
                break;
            }
            case 3:
            {
                while(a>0){
                    int reszta = a%16;
                    if (reszta < 10) {
                        wynik = reszta + wynik;
                    } else {
                        wynik = (char) ('A' + reszta - 10) + wynik;
                    }
                    a=a/16;
                }
                break;
            }
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }
        System.out.println(wynik);
    }
}
