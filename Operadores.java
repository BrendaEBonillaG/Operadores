package com.jetbrains;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
//Decalración de variables.
        int x=0;
        int y=0;
        int suma=0, resta=0, multiplicacion=0, division=0, modulo=0;

//Crear el scanner.
        Scanner objeto=new Scanner(System.in);

//Pedir los datos.
        System.out.println("Ingresa el primer número");
        x=objeto.nextInt();

        System.out.println("Ingresa el segundo número");
        y=objeto.nextInt();

//Operadores.
        suma = x+y;
        resta = x-y;
        multiplicacion = x*y;
        division = x/y;
        modulo = x%y;

//Imprimir los resultados
        System.out.println("x:"+x);
        System.out.println("y: "+y);
        System.out.println("EL resultado de la suma es:"+suma);
        System.out.println("EL resultado de la resta es:"+resta);
        System.out.println("EL resultado de la multiplicación es:"+multiplicacion);
        System.out.println("EL resultado de la división es:"+division);
        System.out.println("EL resultado de el módulo es:"+modulo);

    }
}
