## O que é um arquivo CSV?
CSV (Comma-Separated Values) é um formato de arquivo utilizado para armazenar dados estruturados em texto simples. Os valores são separados por vírgulas (ou outro delimitador, como ponto e vírgula) e podem representar tabelas, listas ou bancos de dados simples.

Por exemplo, um arquivo CSV contendo informações sobre veículos pode ter este formato:
```
Marca,Modelo,Ano,Combustivel
Toyota,Corolla,2020,Gasolina
Ford,Fiesta,2018,Flex
```
Cada linha representa um registro, e os valores são separados por vírgulas.

---

## Como o CSV é usado no código `PersistenciaDadosCSV.java`?
O código Java fornecido implementa a persistência de dados em um arquivo CSV. Ele contém três métodos principais:

1. **Criar Arquivo (`criarArquivoDados`)**  
   - Usa a classe `File` para criar um arquivo no caminho especificado.
   - Verifica se o arquivo já existe e exibe mensagens informativas.

2. **Gravar Dados no Arquivo CSV (`gravarDadosArquivoCSV`)**  
   - Recebe uma lista de objetos do tipo `Veiculo` e grava suas propriedades no arquivo CSV.
   - Usa a classe `FileWriter` para escrever os dados no arquivo.
   - Cada linha do arquivo segue o formato: `marca,modelo,ano,combustivel`.

3. **Ler Dados do Arquivo CSV (`leituraDadosCSV`)**  
   - Abre o arquivo CSV usando `Scanner` e lê os dados linha por linha.
   - Usa `split(",")` para dividir cada linha nos atributos do veículo.
   - Converte os valores em um objeto `Veiculo` e os armazena em um `ArrayList`.

Esse código permite salvar e recuperar dados de veículos de forma simples e eficiente usando o formato CSV. 🚗📄
