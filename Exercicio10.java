package com.poo.exerciciosroni.listaroni;

import java.util.Scanner;

public class Exercicio10 {
  
    public static void resolucao() {
        Scanner sc1 = new Scanner(System.in);

        int segundosx, segundos, minuto, hora;

        System.out.println("Digite a hora em segundos: ");
        segundosx = sc1.nextInt();

        hora = segundosx/3600;
        minuto = (segundosx%3600)/60;
        segundos = segundosx%60;

        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundos);
        
    }

}