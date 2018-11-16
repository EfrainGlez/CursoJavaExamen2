#Examen Curso de Java - Spring Boot

La aplicación necesita acceder a una base de datos llamada curso_java con 2 tablas: client y policy

##client
```
CREATE TABLE `client` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `name` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

##policy
```
CREATE TABLE `policy` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `amount_insured` float DEFAULT '0',
  `email` varchar(50) DEFAULT NULL,
  `inception_date` varchar(50) DEFAULT NULL,
  `installment_payment` tinyint(1) DEFAULT NULL,
  `client_id` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```


###Endpoints visibles:
La aplicación correrá en http://localhost:8091
```
https://localhost:8091/clients
http://localhost:8091/clients/id/{id}
http://localhost:8091/clients/name/{name}
http://localhost:8091/clients/email/{email}
http://localhost:8091/clients/role/{role}
```

