package com.example.rzeczy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Zadania {
    public static void main(String[] args){


        //powrot do poprzedniego menu jesli wybierzemy niepoprawną opcję
        Scanner wej = new Scanner(System.in);
        System.out.println("          |MENU GŁÓWNE| ");
        System.out.println("-----------------------------------");
        System.out.println("|      1. Koło                    |");
        System.out.println("|      2. Kwadrat                 |");
        System.out.println("|      3. Prostokąt               |");
        System.out.println("|      4. Trójkat                 |");
        System.out.println("|      5. Trapez                  |");
        System.out.println("|      6. Równoległobok           |");
        System.out.println("|      7. Romb lub deltoid        |");
        System.out.println("|      8. Funkcja kwadratowa      |");
        System.out.println("|      9. Figury przestrzenne     |");
        System.out.println("|     10. Przelicznik stopni C-F  |");
        System.out.println("-----------------------------------");
        System.out.println("====================================");
        System.out.println("Co chcesz obliczyć ? (wybierz numer) ");
        System.out.println("====================================");
        char znak = 0;
        znak = (char) wej.nextInt();
        switch (znak) {
            case 1:
            {
                System.out.println("Podaj promień");
                double r = wej.nextDouble();
                double pole_kolo = (double) (Math.PI * (r * r));
                double obw_kolo = (double) (2 *Math.PI * r);
                System.out.println("Pole wynosi: " + pole_kolo);
                System.out.println("Obwód wynosi: " + obw_kolo);
                break;
            }
            case 2:
            {
                System.out.println("Podaj długość boku");
                float a;
                a = wej.nextFloat();
                float pole_kwa = a * a;
                float obw_kwa =  4*a;
                System.out.println("Pole wynosi: " + pole_kwa);
                System.out.println("Obwód wynosi: " + obw_kwa);
                break;
            }
            case 3:
            {
                System.out.println("Podaj długość boku a");
                double a = wej.nextDouble();
                System.out.println("Podaj długość boku b");
                double b = wej.nextDouble();
                double pole_pro = a*b;
                double obw_pro = 2*a+2*b;
                System.out.println("Pole wynosi: " + pole_pro);
                System.out.println("Obwód wynosi: " + obw_pro);
                break;
            }
            case 4:
            {
                System.out.println("Podaj długość podstawy");
                double a = wej.nextDouble();
                System.out.println("Podaj długość boku b");
                double b = wej.nextDouble();
                System.out.println("Podaj długość boku c");
                double c = wej.nextDouble();
                System.out.println("Podaj wysokość");
                double h = wej.nextDouble();
                double pole_tro = (a*h)/2;
                double obw_tro = a + b+ c;
                System.out.println("Pole wynosi: " + pole_tro);
                System.out.println("Obwód wynosi: " + obw_tro);
                break;
            }
            case 5:
            {
                System.out.println("Podaj podstawę");
                double a = wej.nextDouble();
                System.out.println("Podaj drugą podstawę");
                double b = wej.nextDouble();
                System.out.println("Podaj wysokość");
                double h = wej.nextDouble();
                System.out.println("Podaj długości boków");
                double c = wej.nextDouble();
                double d = wej.nextDouble();
                double pole_tra = ((a+b)*h) / 2;
                double obw_tra = a + b + c + d;
                System.out.println("Pole wynosi: " + pole_tra);
                System.out.println("Obwód wynosi: " + obw_tra);
                break;
            }
            case 6:
            {
                System.out.println("Podaj długość podstawy");
                double a = wej.nextDouble();
                System.out.println("Podaj wysokość");
                double h = wej.nextDouble();
                System.out.println("Podaj długości 3 boków");
                double b = wej.nextDouble();
                double c = wej.nextDouble();
                double d = wej.nextDouble();
                double pole_row = a * h;
                double obw_row = a + b + c +d;
                System.out.println("Pole wynosi: " + pole_row);
                System.out.println("Obwód wynosi: " + obw_row);
                break;

            }
            case 7:
            {
                System.out.println("Podaj długości przekątnych" );
                double a = wej.nextDouble();
                double b = wej.nextDouble();
                System.out.println("Podaj długości boków");
                double c = wej.nextDouble();
                double d = wej.nextDouble();
                double e = wej.nextDouble();
                double f = wej.nextDouble();
                double pole_rom = (a*b)/2;
                double obw_rom = c+d+e+f;
                System.out.println("Pole wynosi: " + pole_rom);
                System.out.println("Obwód wynosi: " + obw_rom);
                break;
            }
            case 8:
            {
                System.out.println("Obliczanie delty funkcji kwadratowej");

                System.out.println("Podaj a, b, c");
                System.out.println("a");
                double a = wej.nextDouble();
                if ( a == 0){
                    System.out.println("FUNKCJA NIE ISTNIEJE !");
                    break;
                }
                System.out.println("b");
                double b = wej.nextDouble();
                System.out.println("c");
                double c = wej.nextDouble();
                double delta = (b*b) - 4 *a * c;
                double p = -b/ (2*a);
                double q = -delta/ (4*a);
                System.out.println("Delta wynosi: " + delta);
                System.out.println("Wierzchołek funkcji wynosi " + "(" + p + "," + q + ") ");
                System.out.println("Oś symetrii funkcji wynosi x = " + p);
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
                    double x0 = -b/ (2*a);
                    System.out.println("Delta ma 1 miejsce zerowe, które jest równe: " + x0);
                    break;
                }
                if (delta < 0){
                    System.out.println("Delta nie ma miejsc zerowych");
                }
                break;

            }
            case 9:
            {
                char znak2;
                System.out.println(" MENU FIGUR PRZESTRZENNYCH");
                System.out.println("<==========================>");
                System.out.println("1. Sześcian");
                System.out.println("2. Prostopadłościan");
                System.out.println("3. Kula");
                System.out.println("4. Stożek");
                System.out.println("5. Ostrosłup");
                System.out.println("6. Walec");
                System.out.println("<==========================>");
                znak2 = (char) wej.nextInt();
                switch (znak2)
                {
                    case 1:
                    {
                        char znak_sze;
                        System.out.println("Co chcesz obliczyć ?");
                        System.out.println("1. Pole");
                        System.out.println("2. Obwód");
                        System.out.println("3. Objętość");
                        znak_sze = (char) wej.nextInt();
                        switch (znak_sze)
                        {
                            case 1:
                            {
                                System.out.println("Podaj długość krawędzi");
                                double a = wej.nextDouble();
                                double pole_sze = 6 * (a*a);
                                System.out.println("Pole wynosi " + pole_sze);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Podaj długość krawędzi");
                                double a=wej.nextDouble();
                                double obw_sze = 6 *a;
                                System.out.println("Obwód wynosi " + obw_sze);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Podaj długość krawędzi");
                                double a = wej.nextDouble();
                                double ob_sze = a*a*a;
                                System.out.println("Objętość wynosi " + ob_sze);
                                break;
                            }

                        }
                        break;
                    }
                    case 2:
                    {
                        char znak_pro;
                        System.out.println("Co chcesz obliczyć ?");
                        System.out.println("1. Pole");
                        System.out.println("2. Obwód");
                        System.out.println("3. Objętość");
                        znak_pro = (char) wej.nextInt();
                        switch (znak_pro)
                        {
                            case 1:
                            {
                                System.out.println("Podaj długości krawędzi");
                                double a = wej.nextDouble();
                                double b = wej.nextDouble();
                                double c = wej.nextDouble();
                                double pole_pro = 2*a*b+2*b*c+2*a*c;
                                System.out.println("Pole wynosi "+ pole_pro);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Podaj długości krawędzi");
                                double a = wej.nextDouble();
                                double b = wej.nextDouble();
                                double c = wej.nextDouble();
                                double obw_pro = 4*a+4*b+4*c;
                                System.out.println("Obwód wynosi " + obw_pro);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Podaj długości krawędzi");
                                double a = wej.nextDouble();
                                double b = wej.nextDouble();
                                double c = wej.nextDouble();
                                double ob_pro = a*b*c;
                                System.out.println("Objętość wynosi " + ob_pro);
                                break;
                            }
                            default:
                            {
                                System.out.println("Nie ma takiej opcji");
                            }
                        }
                        break;
                    }
                    case 3:
                    {
                        char znak_ku;
                        System.out.println("Co chcesz obliczyć ?");
                        System.out.println("1. Pole");
                        System.out.println("2. Obwód");
                        System.out.println("3. Objętość");
                        znak_ku = (char) wej.nextInt();
                        switch (znak_ku)
                        {
                            case 1:
                            {
                                System.out.println("Podaj promień");
                                double r = wej.nextDouble();
                                double pole_ku = (double) (4 * Math.PI * (r*r));
                                System.out.println("Pole wynosi " + pole_ku);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Podaj promień");
                                double r = wej.nextDouble();
                                double obw_ku = (double) ((2* Math.PI) * r);
                                System.out.println("Obwód wynosi " + obw_ku);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Podaj promień");
                                double r = wej.nextDouble();
                                double ob_ku = (double) ((4/3) * (Math.PI) * (r*r*r));
                                System.out.println("Objętość wynosi " + ob_ku);
                                break;
                            }
                            default:
                            {
                                System.out.println("Nie ma takiej opcji");

                            }
                            break;

                        }
                        break;

                    }
                    case 4:
                    {
                        System.out.println("Co chcesz obliczyć ?");
                        System.out.println("1. Pole");
                        System.out.println("2. Obwód");
                        System.out.println("3. Objętość");
                        char znak_sto;
                        znak_sto = (char) wej.nextInt();
                                switch(znak_sto)
                                {
                                    case 1:
                                    {
                                        System.out.println("Podaj promień");
                                        double r = wej.nextDouble();
                                        System.out.println("Podaj długość tworzącej stożka");
                                        double l = wej.nextDouble();
                                        double pole_sto = (double) ((Math.PI) * r * (r+l));
                                        System.out.println("Pole wynosi " + pole_sto);
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.println("Podaj promień");
                                        double r = wej.nextDouble();
                                        double obw_sto = (double) ((2*Math.PI) * r);
                                        System.out.println("Obwód wynosi " + obw_sto);
                                        break;
                                    }
                                    case 3:
                                    {
                                        System.out.println("Podaj promień");
                                        double r = wej.nextDouble();
                                        System.out.println("Podaj wysokość");
                                        double h = wej.nextDouble();
                                        double ob_sto = (double) ((((Math.PI) * (r*r) * h)) /3);
                                        System.out.println("Objętość wynosi " + ob_sto);
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Nie ma takiej opcji");

                                    }
                                    break;

                                }
                                break;

                    }
                    case 5:
                    {
                        System.out.println("Co chcesz obliczyć ?");
                        System.out.println("1. Pole");
                        System.out.println("2. Obwód");
                        System.out.println("3. Objętość");
                        char znak_os;
                        znak_os = (char) wej.nextInt();
                        switch (znak_os)
                        {
                            case 1:
                            {
                                System.out.println("Podaj długość krawędzi");
                                double a = wej.nextDouble();
                                System.out.println("Podaj wysokość boku");
                                double h = wej.nextDouble();
                                double pole_os = (a*a) + 2 * a * h;
                                System.out.println("Pole wynosi " + pole_os);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Podaj długość krawędzi podstawy");
                                double a = wej.nextDouble();
                                System.out.println("Podaj ilosć krawędzi bocznych");
                                System.out.println("Podaj długoś krawędzi bocznej");
                                double n = wej.nextDouble();
                                double b = wej.nextDouble();
                                double obw_os = 4 *a + n * b;
                                System.out.println("Obwód wynosi "+ obw_os);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Podaj długość krawędzi podstawy");
                                double a = wej.nextDouble();
                                System.out.println("Podaj wysokość ostrosłupa");
                                double h = wej.nextDouble();
                                double g = a*a;
                                double ob_os = (double) (g/3) * h;
                                System.out.println("Objętość wynosi " + ob_os);
                                break;
                            }
                            default:
                            {
                                System.out.println("Nie ma takiej opcji");

                            }
                            break;

                        }
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Co chcesz obliczyć ?");
                        System.out.println("1. Pole");
                        System.out.println("2. Obwód");
                        System.out.println("3. Objętość");
                        char znak_wa;
                        znak_wa = (char) wej.nextInt();
                        switch (znak_wa)
                        {
                            case 1:
                            {
                                System.out.println("Podaj promień podstawy walca");
                                double r = wej.nextDouble();
                                System.out.println("Podaj wysokość walca");
                                double h = wej.nextDouble();
                                double pole_wa = (double) ((2*Math.PI) * (r*r) + (2*Math.PI) * r * h);
                                System.out.println("Pole wynosi " + pole_wa);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Podaj promień podstawy walca");
                                double r = wej.nextDouble();
                                System.out.println("Podaj wysokość walca");
                                double h = wej.nextDouble();
                                double obw_wa = (double) ((2*Math.PI) * r + 2 * h);
                                System.out.println("Obwód wynosi " + obw_wa);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Podaj promień podstawy walca");
                                double r = wej.nextDouble();
                                System.out.println("Podaj wysokość walca");
                                double h = wej.nextDouble();
                                double ob_wa = (double) ((Math.PI) * (r*r) * h);
                                System.out.println("Objętość wynosi "+ ob_wa);
                                break;
                            }
                            default:
                            {
                                System.out.println("Nie ma takiej opcji");

                            }
                            break;
                        }
                        break;
                    }
                    default:
                    {
                        System.out.println("Nie ma takiej opcji");

                    }
                    break;
                }
                break;
            }
            case 10:
            {
                System.out.println("Czy chcesz przeliczyć:");
                System.out.println("1. Fahrenheity na Celsjusze ?");
                System.out.println("2. Celsjusze na Fahrenheity ?");
                char znak3;
                znak3 = (char) wej.nextInt();
                switch (znak3)
                {
                    case 1:
                    {
                        System.out.println("Podaj temperaturę w °F");
                        double f = wej.nextDouble();
                        double g = f -32;
                        double C = (g * 5) / 9;
                        System.out.println("Temperatura w Celsjuszach wynosi " + C + "°C");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Podaj temperaturę w °C ");
                        double c = wej.nextDouble();
                        double g = c * 9;
                        double f = (g/5) + 32;
                        System.out.println("Temperatura w Fahrenheitach wynosi " + f + "°F");
                        break;
                    }
                    default:
                    {
                        System.out.println("Nie ma takiej opcji");

                    }
                    break;
                }
                break;
            }
            default:
            {
                System.out.println("Nie ma takiej opcji");

            }
            break;
        }

    }
}
