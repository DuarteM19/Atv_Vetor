package com.mycompany.vetoratv2;

import java.util.Scanner;


  
/**
 *
 * @author daniel
 */
public class Vetoratv2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes: ");
        for (int i = 0; i < 10; i++) {
            nomes[i] = scanner.nextLine();
              
        }

        System.out.print("Digite o nome a ser buscado: ");
        String nomeBuscado = scanner.nextLine();

        int posicao = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Nome encontrado na posição: " + posicao);
        } else {
            System.out.println("Nome não encontrado.");
        }

        scanner.close();
    }
}