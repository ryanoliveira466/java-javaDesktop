
# Public, Protected , Default, Private

Em Java, os modificadores de acesso (`public`, `protected`, `private`, e o *default* — sem modificador) controlam a visibilidade de classes, métodos e atributos. Vamos entender cada um com exemplos, explicações e o que acontece se você tentar acessá-los fora do escopo permitido.

---

### 🔓 `public`

* **Acesso**: Em qualquer lugar (mesmo em outros pacotes).
* **Exemplo**:

```java
package pacote1;

public class Pessoa {
    public String nome = "Maria";
}
```

```java
package pacote2;

import pacote1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.nome); // Funciona normalmente
    }
}
```

✅ **Acesso permitido** mesmo de outro pacote.

---

### 🔐 `private`

* **Acesso**: Apenas dentro da própria classe.
* **Exemplo**:

```java
package pacote1;

public class Pessoa {
    private String nome = "João";

    public String getNome() {
        return nome;
    }
}
```

```java
package pacote1;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        // System.out.println(p.nome); ❌ Erro de compilação
        System.out.println(p.getNome()); // ✅ OK via método público
    }
}
```

❌ **Erro de compilação** se tentar acessar fora da classe, mesmo estando no mesmo pacote:

> `nome has private access in Pessoa`

---

### 🛡️ `protected`

* **Acesso**:

  * Dentro do mesmo pacote
  * Fora do pacote, **somente por herança**
* **Exemplo**:

```java
package pacote1;

public class Pessoa {
    protected String nome = "Carlos";
}
```

```java
package pacote2;
import pacote1.Pessoa;

public class Funcionario extends Pessoa {
    public void mostrarNome() {
        System.out.println(nome); // ✅ Pode acessar por herança
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.mostrarNome();
        
        // System.out.println(f.nome); ❌ Erro: nome has protected access
    }
}
```

✅ Funciona por herança
❌ Não funciona por instância fora do pacote

---

### 🔹 *Default* (sem modificador)

* **Acesso**: Apenas dentro do mesmo pacote
* **Exemplo**:

```java
package pacote1;

class Pessoa {
    String nome = "Ana";
}
```

```java
package pacote2;

// Erro: Pessoa is not public in pacote1; cannot be accessed from outside package
public class Main {
    public static void main(String[] args) {
        // Pessoa p = new Pessoa(); ❌ Erro de compilação
    }
}
```

❌ **Erro** fora do pacote, mesmo com `import`:

> `Pessoa is not public in pacote1; cannot be accessed from outside package`

---

### 🔄 Resumo Rápido

| Modificador | Mesmo pacote                 | Subclasse (outro pacote) | Fora do pacote         |
| ----------- | ---------------------------- | ------------------------ | ---------------------- |
| `public`    | ✅                            | ✅                        | ✅                      |
| `protected` | ✅                            | ✅                        | ❌ (exceto por herança) |
| *default*   | ✅                            | ❌                        | ❌                      |
| `private`   | ❌ (somente dentro da classe) | ❌                        | ❌                      |

---



<br>
<br>
<br>
<br>
<br>
<br>

---
### ⬇
---
<br>
<br>
<br>
<br>
<br>
<br>



# Interfaces

Claro! Aqui vai um **resumo direto e prático** sobre **interfaces** em Java, incluindo **métodos** e **métodos `default`**:

---

## 📘 **O que é uma Interface em Java?**

Uma **interface** é um **contrato**: define **o que** uma classe deve fazer, mas **não como**.

* Contém **métodos abstratos** (sem corpo, por padrão)
* É implementada por classes usando `implements`
* Pode conter **constantes** (`public static final`)
* Desde o Java 8, pode ter **métodos `default`** e **métodos `static`**

---

## ✅ **Exemplo Básico de Interface**

```java
public interface Animal {
    void fazerSom(); // método abstrato
}
```

---

## ✅ **Classe que implementa a Interface**

```java
public class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
```

