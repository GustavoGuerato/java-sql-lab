# java-sql-lab

Laboratório de estudos desenvolvido durante o roadmap Java Backend Júnior.

Este repositório reúne exercícios práticos de Java e SQL realizados diariamente com o objetivo de consolidar fundamentos da linguagem, Orientação a Objetos, Collections, Streams, Optional e banco de dados relacional.

## Objetivos de aprendizado

- Compreender os fundamentos da Orientação a Objetos.
- Praticar encapsulamento e abstração.
- Utilizar interfaces e generics.
- Trabalhar com Optional para tratamento de ausência de valores.
- Utilizar Streams para processamento de coleções.
- Criar DTOs com records.
- Aplicar ordenação e agrupamento de dados.
- Revisar comandos básicos de SQL.
- Praticar versionamento com Git e GitHub.

## Tecnologias utilizadas

- Java 21
- PostgreSQL
- Git
- GitHub

## Conceitos praticados

### Java

- Classes e objetos
- Encapsulamento
- Interfaces
- Generics
- Optional
- Records
- Collections
- Streams
- Comparator
- Collectors.groupingBy

### SQL

- CREATE TABLE
- INSERT
- SELECT
- WHERE
- ORDER BY
- LIMIT
- UPDATE
- DELETE

## Estrutura do projeto

```text
java-sql-lab/
├── README.md
├── daily-log.md
├── Day1.java
└── sql/
    └── day1-basics.sql
```

## Como executar

### Pré-requisitos

- JDK 21 instalado
- Terminal ou IDE Java (IntelliJ IDEA, VS Code ou Eclipse)

### Compilar

```bash
javac Day1.java
```

### Executar

```bash
java Day1
```

## Arquivos

### Day1.java

Implementação prática contendo:

- Classe Usuario
- Interface genérica Repositorio<T>
- Repositório em memória
- Uso de Optional
- Uso de Record
- Processamento com Streams
- Ordenação com Comparator
- Agrupamento com Collectors.groupingBy

### sql/day1-basics.sql

Script contendo operações básicas de SQL:

- Criação de tabela
- Inserção de registros
- Consultas simples
- Filtros com WHERE
- Ordenação de resultados
- Atualização de registros
- Remoção de registros

## Aprendizados do dia

Durante este exercício foram praticados conceitos fundamentais que serão utilizados ao longo do desenvolvimento backend com Java, especialmente modelagem de objetos, manipulação de dados e processamento de coleções.

## Próximos passos

- Aprofundar o uso de Streams.
- Praticar Optional sem consulta.
- Estudar Collections com mais profundidade.
- Evoluir para os exercícios do Dia 2.
