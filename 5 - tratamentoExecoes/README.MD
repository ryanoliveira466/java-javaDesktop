# Desafio da Aula - Tratamento de Exceções

Você é o mais novo estagiário de uma empresa do ramo financeiro, e sua primeira atividade será implementar um pequeno programa que realize o cálculo de juros de uma solicitação de empréstimo.

## **Requisitos do Sistema**
- O usuário digita as informações de: **valor solicitado** (em reais) e **quantidade de prestações** (em meses).
- O programa deverá aplicar, **a juros compostos**, a alíquota de:
  - **2,5% ao mês**, caso o total de prestações esteja entre **1 a 12 meses**.
  - **3,5% ao mês**, caso a quantidade de prestações esteja entre **13 a 24 meses**.
- O programa deverá apresentar ao usuário:
  - **O valor total do empréstimo**.
  - **O valor de cada parcela**.
  - **Solicitação de confirmação dos valores**.

---

## **Implementação**
- O desafio deverá ser implementado utilizando **métodos externos à classe principal**.
- Implementar uma **classe em Java** contendo **dois métodos**:
  1. **Método para calcular o valor das prestações**.
  2. **Método para determinar o montante do empréstimo**.
- A classe deverá conter **tratamento de exceções**, incluindo:
  - **Número de prestações zerado**.
  - **Valor do empréstimo igual a zero**.
  - **Inclusão de letras no local de números**.
