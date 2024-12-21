CREATE TABLE employee (
      id SERIAL PRIMARY KEY,
      first_name VARCHAR(250) NOT NULL,
      last_name VARCHAR(250) NOT NULL,
      email VARCHAR(250) UNIQUE NOT NULL
);

INSERT INTO employee (first_name, last_name, email) VALUES
  ('Leslie', 'Andrews', 'leslie@luv2code.com'),
  ('Emma', 'Baumgarten', 'emma@luv2code.com'),
  ('Avani', 'Gupta', 'avani@luv2code.com'),
  ('Yuri', 'Petrov', 'yuri@luv2code.com'),
  ('Juan', 'Vega', 'juan@luv2code.com');