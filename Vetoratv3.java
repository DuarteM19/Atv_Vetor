package com.mycompany.vetoratv3;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Vetoratv3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
        int[] numeros = new int[15]; 
        int pares = 0; 
        int impares = 0; 

        
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}