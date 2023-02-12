package com.example.rzeczy;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Zadania {
    public static void main(String[] args){

        //powrot do poprzedniego menu jesli wybierzemy niepoprawną opcję
        Scanner wej = new Scanner(System.in);
        System.out.println("          |MENU GŁÓWNE| ");
        System.out.println("-----------------------------------");
        System.out.println("|           1. Koło               |");
        System.out.println("|           2. Kwadrat            |");
        System.out.println("|           3. Prostokąt          |");
        System.out.println("|           4. Trójkat            |");
        System.out.println("|           5. Trapez             |");
        System.out.println("|           6. Równoległobok      |");
        System.out.println("|           7. Romb lub deltoid   |");
        System.out.println("|           8. Funkcja kwadratowa |");
        System.out.println("|           9. Wszystkie wzory    |");
        System.out.println("-----------------------------------");
        System.out.println("====================================");
        System.out.println("Co chcesz obliczyć ? (wybierz numer) ");
        System.out.println("====================================");
        char znak;
        znak = wej.next().charAt(0);
        switch (znak) {
            case '1':
            {
                System.out.println("Podaj promień");
                double r = wej.nextInt();
                double pole_kolo = (double) (Math.PI * (r * r));
                double obw_kolo = (double) (2 *Math.PI * r);
                System.out.println("Pole wynosi: " + pole_kolo);
                System.out.println("Obwód wynosi: " + obw_kolo);
                break;
            }
            case '2':
            {
                System.out.println("Podaj długość boku");
                double a = wej.nextInt();
                double pole_kwa = a *a;
                double obw_kwa =  4*a;
                System.out.println("Pole wynosi: " + pole_kwa);
                System.out.println("Obwód wynosi: " + obw_kwa);
                break;
            }
            case '3':
            {
                System.out.println("Podaj długość boku a");
                double a = wej.nextInt();
                System.out.println("Podaj długość boku b");
                double b = wej.nextInt();
                double pole_pro = a*b;
                double obw_pro = 2*a+2*b;
                System.out.println("Pole wynosi: " + pole_pro);
                System.out.println("Obwód wynosi: " + obw_pro);
                break;
            }
            case '4':
            {
                System.out.println("Podaj długość podstawy");
                double a = wej.nextInt();
                System.out.println("Podaj długość boku b");
                double b = wej.nextInt();
                System.out.println("Podaj długość boku c");
                double c = wej.nextInt();
                System.out.println("Podaj wysokość");
                double h = wej.nextInt();
                double pole_tro = (a*h)/2;
                double obw_tro = a + b+ c;
                System.out.println("Pole wynosi: " + pole_tro);
                System.out.println("Obwód wynosi: " + obw_tro);
                break;
            }
            case '5':
            {
                System.out.println("Podaj podstawę");
                double a = wej.nextInt();
                System.out.println("Podaj drugą podstawę");
                double b = wej.nextInt();
                System.out.println("Podaj wysokość");
                double h = wej.nextInt();
                System.out.println("Podaj długości boków");
                double c = wej.nextInt();
                double d = wej.nextInt();
                double pole_tra = ((a+b)*h) / 2;
                double obw_tra = a + b + c + d;
                System.out.println("Pole wynosi: " + pole_tra);
                System.out.println("Obwód wynosi: " + obw_tra);
                break;
            }
            case '6':
            {
                System.out.println("Podaj długość podstawy");
                double a = wej.nextInt();
                System.out.println("Podaj wysokość");
                double h = wej.nextInt();
                System.out.println("Podaj długości 3 boków");
                double b = wej.nextInt();
                double c = wej.nextInt();
                double d = wej.nextInt();
                double pole_row = a * h;
                double obw_row = a + b + c +d;
                System.out.println("Pole wynosi: " + pole_row);
                System.out.println("Obwód wynosi: " + obw_row);
                break;

            }
            case '7':
            {
                System.out.println("Podaj długości przekątnych" );
                double a = wej.nextInt();
                double b = wej.nextInt();
                System.out.println("Podaj długości boków");
                double c = wej.nextInt();
                double d = wej.nextInt();
                double e = wej.nextInt();
                double f = wej.nextInt();
                double pole_rom = (a*b)/2;
                double obw_rom = c+d+e+f;
                System.out.println("Pole wynosi: " + pole_rom);
                System.out.println("Obwód wynosi: " + obw_rom);
                break;
            }
            case '8':
            {
                System.out.println("Obliczanie delty funkcji kwadratowej");

                System.out.println("Podaj a, b, c");
                System.out.println("a");
                int a = wej.nextInt();
                if ( a == 0){
                    System.out.println("FUNKCJA NIE ISTNIEJE !");
                    break;
                }
                System.out.println("b");
                int b = wej.nextInt();
                System.out.println("c");
                int c = wej.nextInt();
                int delta = (b*b) - 4 *a * c;
                int p = -b/ (2*a);
                int q = -delta/ (4*a);
                System.out.println("Delta wynosi: " + delta);
                System.out.println("Wierzchołek funkcji wynosi " + "(" + p + "," + q + ") ");
                System.out.println("Oś symetrii funkcji wynosi x=" + p);
                if(a > 0 ){
                    System.out.println("funkcja jest rosnąca");
                    System.out.println("Y min = " + q + " dla x = " + p);
                }
                if(a < 0 ){
                    System.out.println("funkcja jest malejąca");
                    System.out.println("Y max = " + q + " dla x = " + p);
                }
                if(delta > 0 )
                {
                    System.out.println("Delta posiada 2 miejsca zerowe");
                    double x1 = (-b - Math.sqrt(delta)) / (2*a);
                    double x2 = (-b + Math.sqrt(delta)) / (2*a);
                    System.out.println("Miejsca zerowe wynoszą: ");
                    System.out.println(x1 + " oraz " + x2);
                    break;
                } if (delta == 0)
                {
                    int x0 = -b/ (2*a);
                    System.out.println("Delta ma 1 miejsce zerowe, które jest równe: " + x0);
                    break;
                }
                if (delta < 0){
                    System.out.println("Delta nie ma miejsc zerowych");
                }
                break;

            }
            default:
            {
                System.out.println("Nie ma takiej opcji");

            }
        }
    }
}
