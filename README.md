# 📚 Kotlin DSA – Estruturas de Dados & Algoritmos

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-2.0+-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img src="https://img.shields.io/badge/Finalidade-Estudo-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge" />
</p>

Repositório de estudos com implementações de **estruturas de dados**, **algoritmos clássicos** e **exercícios de lógica** resolvidos em Kotlin.

> 🎯 O objetivo é consolidar conhecimento e servir como referência pública para quem estuda programação competitiva e entrevistas técnicas.

---

## 📂 Estrutura do Projeto

```
kotlin-dsa/
├── src/
│   └── main/kotlin/
│       ├── datastructures/        # Implementações de estruturas de dados
│       │   ├── arrays/
│       │   ├── linkedlist/
│       │   ├── stack/
│       │   ├── queue/
│       │   ├── tree/
│       │   ├── graph/
│       │   ├── hashtable/
│       │   └── heap/
│       │
│       ├── algorithms/            # Algoritmos clássicos
│       │   ├── sorting/
│       │   ├── searching/
│       │   ├── recursion/
│       │   ├── dynamicprogramming/
│       │   ├── greedy/
│       │   ├── backtracking/
│       │   └── divideandconquer/
│       │
│       └── exercises/             # Exercícios de lógica e desafios
│           ├── easy/
│           ├── medium/
│           └── hard/
│
├── src/
│   └── test/kotlin/               # Testes unitários
│       ├── datastructures/
│       ├── algorithms/
│       └── exercises/
│
├── docs/                          # Anotações e explicações teóricas
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## 🧱 Estruturas de Dados

| Estrutura        | Status | Arquivo                              |
|------------------|--------|--------------------------------------|
| Array / Lista    | ⬜     | `datastructures/arrays/`             |
| Lista Ligada     | ⬜     | `datastructures/linkedlist/`         |
| Pilha (Stack)    | ⬜     | `datastructures/stack/`              |
| Fila (Queue)     | ⬜     | `datastructures/queue/`              |
| Árvore Binária   | ⬜     | `datastructures/tree/`               |
| Grafo            | ⬜     | `datastructures/graph/`              |
| Tabela Hash      | ⬜     | `datastructures/hashtable/`          |
| Heap             | ⬜     | `datastructures/heap/`               |

> Legenda: ⬜ Pendente · 🟡 Em andamento · ✅ Concluído

---

## ⚙️ Algoritmos

| Categoria              | Status | Arquivo                              |
|------------------------|--------|--------------------------------------|
| Ordenação              | ⬜     | `algorithms/sorting/`                |
| Busca                  | ⬜     | `algorithms/searching/`              |
| Recursão               | ⬜     | `algorithms/recursion/`              |
| Programação Dinâmica   | ⬜     | `algorithms/dynamicprogramming/`     |
| Algoritmos Gulosos     | ⬜     | `algorithms/greedy/`                 |
| Backtracking           | ⬜     | `algorithms/backtracking/`           |
| Divisão e Conquista    | ⬜     | `algorithms/divideandconquer/`       |

---

## 🧩 Exercícios de Lógica

Os exercícios estão organizados por nível de dificuldade:

| Dificuldade | Diretório           | Descrição                            |
|-------------|---------------------|--------------------------------------|
| 🟢 Fácil    | `exercises/easy/`   | Fundamentos e lógica básica          |
| 🟡 Médio    | `exercises/medium/` | Combinação de conceitos              |
| 🔴 Difícil  | `exercises/hard/`   | Desafios avançados e otimização      |

---

## 🚀 Como Executar

### Pré-requisitos

- **JDK 17+**
- **Kotlin 2.0+**

### Rodar os testes

```bash
./gradlew test
```

### Rodar um arquivo específico

```bash
./gradlew run --args="NomeDoArquivo"
```

---

## 📝 Template para Exercícios

Ao adicionar um novo exercício, siga este padrão:

```kotlin
/**
 * Exercício: [Nome do Exercício]
 * Fonte: [LeetCode / HackerRank / Próprio / etc.]
 * Dificuldade: [Fácil / Médio / Difícil]
 *
 * Descrição:
 * [Descreva o problema aqui]
 *
 * Exemplo:
 * Input: ...
 * Output: ...
 *
 * Complexidade:
 * Tempo: O(...)
 * Espaço: O(...)
 */
fun nomeDaSolucao(params: Tipo): TipoRetorno {
    // Sua solução aqui
}
```

---

## 📖 Recursos de Estudo

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
- [LeetCode](https://leetcode.com/)
- [HackerRank](https://www.hackerrank.com/)
- [NeetCode Roadmap](https://neetcode.io/roadmap)
- [Visualgo – Visualização de Algoritmos](https://visualgo.net/)

---

## 🤝 Contribuições

Este é um repositório pessoal de estudos, mas sugestões e melhorias são bem-vindas! Sinta-se à vontade para abrir uma **issue** ou **pull request**.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
