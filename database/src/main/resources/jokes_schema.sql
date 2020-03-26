CREATE SCHEMA IF NOT EXISTS jokes;
SET search_path TO jokes;
CREATE TABLE IF NOT EXISTS joke
(
    id                    SERIAL PRIMARY KEY,
    category              VARCHAR(127) references category(category) ON UPDATE CASCADE ON DELETE CASCADE,
    joke                  TEXT not null
);

CREATE TABLE IF NOT EXISTS category
(
    category              VARCHAR(127) PRIMARY KEY not null
)