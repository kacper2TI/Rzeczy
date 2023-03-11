package com.example.rzeczy;
//odliczanie do wybuchu bomby
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class bomba {
    public static void main(String[] args) throws InterruptedException {
        Scanner artur= new Scanner(System.in);
        System.out.println("Za ile wybuchnie bomba ?");
        int a = artur.nextInt();
        System.out.println("Bomba wybuchnie za ");
        for (int i = a; i > 0; i--) {
            sleep(1000) ;
            System.out.println(i);
        }
        sleep(1000);
        System.out.println("BUM !!!");
    }
}
