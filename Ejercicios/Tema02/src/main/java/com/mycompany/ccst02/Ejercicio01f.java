//Cristina Correa Segade

/*
2.1 Hacer programas sencillos que hagan lo siguiente:

f) Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos). 

 */
package com.mycompany.ccst02;
//Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).

import java.util.Scanner;

public class Ejercicio01f {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();

        if (num1 >= 10 && num1 <= 20) {
            System.out.println("El número " + num1 + " es un número comprendido en el intervalo entre 10 y 20");
        } else {
            if (num1 < 10) {
                System.out.println("El número " + num1 + " es un número menor de 10");
            } else {
                System.out.println("El número " + num1 + " es un número mayor de 20");
            }
        }
    }
}
