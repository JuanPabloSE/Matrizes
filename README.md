# 📊 Matrizes em Java

Este repositório contém estudos e exercícios práticos sobre **matrizes (arrays bidimensionais) em Java**, abordando desde os conceitos básicos até a aplicação em problemas de lógica de programação.

---

## 📌 O que é uma Matriz?

Uma **matriz** é um array **bidimensional**, ou seja, uma estrutura de dados organizada em **linhas e colunas**.

Podemos imaginar uma matriz como uma **tabela**:

```
[0][0] [0][1] [0][2]
[1][0] [1][1] [1][2]
[2][0] [2][1] [2][2]
```

Em Java, uma matriz é declarada da seguinte forma:

```java
int[][] matriz = new int[3][3];
```

* `3` linhas
* `3` colunas

---

## 📌 Atributo `length`

Em Java, todo array possui o atributo `length`, que indica seu tamanho.

### Para matrizes:

* `matriz.length` → quantidade de **linhas**
* `matriz[i].length` → quantidade de **colunas da linha i**

Exemplo:

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

📌 Utilizar `length` torna o código mais **seguro, flexível e profissional**.

---

## 📌 Leitura de uma Matriz com Scanner

```java
Scanner sc = new Scanner(System.in);

int M = sc.nextInt(); // linhas
int N = sc.nextInt(); // colunas

int[][] matriz = new int[M][N];

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = sc.nextInt();
    }
}
```

---

## 📌 Percorrendo Matrizes

### 🔹 For tradicional

Utilizado quando é necessário acessar **índices (linha e coluna)**:

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

Ideal para:

* Diagonal principal
* Comparação de posições
* Alterar valores da matriz

---

### 🔹 For-each

Utilizado quando apenas precisamos **percorrer os valores**, sem usar índices:

```java
for (int[] linha : matriz) {
    for (int valor : linha) {
        System.out.print(valor + " ");
    }
    System.out.println();
}
```

Ideal para:

* Impressão
* Soma de valores
* Contagem de elementos

---

## 📌 Quando usar cada tipo de `for`

| Situação           | For tradicional | For-each |
| ------------------ | --------------- | -------- |
| Precisa do índice  | ✅               | ❌        |
| Apenas ler valores | ✅               | ✅        |
| Alterar elementos  | ✅               | ❌        |
| Código mais limpo  | ⚠️              | ⭐        |

---

## 📌 Boas Práticas

* Prefira usar `length` ao invés de valores fixos
* Use nomes claros para linhas e colunas
* Escolha o tipo de `for` de acordo com o problema
* Evite repetir código

---

## 🎯 Objetivo do Repositório

* Praticar lógica de programação
* Aprender o uso correto de matrizes em Java
* Resolver exercícios acadêmicos e de plataformas como Beecrowd
* Consolidar a base para estruturas de dados mais avançadas

---

🚀 **Estudos em andamento — evolução constante!
