CREATE TABLE pagamento(
 id_pagamento SERIAL  PRIMARY KEY,
 valor_pagamento decimal(10,2),
 data_pagamento varchar(20),
 id_cliente integer,
 foreign key (id_cliente) references cliente(id_cliente)
)