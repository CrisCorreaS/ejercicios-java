//Cristina Correa Segade
/*
2.1 Hacer programas sencillos que hagan lo siguiente:

b) Leer dos números enteros y muestre si el primero es mayor que el segundo. 
 */
package com.mycompany.ccst02;
//Leer dos números enteros y muestre si el primero es mayor que el segundo.

import java.util.Scanner;

public class Ejercicio01bSimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo");
        } else {
            System.out.println("El segundo número es menor o igual al primer número");
        }
    }
}
