//Cristina Correa Segade
//Ejercicio 6

package com.mycompany.ccst08;


public class Figura2Dv6 {
    
    private double ancho;
    private double alto;

    Figura2Dv6(double b, double h) {
        ancho = b;
        alto = h;
    }

    Figura2Dv6(double l) {
        ancho = l;
        alto = l;
    }

    Figura2Dv6() {
        ancho = 0;
        alto = 0;
    }

    public void setAncho(double a) {
        ancho = a;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double a) {
        alto = a;
    }

    public double getAlto() {
        return alto;
    }

    public void verDim() {
        System.out.printf("El ancho es: %.2f y el alto es: %.2f%n", ancho, alto);
    }
}
