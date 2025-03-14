#  Arrays e ArrayList em Java

Em Java, um **array** é uma estrutura de dados que armazena elementos do mesmo tipo em uma sequência contínua na memória. No entanto, os arrays possuem **tamanho fixo**, o que pode ser uma limitação. Para coleções dinâmicas, usamos **ArrayList**.

---

#  **1. Arrays em Java**

## **Declaração e Inicialização de Arrays**
### ** Declarando um Array**
```java
tipo[] nomeArray;
```
Ou:
```java
tipo nomeArray[];
```
Exemplo:
```java
int[] numeros;
String[] nomes;
```

### ** Criando um Array**
Antes de usar um array, é necessário **inicializá-lo** com um tamanho definido:
```java
int[] numeros = new int[5];  // Array de inteiros com 5 posições
```

Por padrão, os arrays em Java são inicializados com valores padrão:
- **Inteiros (`int`, `byte`, `short`, `long`)** → `0`
- **Ponto flutuante (`float`, `double`)** → `0.0`
- **Booleano (`boolean`)** → `false`
- **Objetos (`String`, `Integer`, etc.)** → `null`

---

## **Atribuição de Valores e Acesso aos Elementos**
Cada elemento do array pode ser acessado pelo índice, que começa em `0`.

```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3]; 

        // Atribuindo valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Acessando valores
        System.out.println(numeros[0]); // 10
        System.out.println(numeros[1]); // 20
        System.out.println(numeros[2]); // 30
    }
}
```

---

## **Percorrendo Arrays com `for`**
### ** Usando `for` tradicional**
```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }
    }
}
```

### ** Usando `for-each`**
```java
public class Main {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Uva"};

        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }
}
```

---

#  **2. ArrayList em Java**
O **ArrayList** é uma coleção dinâmica que permite armazenar elementos sem um tamanho fixo.

### ** Importando a Classe `ArrayList`**
Antes de usar `ArrayList`, devemos importar o pacote:
```java
import java.util.ArrayList;
```

## ** Criando um `ArrayList`**
```java
ArrayList<Tipo> nomeLista = new ArrayList<>();
```

Exemplo:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
    }
}
```

---

## ** Adicionando Elementos**
```java
nomes.add("Ana");
nomes.add("Bruno");
nomes.add("Carlos");
```

## ** Acessando Elementos**
```java
System.out.println(nomes.get(0)); // Ana
```

## ** Tamanho da Lista**
```java
System.out.println(nomes.size()); // 3
```

---

## ** Percorrendo um `ArrayList`**
### ** Com `for` tradicional**
```java
for (int i = 0; i < nomes.size(); i++) {
    System.out.println(nomes.get(i));
}
```

### ** Com `for-each`**
```java
for (String nome : nomes) {
    System.out.println(nome);
}
```

---

## ** Removendo Elementos**
```java
nomes.remove(1); // Remove "Bruno"
```

## ** Verificando se contém um elemento**
```java
System.out.println(nomes.contains("Carlos")); // true
```

---

#  **Conclusão**
 **Arrays** são úteis quando o tamanho dos dados é fixo e precisamos de desempenho rápido.  
 **ArrayList** é mais flexível, permitindo adicionar e remover elementos dinamicamente.

**Agora que você sabe a diferença entre Arrays e ArrayList, experimente utilizá-los em seus projetos!🚀**
