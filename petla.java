package com.example.rzeczy;

import java.util.Scanner;

//wybór oraz pętle


public class petla {
    public static void main(String[] args){
        Scanner wej = new Scanner(System.in);
        char znak;
        System.out.println("Witaj ! Co chcesz obliczyć ?");
        System.out.println("1. Liczby parzyste");
        System.out.println("2. Liczby nieparzyste");
        System.out.println("3. Liczby pierwsze");
        System.out.println("4. Liczby naturalne");
        znak = (char) wej.nextInt();
        switch (znak) {
            case 1:
            {
                System.out.println("Podaj przedział");
                System.out.println("od");
                int a = wej.nextInt();
                System.out.println("do");
                int b = wej.nextInt();
                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0)
                        System.out.print(i + ",");
                }
            }
            case 2:
            {
                System.out.println("Podaj przedział");
                System.out.println("od");
                int a = wej.nextInt();
                System.out.println("do");
                int b = wej.nextInt();
                for (int i = a; i <= b ; i++) {
                    if (i % 2 == 1){
                        System.out.print(i + ",");
                    }
                }
                break;
            }
            case 3:
            {
                System.out.println("Podaj przedział");
                System.out.println("od");
                int a = wej.nextInt();
                System.out.println("do");
                int b = wej.nextInt();
                for (int i = a; i <= b; i++) {
                    boolean tak = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            tak = false;
                            break;
                        }
                    }
                    if (tak) {
                        System.out.print(i+",");
                    }
                }
                break;

            }
            case 4:
            {
                System.out.println("Podaj przedział");
                System.out.println("od");
                int a = wej.nextInt();
                System.out.println("do");
                int b = wej.nextInt();
                for (int i=a; i <= b; i++)
                {
                    if(a<0)
                    {
                        System.out.println("Liczba naturalna jest większa od 0");
                        break;
                    } else {
                        System.out.print(i+",");
                    }
                }
                break;
            }
            case 5:
            {
                System.out.println("Podaj przedział");
                System.out.println("od");
                int a = wej.nextInt();
                System.out.println("do");
                int b = wej.nextInt();
            }
        }

    }

}