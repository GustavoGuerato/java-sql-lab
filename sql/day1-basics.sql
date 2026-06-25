CREATE TABLE
  usuarios (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL UNIQUE,
    idade INT NOT NULL,
    ativo BOOLEAN NOT NULL
  );

INSERT INTO
  usuarios (nome, email, idade, ativo)
VALUES
  ('João Silva', 'joao@email.com', 25, TRUE),
  ('Maria Souza', 'maria@email.com', 30, TRUE),
  ('Pedro Santos', 'pedro@email.com', 19, FALSE),
  ('Ana Oliveira', 'ana@email.com', 28, TRUE),
  ('Carlos Lima', 'carlos@email.com', 35, FALSE);

SELECT
  *
FROM
  usuarios;

SELECT
  *
FROM
  usuarios
WHERE
  id = 2;

SELECT
  *
FROM
  usuarios
WHERE
  ativo = TRUE;

SELECT
  *
FROM
  usuarios
WHERE
  idade >= 25;

SELECT
  idade,
  id
FROM
  usuarios
ORDER BY
  idade ASC;

SELECT
  *
FROM
  usuarios
ORDER BY
  idade DESC
LIMIT
  3;

UPDATE usuarios
SET
  nome = 'Gustavo teste'
WHERE
  id = 1;

SELECT
  *
FROM
  usuarios
WHERE
  id = 1;

DELETE FROM usuarios
WHERE
  id = 1;

SELECT
  *
FROM
  usuarios;
