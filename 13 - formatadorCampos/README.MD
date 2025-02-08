# **Máscaras e Formatação em Java**  

As **máscaras** em Java são utilizadas para padronizar a entrada e a exibição de dados, garantindo que informações como CPF, CNPJ, telefones e datas sejam exibidas corretamente. Elas são especialmente úteis em aplicações que exigem validação de dados formatados.  

---

## **1. Máscaras com JFormattedTextField**  
O **JFormattedTextField** é um campo de entrada do Swing que permite aplicar máscaras para restringir o formato dos dados inseridos. Ele funciona junto com a classe **MaskFormatter**, que define o padrão esperado.  

### **Principais Características:**  
- Impede que o usuário insira caracteres fora do formato definido.  
- Pode ser usado para formatar documentos, datas, CEPs, telefones, entre outros.  
- Oferece validação automática da entrada.  

Exemplos de máscaras comuns:  
- CPF: `###.###.###-##`  
- CNPJ: `##.###.###/####-##`  
- Telefone: `(##) ####-####`  
- Data: `##/##/####`  

---

## **2. Máscaras com MaskFormatter**  
A **MaskFormatter** é uma classe usada para definir padrões de entrada em componentes como `JFormattedTextField`.  

### **Símbolos utilizados em máscaras:**  
- `#` → Representa um número.  
- `U` → Converte a letra para maiúscula.  
- `L` → Converte a letra para minúscula.  
- `?` → Permite qualquer letra.  
- `*` → Permite qualquer caractere.  

Essa classe permite criar regras para garantir que a entrada do usuário esteja no formato correto antes de ser processada.  

---

## **3. Formatação com TextFormatter (JavaFX)**  
No JavaFX, a classe **TextFormatter** pode ser usada para restringir e formatar a entrada do usuário em `TextField`.  

### **Principais funcionalidades:**  
- Permite criar regras de validação para a entrada de dados.  
- Possibilita a formatação de números e datas dinamicamente.  
- Facilita o bloqueio de caracteres indesejados.  

---

## **4. Máscaras e Expressões Regulares**  
Além do uso de **JFormattedTextField** e **MaskFormatter**, também é possível utilizar **expressões regulares (Regex)** para validar e formatar entradas manualmente, garantindo maior controle sobre os dados.  

---

## **Conclusão**  
O uso de **máscaras em Java** melhora a experiência do usuário e garante que os dados sejam inseridos corretamente. Ferramentas como **JFormattedTextField**, **MaskFormatter** e **TextFormatter** ajudam a criar interfaces mais intuitivas e confiáveis, evitando erros na entrada de informações. 🚀