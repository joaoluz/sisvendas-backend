	  
CREATE TABLE tab_categoria (
	id serial NOT NULL,
	nome varchar NOT NULL,
	id_categoria_pai integer null,
	PRIMARY KEY(id)	
);

ALTER TABLE tab_categoria
ADD CONSTRAINT fk_categoria_pai
      FOREIGN KEY(id_categoria_pai) 
	  REFERENCES tab_categoria(id)