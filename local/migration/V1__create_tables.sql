CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE indicacao(
    id            UUID                     NOT NULL PRIMARY KEY DEFAULT uuid_generate_v4(),
    nome          VARCHAR(100)             NOT NULL,
    ano           INT                      NOT NULL,
    tipo          VARCHAR(5)               NOT NULL,
    usuario       VARCHAR(20)              NOT NULL
);