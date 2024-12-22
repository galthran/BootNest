CREATE TABLE "user" (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(250) NOT NULL,
    enabled BOOLEAN NOT NULL  DEFAULT TRUE
);

INSERT INTO "user" (username, password, enabled)
VALUES ('john', '{noop}test123', TRUE),
       ('mary', '{noop}test123', TRUE),
       ('susan', '{noop}test123', TRUE);

CREATE TABLE "authorities"
(
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES "user" (username)
);

INSERT INTO "authorities" (username, authority)
VALUES ('john', 'ROLE_EMPLOYEE'),
       ('mary', 'ROLE_EMPLOYEE'),
       ('mary', 'ROLE_MANAGER'),
       ('susan', 'ROLE_EMPLOYEE'),
       ('susan', 'ROLE_MANAGER'),
       ('susan', 'ROLE_ADMIN');