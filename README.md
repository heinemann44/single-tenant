## Como rodar o projeto

1. Rodar o banco de dados com docker

```bash
    docker compose up
```

2. Abrir o bash do container

```bash
    docker exec -ti postgres-single-tenant bash
```

3. Conectar na base de dados

```bash
    psql -h localhost -p 5432 -U local_user -d local_database
```

4. Rodar o script de criar tabelas

```bash
    CREATE TABLE IF NOT EXISTS PESSOAS (
        ID UUID CONSTRAINT ID_PK PRIMARY KEY,
        APELIDO VARCHAR(32) UNIQUE,
        NOME VARCHAR(100),
        NASCIMENTO CHAR(10),
        STACK TEXT,
        BUSCA_TRGM TEXT GENERATED ALWAYS AS ( LOWER(NOME || APELIDO || STACK) ) STORED
    );

    CREATE EXTENSION PG_TRGM;
    CREATE INDEX CONCURRENTLY IF NOT EXISTS IDX_PESSOAS_BUSCA_TGRM ON PESSOAS USING GIST (BUSCA_TRGM GIST_TRGM_OPS(SIGLEN=64));
```
