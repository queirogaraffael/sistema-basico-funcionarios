# Gerenciador de Funcionários

Este é um projeto simples em Java que simula a gestão básica de funcionários em uma empresa. Ele realiza operações como:

- Cadastro de funcionários com salário bruto e taxa de desconto.
- Exibição das informações dos funcionários.
- Aumento salarial de forma aleatória em um dos funcionários.
- Cálculo do salário líquido de cada funcionário.

## Funcionalidades

1. **Cadastro de Funcionários**  
   A aplicação inicia com uma lista pré-definida de funcionários.

2. **Exibição de Informações**  
   Mostra os dados brutos de todos os funcionários.

3. **Aumento Salarial Aleatório**  
   Aplica um aumento percentual de 10% no salário bruto de um funcionário escolhido aleatoriamente.

4. **Cálculo do Salário Líquido**  
   Exibe o valor do salário líquido de cada funcionário, subtraindo a taxa de desconto.

## Estrutura do Projeto

- **Pacote `application`**  
  Contém a classe `Program`, responsável pela lógica principal da aplicação.

- **Pacote `entities`**  
  Contém a classe `Employee`, que representa a estrutura de um funcionário, com nome, salário bruto e taxa.

## Tecnologias

- Java SE
- Programação Orientada a Objetos
- `java.util.List`, `java.util.Random`
