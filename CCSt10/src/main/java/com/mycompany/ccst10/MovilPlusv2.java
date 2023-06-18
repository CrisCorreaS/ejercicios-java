//Cristina Correa Segade
//Ejercicio 12

package com.mycompany.ccst10;


public class MovilPlusv2 extends MovilPrepagov2 {
    MovilPlusv2(long nM, float cEL, float cML, float cMB, float s) {
        super(nM, cEL, cML, cMB, s);
    }

    @Override
    public void efectuarLlamada(int segundos) {
        saldo -= Math.round((costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void videollamada(int seg) {
        saldo -= Math.round(costeConsumoMB * 2 * seg * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }
}