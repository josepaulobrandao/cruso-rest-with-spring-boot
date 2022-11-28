CREATE TABLE IF NOT EXISTS  public.books (
  id serial  PRIMARY KEY,
  author VARCHAR(4000),
  launch_date date NOT NULL,
  price decimal(65,2) NOT NULL,
  title VARCHAR(4000)
);