* A classe **deve implementar todos os métodos** da interface.
* Se não implementar, deve ser marcada como `abstract`.

---

## 💡 **Métodos `default`**

Desde o Java 8, métodos em interfaces **podem ter corpo**, usando a palavra-chave `default`.

### ✅ Exemplo com método `default`:

```java
public interface Animal {
    void fazerSom();

    default void dormir() {
        System.out.println("O animal está dormindo...");
    }
}
```

### ✅ Usando na classe:

```java
public class Gato implements Animal {
    public void fazerSom() {
        System.out.println("Miau!");
    }

    // Não precisa implementar dormir(), a menos que queira sobrescrever
}
```

---

## 🧪 **Testando na prática**

```java
public class Main {
    public static void main(String[] args) {
        Animal a = new Gato();
        a.fazerSom();   // Miau!
        a.dormir();     // O animal está dormindo...
    }
}
```

---

## 🧠 **Resumo Rápido**

| Elemento            | Interface pode ter?          |
| ------------------- | ---------------------------- |
| Métodos abstratos   | ✅ (por padrão)               |
| Métodos `default`   | ✅ (Java 8+)                  |
| Métodos `static`    | ✅ (Java 8+)                  |
| Atributos           | ✅ (só `public static final`) |
| Construtores        | ❌                            |
| Código de instância | ❌                            |

---

## 🛠️ Quando usar Interface?

* Quando quer **definir um comportamento comum** a várias classes (ex: `Comparable`, `Runnable`)
* Quando quer **flexibilidade de múltiplas implementações** (Java **só permite herança única**, mas uma classe pode **implementar várias interfaces**)

---



<br>
<br>
<br>
<br>
<br>
<br>

---
### ⬇
---
<br>
<br>
<br>
<br>
<br>
<br>



---

## 📦 O que é uma **classe abstrata**?

Uma **classe abstrata** é uma classe **incompleta**, que **não pode ser instanciada diretamente** e **serve como base** para outras classes.

### ✳️ Características:

* Pode conter **métodos abstratos** (sem corpo)
* Pode conter **métodos concretos** (com corpo)
* Pode ter **atributos**, **construtores**, e **qualquer outro membro**
* Usada com a palavra-chave `abstract`

```java
public abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Método abstrato: deve ser implementado por subclasses
    public abstract void fazerSom();
}
```

---

## 🔧 O que é um **método abstrato**?

É um **método sem corpo** (só a assinatura), que **deve ser implementado** por qualquer subclasse concreta da classe abstrata.

```java
public abstract void fazerSom();
```

---

## ✅ Exemplo de uso:

```java
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void fazerSom() {
        System.out.println("Au au!");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Bicho"); ❌ ERRO: Não pode instanciar classe abstrata
        Animal dog = new Cachorro("Bob");
        dog.fazerSom(); // Au au!
        dog.dormir();   // Bob está dormindo.
    }
}
```

---

## 🔗 **Semelhança com Interfaces (contrato)**

Tanto **interfaces** quanto **classes abstratas** definem um **contrato**, ou seja, exigem que certas ações sejam implementadas por outras classes.

| Comparação                 | Interface                       | Classe Abstrata              |
| -------------------------- | ------------------------------- | ---------------------------- |
| Pode ter métodos abstratos | ✅                               | ✅                            |
| Pode ter métodos concretos | ✅ (`default` ou `static`)       | ✅ (normalmente)              |
| Pode ter atributos         | ✅ (só `public static final`)    | ✅ (com qualquer modificador) |
| Pode ter construtores      | ❌                               | ✅                            |
| Pode estender outra classe | ❌ (mas pode implementar várias) | ✅ (herança única)            |
| Pode implementar várias?   | ✅                               | ❌                            |

---

## 🧠 Quando usar o quê?

* Use **interface**: quando quer **apenas definir um contrato** (sem preocupar com estado ou implementação).
* Use **classe abstrata**: quando quer **reutilizar código comum** entre subclasses e ainda **obrigar implementação** de certos métodos.

---
