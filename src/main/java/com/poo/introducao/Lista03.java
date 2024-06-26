package com.poo.introducao;

import java.util.Random;
import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;

public class Lista03 {
    

    void ex1(){
        int num;
        boolean respostaErrada = true;

        do {
            System.out.println("------------------------------------------");
            System.out.println("--------------- Cronômetro ---------------");
            System.out.println("------------------------------------------");
            System.out.print("Digite o tempo de 1 a 60 segundos: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
    
            if (num >0 && num <60) {
                System.out.println("Começando a contagem...");
                respostaErrada = false;
                sc.close();  
            } else {
                System.out.println("Tempo fora da faixa permitida!");
            }
        } while ( respostaErrada );
         
        for (int i = num; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }

    void ex2(){
        int num;

        System.out.println("--------");
        System.out.println("Tabuada");
        System.out.println("--------");
        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for (int i=0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
        sc.close();
    }

    void ex3(){
        int num1;
        int num2;
        int i = 0;
        int pares=0;

        System.out.println("--------------------------------");
        System.out.println("Números pares entre dois valores");
        System.out.println("--------------------------------");
        System.out.print("Digite um número inteiro: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        
        num2 = sc.nextInt();

        if(num2 > num1){
            while(pares < num2){
                if((num1 % 2)==0){
                    System.out.println(pares = num1 + i);
                    i +=2;
                } else {
                    System.out.println(pares = num1 + i + 1);
                    i++;
                }
                
            }
        } else {
            while(pares < num1){
                if((num1 % 2)==0){
                    System.out.println(pares = num1 + i);
                    i +=2;
                } else {
                    System.out.println(pares = num1 + i + 1);
                    i++;
                }
                    
            }
        }
        sc.close();
    }

    void ex4(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(10);
        int numeroPalpite;
        boolean acertou = false;
        int diferenca;

        while (!acertou){
            System.out.println("Advinhe o número que estou pensando de 1 a 10: ");
            numeroPalpite = sc.nextInt();

            diferenca = Math.abs(numeroAleatorio - numeroPalpite);

            if (numeroAleatorio == numeroPalpite){
                System.out.println("Parabéns, você acertou!");
                acertou = true;
            }

            else if (diferenca == 1){
                System.out.println("Ta quente!!!");
            }
            else if (diferenca <= 3){
                System.out.println("Ta morno!");
            }
            else if (diferenca <= 10){
                System.out.println("Tá frio...");
            }
            else {
                System.out.println("O número secreto está entre 1 e 10.");
            }
        }
        sc.close();
    }

    void ex5(){
        String loginCheck = "Admin";
        String tryLogin;
        String passwordCheck = "1234";
        String tryPassword;
        boolean logado = false;
        int tentativas = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira suas credenciais com cautela, com 3 tentativas erradas iremos bloquear seu acesso!");
        
        while(!logado && tentativas >0){
            System.out.println("Insira seu login:");
            tryLogin = sc.nextLine();

            if (loginCheck.equals(tryLogin)){

                System.out.println("Insira sua senha:");
                tryPassword = sc.nextLine();

                if (passwordCheck.equals(tryPassword)){
                    System.out.println("Bem-vindo!");
                    logado = true;  
                }
                else {
                    System.out.println("Senha incorreta\n\n");
                    tentativas--;
                }
            }
            else {
                System.out.println("Login Incorreto\n\n");
                tentativas--;
            }

            if (tentativas == 1){
                System.out.println("Última tentativa!");
            }  
            if (tentativas == 0){
                System.out.println("Acesso Bloqueado.");
            }   
        }
        sc.close();
    }

    void ex6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de andares da pirâmide: ");
        int andares = sc.nextInt();

        // Desenha a pirâmide de asteriscos
        for (int i = 1; i <= andares; i++) {

            for (int j = 0; j < andares - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
    
    void ex7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int largura = sc.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        int altura = sc.nextInt();

        // Desenha o retângulo de asteriscos
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
