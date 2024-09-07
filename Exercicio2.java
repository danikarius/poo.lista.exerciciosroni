package com.poo.exerciciosroni.listaroni;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {

        int num1;

        System.out.print("Digite um número: ");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        System.out.println("O sucessor é: "+(num1+1));
        System.out.println("O antecessor é: "+(num1-1));
        
    }

}