package com.calculadora;

public class Calculadora {
    private int valor1;
    private int valor2;
    private String operacao;

//    public Calculadora(int valor1, int valor2) {
//        this.valor1 = valor1;
//        this.valor2 = valor2;
//    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int somar(){
        return this.getValor1() + this.getValor2();
    }

    public int subtrair() {
        return this.getValor1() - this.getValor2();
    }
}
