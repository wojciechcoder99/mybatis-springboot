create table rental (
  id BIGINT primary key,
  name varchar(255),
  location varchar(255)
);

create table car (
  id BIGINT primary key,
  name varchar(255),
  model varchar(255),
  rental_id BIGINT references rental(id) 
);




