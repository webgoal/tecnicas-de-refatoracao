# Substituir construtor por um método fábrica #

> Página: 259

## Mecânica ##

1. Crie um método fábrica. Torne seu corpo uma chamada para o construtor atual.
2. Substitua todas as chamadas ao construtor por chamadas ao método fábrica.
3. Rode os testes após cada substituição.
4. Declare o construtor privado.
5. Rode os testes.

## Criando subclasses com uma string ##

Esta unica alteração por si só não traz muito benificio, pois apenas separa o objeto destinatário da chamada de criação 


# Substituir Enumeração por subclasses #

> Página: 192

## Mecânica ##

1. Auto-encapsule a enumeracao.
2. Para cada valor da enumeração, crie uma subclasse. Sobrescreva o método de leitura da enumeração na subclasse para retornar o valor pertinente.
3. Rode os testes após substituir cada valor da enumeração por uma subclasse.
4. Declare os métodos de acesso à enumeração como abstratos.
5. Rode os testes.