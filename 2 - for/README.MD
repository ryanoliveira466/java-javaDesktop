# 🔁 Estruturas de Repetição: `for` em Java

O `for` é uma estrutura de repetição em Java que permite executar um bloco de código um número determinado de vezes. Ele é muito útil quando sabemos exatamente quantas vezes queremos repetir a execução.

---

## 📌 **Sintaxe do `for`**
```java
for (inicialização; condição; incremento/decremento) {
    // Código a ser repetido
}
```

### **Componentes do `for`**:
1. **Inicialização** → Executada apenas uma vez antes do loop começar.
2. **Condição** → O loop continua enquanto essa condição for verdadeira.
3. **Incremento/Decremento** → Atualiza a variável de controle a cada iteração.

---

## 📌 **Exemplo 1: Contando de 1 a 5**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}
```
**Saída:**
```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

---

## 📌 **Exemplo 2: Loop de decremento**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Contagem regressiva: " + i);
        }
        System.out.println("Fogo! 🚀");
    }
}
```
**Saída:**
```
Contagem regressiva: 5
Contagem regressiva: 4
Contagem regressiva: 3
Contagem regressiva: 2
Contagem regressiva: 1
Fogo! 🚀
```

---

## 📌 **Exemplo 3: Percorrendo um Array com `for`**
```java
public class Main {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Uva", "Laranja"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }
    }
}
```
**Saída:**
```
Fruta: Maçã
Fruta: Banana
Fruta: Uva
Fruta: Laranja
```

---

## 📌 **Exemplo 4: `for-each` (Para percorrer coleções)**
O `for-each` simplifica a iteração sobre arrays e coleções.

```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};

        for (int num : numeros) {
            System.out.println("Número: " + num);
        }
    }
}
```
**Saída:**
```
Número: 10
Número: 20
Número: 30
Número: 40
```
✅ **Vantagens do `for-each`**:
- Evita erros com índices.
- Código mais limpo e legível.
- Útil para listas e arrays.

---

## 📌 **Exemplo 5: `for` aninhado (Loop dentro de outro loop)**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + "  ");
            }
            System.out.println();
        }
    }
}
```
**Saída:**
```
1,1  1,2  1,3  
2,1  2,2  2,3  
3,1  3,2  3,3  
```
🚀 **Uso comum:** Matrizes e tabelas.

---

## 📌 **Cuidados ao usar `for`**
⚠️ **Evite loops infinitos!**  
Se a condição nunca for falsa, o loop rodará para sempre, travando o programa.

```java
for (int i = 1; i > 0; i++) {  // Condição nunca será falsa!
    System.out.println("Loop infinito...");
}
```

---

## 📌 **Conclusão**
O `for` é uma estrutura poderosa em Java, ideal para repetir blocos de código de maneira eficiente. Seja para contar números, percorrer arrays ou lidar com coleções, ele é essencial para qualquer desenvolvedor Java.

🔥 **Agora que você domina o `for`, pratique criando seus próprios loops!** 🚀