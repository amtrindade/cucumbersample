#language: pt

Funcionalidade: Calculadora

    Esquema do Cenário: Deve efetuar a soma de valores
        Dado que informo os valores <valor1> e <valor2>
        Quando aciono a operação 'somar'
        Então o valor calculado deve ser <total>

        Cenários:
            |valor1 |valor2 | total |
            |1      |2      |3      |
            |3      |4      |7      |
            |3      |5      |8      |
            |20     |30     |50     |

    Esquema do Cenário: Deve efetuar a subtração de valores
        Dado que informo os valores <valor1> e <valor2>
        Quando aciono a operação 'subtrair'
        Então o valor calculado deve ser <total>

        Cenários:
            |valor1 |valor2 | total |
            |5      |2      |3      |
            |11     |4      |7      |
            |12     |5      |7      |
            |80     |30     |50     |

