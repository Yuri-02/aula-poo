package com.poo.introducao;

import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;

public class Lista03 {
    

    void ex1(){
        //final long interval = 1000;
       // Timer timer = new Timer();
    //     int tempo;
    //     System.out.println("-----------");
    //     System.out.println("Cronômetro");
    //     System.out.println("-----------");
    //     System.out.println("Digite um valor de tempo em segundos de 1 a 59");
    //     Scanner sc = new Scanner(System.in);

    //     tempo = sc.nextInt();

    
            
            
    //     for(int i=0; i<tempo; i++){

        
            
    //         Timer timer = new Timer();
    //         final long interval = 1000;
    
    //         TimerTask cronometro = new TimerTask() {
    //         @Override
    //         public void run() {

    //         System.out.println("-----------");
    //         System.out.println(i);
            
    //         }
    //     }; timer.scheduleAtFixedRate(cronometro, 0, interval);
    // }
            
    //         sc.close();
        
        
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
}
