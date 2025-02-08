# Desafio Básico

Desenvolver o código da interface criada, denominada `radio`, criando a classe `RadioDeBolso`.

## **Especificações**

- **Definir os atributos**:  
  - `ligadoDesligado` (*boolean*)  
  - `tocarMusica` (*boolean*)  
  - `volume` (*int*)  
  - `estacaoAtual` (*double*)  
  - `banda` (*AM/FM*)  
  - Além dos demais atributos que julgar necessários.

- **Implementar construtores**:  
  - Um vazio.  
  - Outro contendo todos os atributos.

- **Incluir os métodos** `getters` e `setters` para todos os atributos criados.

- **Desenvolver os métodos abstratos** implementados pela interface.

---

## **Funcionalidades do Aparelho**
- Só será possível acionar o **play**, **aumentar/diminuir volume** e **trocar estação** se o rádio estiver ligado.
- A troca da **banda de recepção** deverá sempre ser realizada entre **AM e FM**, considerando a equivalência das faixas.
- Faixa das estações deve estar contida entre:
  - **87 a 108 MHz (FM)**
  - **520 a 1710 kHz (AM)**
- Escala de volume deve estar contida na faixa de valores entre **0 a 50 unidades**.
- Incrementos de volume devem ser de **5 unidades** a cada execução do método.
- A função **pause** só pode ser acionada se a função **play** estiver ativa.

---

## **Testes**
- Criar pelo menos **1 rádio**.
- Testar todas as funcionalidades.

---

## Interface para o RádioBolso

<img src="1 - Questões/interface.png" alt="Descrição da imagem">