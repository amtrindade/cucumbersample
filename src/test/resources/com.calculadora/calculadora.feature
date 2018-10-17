#language: pt

Funcionalidade: Calculadora

    Contexto:

    Cenário: Deve efetuar a soma de valores
        Dado que informo os valores 1 e 2
        Quando aciono a operação 'somar'
        Então o valor calculado deve ser 3

    Cenário: Deve efetuar a subtração de valores
        Dado que informo os valores 3 e 1
        Quando aciono a operação 'subtrair'
        Então o valor calculado deve ser 2
