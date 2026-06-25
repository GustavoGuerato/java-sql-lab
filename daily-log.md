# Daily Log — Dia 1

## Data

25/06/2026

## Tempo de estudo

(Preencher)

## Objetivo do dia

Ter o primeiro contato prático com Java moderno e revisar comandos básicos de SQL.

## O que implementei

### Java

- Classe `Usuario` com encapsulamento utilizando getters e setters.
- Interface genérica `Repositorio<T>`.
- Implementação em memória de repositório de usuários.
- Busca de usuários utilizando `Optional`.
- Uso de `record` para criação de DTOs.
- Processamento de coleções com Streams.
- Ordenação com `Comparator`.
- Agrupamento de dados utilizando `Collectors.groupingBy`.
- Testes das funcionalidades no método `main`.

### SQL

Arquivo `sql/day1-basics.sql` contendo:

- CREATE TABLE
- INSERT
- SELECT
- WHERE
- ORDER BY
- LIMIT
- UPDATE
- DELETE

## Conceitos estudados

### Java

- Classes e objetos
- Encapsulamento
- Interfaces
- Generics
- Optional
- Records
- Streams
- Comparator
- Collectors

### SQL

- Estrutura de tabelas
- Inserção de dados
- Consultas básicas
- Filtros com WHERE
- Ordenação de resultados
- Atualização e remoção de registros

## O que entendi

- Interfaces definem contratos que implementações devem seguir.
- Generics permitem reutilização de código com segurança de tipos.
- Optional representa a possibilidade de um valor existir ou não.
- Records reduzem código repetitivo para objetos de transporte de dados.
- Streams permitem processar coleções de forma declarativa.
- Comparator facilita ordenações customizadas.
- WHERE é fundamental para evitar alterações acidentais em múltiplos registros.

## Onde tive dificuldade

- Entender o uso de classes internas `static`.
- Compreender quando utilizar `Optional`.
- Entender o funcionamento do `Collectors.groupingBy`.
- Memorizar a sintaxe inicial de Streams.
- Problemas ao colar blocos de código em Markdown.

## O que pesquisei

- Optional
- Record
- Streams
- Collectors
- groupingBy
- Comparator
- SQL básico
- PostgreSQL IDENTITY

## O que ainda preciso praticar

- Criar Streams sem consultar exemplos.
- Utilizar Optional de forma natural.
- Fazer agrupamentos e transformações de listas.
- Reescrever o projeto do dia sem copiar código anterior.

## Resultado do dia

Consegui construir um pequeno projeto Java utilizando conceitos modernos da linguagem e revisar os comandos fundamentais de SQL. Ainda dependo de consulta para alguns tópicos, mas compreendo a finalidade geral de cada um deles.

## Próximo passo

- Commitar o Dia 1.
- Revisar Streams e Optional.
- Iniciar o Dia 2.
- Tentar implementar novos métodos sem consultar exemplos anteriores.
