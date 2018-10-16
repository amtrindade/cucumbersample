package com.calculadora;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class CalculadoraStep {
    private Calculadora calc;

    @Dado("que informo os valores {int} e {int}")
    public void dado_que_informo_os_valores(int valor1, int valor2){
        calc = new Calculadora();
        calc.setValor1(valor1);
        calc.setValor2(valor2);
    }

    @Quando("aciono a operação {string}")
    public void aciono_a_operacao(String operacao){
        if (operacao.equals("somar")){
            System.out.println("Somou");
        }
    }

    @Entao("o valor calculado deve ser {int}")
    public void valor_calculado_deve_ser(int total){
        assertEquals(total, calc.somar());
    }
}
