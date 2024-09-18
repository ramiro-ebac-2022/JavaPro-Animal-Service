INSERT INTO 
 animal (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
 ('Cachorrinho da Ebac', 3, 'SRD', current_date, 'Bem pulguento', 'Cleber', 'Pequeno');

INSERT INTO 
 animal (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
 ('Outro Cachorrinho da Ebac', 5, 'Poodle', current_date, 'Com anemia', 'Sandra', 'Grande'); 
 
INSERT INTO 
 animal (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, data_adocao)
VALUES
 ('Totó', 1, 'Doberman', current_date, 'Forte', 'Giovanna', 'Pequeno', current_date); 
 
 INSERT INTO 
 animal (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte)
VALUES
 ('Outro Cachorrinho da Giovanna', 2, 'Chihuahua', current_date, 'Perfeitamente saudável', 'Giovanna', 'pequeno'); 
 
 INSERT INTO especie (nome_especie) VALUES ('CACHORRO');
 INSERT INTO especie (nome_especie) VALUES ('GATO');
 
 INSERT INTO raca (id_especie, nome_raca, caracteristicas) VALUES (1, 'Poodle', 'Carinhoso');
 INSERT INTO raca (id_especie, nome_raca, caracteristicas) VALUES (1, 'Doberman', 'Protetor');
 INSERT INTO raca (id_especie, nome_raca) VALUES (2, 'SRD');