CREATE TABLE IF NOT EXISTS animal (
  id INT AUTO_INCREMENT NOT NULL,
  nome_provisorio VARCHAR(255) NOT NULL,
  idade_estimada INT NOT NULL,
  raca VARCHAR(255) NOT NULL,
  data_entrada date NOT NULL,
  data_adocao date,
  condicoes_chegada VARCHAR(255) NOT NULL,
  nome_recebedor VARCHAR(255) NOT NULL,
  data_obito date,
  porte VARCHAR(255) NOT NULL,
  CONSTRAINT pk_animal PRIMARY KEY (id)
); 
CREATE TABLE IF NOT EXISTS especie (
  id INT AUTO_INCREMENT NOT NULL,
  nome_especie VARCHAR(255) NOT NULL
);
CREATE TABLE IF NOT EXISTS raca (
  id INT AUTO_INCREMENT NOT NULL,
  id_especie INT NOT NULL,
  nome_raca VARCHAR(255) NOT NULL,
  caracteristicas VARCHAR(255) NULL
);