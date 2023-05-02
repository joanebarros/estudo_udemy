package org.com.udemy.exercicio;

import java.util.Scanner;

public class Projeto01 {
    public static void main(String[] args) {
        // Exemplo 1
        double x = 10.35784;
        String nome = "Maris";
        int idade = 31;
        double renda = 4000.0;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4fn", x);
        System.out.println(" RESULTADO =" + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        // Exemplo 2
        Scanner sc = new Scanner(System.in);

        String y;
        int w;
        Double z;
        y = sc.next();
        w = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(y);
        System.out.println(w);
        System.out.println(z);

        sc.close();
    }

}
