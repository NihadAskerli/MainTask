/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import util.mathutuil;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kalculator {

    public static double calculate() {
//        double r=topla(3,4);
//        System.out.println("r="+r);
//        esas run eden ise main methodudur
//      double a=4;
//    double b=7;
//      double r= topla(b,a);
//       System.out.println("r="+r);
//       ferqi yoxdu a nin evezine b oturur b nin evezine a basqa heriflerde ola biler
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        double a = sc.nextDouble();
        System.out.println("b=");
        double b = sc.nextDouble();
        System.out.println("operation=");
        int operation = sc.nextInt();
        double result = 0;
        if (operation == 1) {
            result =mathutuil.topla(a, b);
        } else if (operation == 2) {
            result = mathutuil.cix(a, b);
        } else if (operation == 3) {
            result = mathutuil.vur(a, b);
        } else if (operation == 4) {
            result = mathutuil.bol(a,b);
        }else{
            System.out.println("operation is not valid");
        }
        switch (operation) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                result = -1;

        }

        return result;

    }

}
