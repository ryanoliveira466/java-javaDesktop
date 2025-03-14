#  Método `split()` em Java

O método `split()` em Java é utilizado para dividir uma `String` em um array de substrings, com base em um delimitador específico.

---

##  **Sintaxe**
```java
public String[] split(String regex)
public String[] split(String regex, int limit)
```

### **Parâmetros**:
- `regex` → Expressão regular usada para dividir a string.
- `limit` (opcional) → Define o número máximo de divisões. Se for um número positivo, o array terá no máximo esse tamanho.

---

##  **Exemplos de Uso**

### **Exemplo 1: Dividindo uma string com espaço**
```java
public class Main {
    public static void main(String[] args) {
        String frase = "Java é incrível!";
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
```
**Saída:**
```
Java
é
incrível!
```

---

### **Exemplo 2: Usando `split()` com vírgula**
```java
public class Main {
    public static void main(String[] args) {
        String lista = "banana,maçã,uva,laranja";
        String[] frutas = lista.split(",");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
```
**Saída:**
```
banana
maçã
uva
laranja
```

---

### **Exemplo 3: Limitando o número de divisões**
```java
public class Main {
    public static void main(String[] args) {
        String texto = "João-Maria-Pedro-Ana";
        String[] nomes = texto.split("-", 2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
```
**Saída:**
```
João
Maria-Pedro-Ana
```
 O primeiro elemento contém `"João"`, e o segundo contém o restante da string, pois o limite foi definido como `2`.

---

##  **Cuidados ao Usar `split()`**
1. **Expressões regulares** → O delimitador passado para `split()` é uma **expressão regular**. Por exemplo, para dividir por ponto `"."`, é necessário escapar (`\\.`):
   ```java
   String ip = "192.168.0.1";
   String[] partes = ip.split("\\.");
   ```

2. **Espaços extras** → Se a string contiver espaços duplos ou caracteres especiais, pode ser necessário **tratar os dados antes** de usar `split()`.

3. **Se o delimitador não for encontrado**, o método retorna um array contendo a string original.

---

##  **Conclusão**
O método `split()` é uma ferramenta poderosa para manipulação de `String` em Java. Ele permite separar textos com base em delimitadores, podendo utilizar expressões regulares e definir limites para o número de divisões.

**Agora você pode usar o `split()` para trabalhar com strings de forma eficiente!🚀**
