# 🎓 Sistema de Estudantes e Bolsistas em Java

Projeto desenvolvido em Java com o objetivo de praticar conceitos básicos de **Programação Orientada a Objetos (POO)**.

O sistema representa estudantes de uma universidade e utiliza herança para criar uma classe específica para estudantes bolsistas.

## 📚 Conceitos utilizados

Neste projeto foram utilizados conceitos como:

- Classes e objetos
- Herança
- Construtores
- Uso do `super`
- Sobrescrita de métodos (`@Override`)
- Atributos específicos em classes filhas
- Métodos para realização de cálculos

## 🧩 Estrutura do projeto

O projeto possui as seguintes classes:

### `estudantes`

Classe responsável por armazenar as informações básicas de um estudante, como:

- Matrícula
- Ano de ingresso
- Curso

Ela também possui um método responsável por definir o preço padrão de uma cópia.

### `bolsistas`

A classe `bolsistas` herda as características da classe `estudantes`.

Além das informações de estudante, ela possui uma característica própria:

- Valor da bolsa

A classe também sobrescreve o método `precoCopia()`, fazendo com que estudantes bolsistas paguem um valor diferente pelas cópias.

Também possui o método `qntCopias()`, responsável por calcular quantas cópias podem ser feitas de acordo com o valor da bolsa.

## 💻 Exemplo

Um bolsista pode ser criado da seguinte forma:

```java
bolsistas b = new bolsistas(
    "2613723",
    2026,
    "CC",
    2000
);
