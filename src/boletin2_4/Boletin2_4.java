
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

      public static void main(String[] args) {
        Scanner objScaner = new Scanner(System.in);
        System.out.println("Teclea primer número");
        float num1 = objScaner.nextFloat();
        System.out.println("Teclea segundo número");
        float num2=objScaner.nextFloat();
        float suma=num1+num2;
        float resta=num1-num2;
        float multiplicacion=num1*num2;
        float division=num1/num2;
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicación = " + multiplicacion);
        System.out.println("División = " + division);
    }
    
}
