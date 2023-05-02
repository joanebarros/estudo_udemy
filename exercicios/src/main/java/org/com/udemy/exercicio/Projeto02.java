package org.com.udemy.exercicio;

import java.util.Scanner;

// Estrutura condicionada

public class Projeto02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            if (hora < 18) {
                System.out.println("Boa tarde!");
            }
            else {
                System.out.println("Boa noite!");
            }
        }
        sc.nextInt();
    }
}
