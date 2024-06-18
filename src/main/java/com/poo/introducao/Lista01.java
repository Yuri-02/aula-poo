package com.poo.introducao;

import java.util.Scanner;

public class Lista01 { 
    void ex1(){
        int num1;
        int num2;
        int res;

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Digite mais um número: ");

        num2 = sc.nextInt();

        res = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é igual à: " + res);
        sc.close();
    }

    void ex2(){
        String nome;
        String sobrenome;

        System.out.println("Digite seu primeiro nome: ");
        Scanner sc = new Scanner(System.in);

        nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        
        sobrenome = sc.nextLine();

        System.out.println("Olá, " + nome + " " + sobrenome + " !");
        sc.close();
    }

    void ex3(){
        double valorReais;
        double valorDolar;

        System.out.println("Conversor Real R$ - Dólar $ ");
        System.out.print("Valor em R$: ");
        Scanner sc = new Scanner(System.in);

        valorReais = sc.nextDouble();

        valorDolar = valorReais / 5.25;

        System.out.println("------------------");
        System.out.println("Valor em $: " + String.format("%.2f", valorDolar));
        sc.close();
    }

    void ex4(){
        int numEscolhido;
        int numAntecessor;
        int numSucessor;

        System.out.print("Digite um número inteiro para saber seu antessecor e seu sucessor: ");
        Scanner sc = new Scanner(System.in);

        numEscolhido = sc.nextInt();
        numAntecessor = numEscolhido - 1;
        numSucessor = numEscolhido + 1;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Número antecessor: " + numAntecessor);
        System.out.println("Número escolhido: " + numEscolhido);
        System.out.println("Número sucessor: " + numSucessor);
        sc.close();
    }

    void ex5(){
        float largura;
        float comprimento;
        float area;
        double valorMetroQuadrado;
        double valorArea;

        System.out.println("--------------------------------------");
        System.out.print("Digite a largura do terreno em m²: ");
        Scanner sc = new Scanner(System.in);
        largura = sc.nextFloat(); 

        System.out.println("--------------------------------------");
        System.out.print("Digite o comprimento do terreno em m²: ");
        comprimento = sc.nextFloat();

        area = comprimento * largura;

        System.out.println("--------------------------------------");
        System.out.print("Digite o valor do m² desta região: ");
        valorMetroQuadrado = sc.nextDouble();
        valorArea = valorMetroQuadrado * area;

        System.out.println("--------------------------------------");
        System.out.println("A área do terreno é de " + area + "m², " + "e seu valor é de R$ " + valorArea);
        System.out.println("--------------------------------------");
        sc.close();
    }

    void ex6(){
        float distanciaPercorrida;
        float valorGasto;
        float litrosAbastecidos;
        float consumoMedio;

        System.out.println("-------------------------------------------------");
        System.out.print("Digite a quantidade de quilômetros percorridos: ");
        Scanner sc = new Scanner(System.in);

        distanciaPercorrida = sc.nextFloat();

        System.out.println("-------------------------------------------------");
        System.out.print("Digite o valor gasto em reais para abastecer: ");

        valorGasto = sc.nextFloat();
        litrosAbastecidos = valorGasto / 5.5f;
        consumoMedio = distanciaPercorrida / litrosAbastecidos;

        System.out.println("-------------------------------------------------");
        System.out.println("O consumo médio foi de: " + consumoMedio + " Km/l"); 
        sc.close();   
    }

    void ex7(){
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        System.out.println("----------------------------------");
        System.out.print("Digite o nome do aluno: ");
        Scanner sc = new Scanner(System.in);

        nome = sc.nextLine();

        System.out.println("----------------------------------");
        System.out.print("Digite a nota do 1º bimestre: ");

        nota1 = sc.nextFloat();

        System.out.println("----------------------------------");
        System.out.print("Digite a nota do 2º bimestre: ");

        nota2 = sc.nextFloat();

        System.out.println("----------------------------------");
        System.out.print("Digite a note do 3º bimestre: ");

        nota3 = sc.nextFloat();

        System.out.println("----------------------------------");
        System.out.print("Digite a nota do 4º bimestre: ");

        nota4 = sc.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("----------------------------------");
        System.out.println("A média do " + nome + " foi: " + media);
        System.out.println();
        if (media>=6){
            System.out.println("O aluno está aprovado!");
        }   else{
                System.out.println("O aluno está reprovado!");
            }
        System.out.println("----------------------------------");
        sc.close();
    }

    void ex8(){
        float tempCelsius;
        float tempFahrenheit;

        System.out.println("--------------------------------------------");
        System.out.println("Conversor de Fahrenheit °F  para Celsius °C");
        System.out.println("--------------------------------------------");
        System.out.print("Digite a temperatura em Fahrenheit °F para ser convertida em Celsius °C: ");
        Scanner sc = new Scanner(System.in);

        tempFahrenheit = sc.nextFloat();
        tempCelsius = (tempFahrenheit - 32)/1.8f;

        System.out.println("--------------------------------------------");
        System.out.println("Temperatura em °F: " + tempFahrenheit + "°F");
        System.out.println("--------------------------------------------");
        System.out.println("Temperatura em °C: " + tempCelsius + "°C");
        System.out.println("--------------------------------------------");

        sc.close();
    }
}

