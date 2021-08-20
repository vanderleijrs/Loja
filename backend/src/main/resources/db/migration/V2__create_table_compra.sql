CREATE TABLE compra  (
 id_compra SERIAL  PRIMARY KEY,
 descricao varchar(50),
 data_compra varchar(20),
 valor_unitario decimal(10,2),
 quantidade integer,
 valor_total decimal(10,2),
 id_cliente integer,
 foreign key (id_cliente) references cliente (id_cliente)
)