DROP TABLE if exists Usuario;
CREATE TABLE `poc-jooq`.`Usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) DEFAULT NULL,
  `telefone` VARCHAR(15) DEFAULT NULL,
  `dt-criacao` datetime DEFAULT NULL,

  PRIMARY KEY (`id`));


  
  
