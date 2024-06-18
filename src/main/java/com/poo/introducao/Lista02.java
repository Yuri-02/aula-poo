package com.poo.introducao;
import java.util.Scanner;

public class Lista02 {

    void ex1(){
        int numDigitado;

        System.out.println("-----------------------------------");
        System.out.print("Digite um número para saber se é par ou ímpar: ");
        Scanner sc = new Scanner(System.in);

        numDigitado = sc.nextInt();

        if (numDigitado != 0){
            if((numDigitado % 2) == 0){
                System.out.println("O número " + numDigitado + " é par.");
            } else {
                System.out.println("O número " + numDigitado + " é ímpar.");
            }
        } else{
            System.out.println("O número é 0 (zero).");
        }
    }
}
