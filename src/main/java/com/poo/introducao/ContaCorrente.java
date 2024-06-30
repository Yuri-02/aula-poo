package com.poo.introducao;

import java.util.ArrayList;

public class ContaCorrente {
    int numeroConta;
    double saldo;
    String titular;
    ArrayList<Operacao> extrato = new ArrayList<>();

    void depositar(double deposito){
        saldo += deposito;
        Operacao op = new Operacao();
        op.tipo = "Depósito";
        op.valor = deposito;
        op.saldoApos = saldo;
        extrato.add(op);
        System.out.println("Depósito efetuado com sucesso !");
        System.out.println("Seu novo saldo é: " + saldo);
    }
    void sacar(double saque){
        if(saque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= saque;
            Operacao op = new Operacao();
            op.tipo = "Saque";
            op.valor = saque;
            op.saldoApos = saldo;
            extrato.add(op);
            System.out.println("Saque efetuado com sucesso !");
            System.out.println("Seu novo saldo é: " + saldo);
        }
    }
    void saldo(){
        System.out.println("Seu saldo é: " + saldo);
    }
    void extrato(){
        for(Operacao op : extrato){
            System.out.println("Operação: " + op.tipo);
            System.out.println("Valor: " + op.valor);
            System.out.println("Horário: " + op.horario);
            System.out.println("Saldo: " + op.saldoApos);
        }
    }
}
