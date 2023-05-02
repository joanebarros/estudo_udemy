package org.com.udemy.exercicio;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double largura = sc.nextDouble();
        Double comprimento = sc.nextDouble();
        Double metroQuadrado = sc.nextDouble();

        Double area = largura * comprimento;
        Double preco = area * metroQuadrado;

        System.out.printf("AREA = %2f%n " , area);
        System.out.printf("PRECO = %2f%n " , preco);

        sc.close();
    }



}
