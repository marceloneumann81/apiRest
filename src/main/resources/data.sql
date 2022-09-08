INSERT INTO athlete (name, surname, birth_date, height, weight) VALUES ('Marcelo Neumann', '3:30conversando', '1981-04-05', 1.65, 72.200);
INSERT INTO athlete (name, surname, birth_date, height, weight) VALUES ('Amanda Almeida Cominese', '', '1992-12-11', 1.63, 56.000);
INSERT INTO athlete (name, surname, birth_date, height, weight) VALUES ('Alícia Cominese Grisoski', 'lilica', '2011-10-01', 1.52, 35.000);

INSERT INTO personalbest (id_athlete, pb1k, pb5k, pb10k) VALUES (1,'00:03:47', '00:23:15', '00:48:50');

INSERT INTO race (race_date, description, race_time, id_athlete, distance, type ) VALUES ('2022-07-28', 'Corrida teste', '00:30:00', 1, 1, 0);
INSERT INTO race (race_date, description, race_time, id_athlete, distance, type ) VALUES ('2022-08-01', 'Corrida teste2', '00:29:00', 2, 1, 1);
INSERT INTO race (race_date, description, race_time, id_athlete, distance, type ) VALUES ('2022-08-01', 'Corrida teste3', '00:28:00', 3, 1, 2);
INSERT INTO race (race_date, description, race_time, id_athlete, distance, type ) VALUES ('2022-07-28', 'Corrida teste', '00:25:00', 1, 2, 0);
INSERT INTO race (race_date, description, race_time, id_athlete, distance, type ) VALUES ('2022-07-28', 'Corrida teste', '00:29:00', 2, 2, 0);
INSERT INTO race (race_date, description, race_time, id_athlete, distance, type ) VALUES ('2022-07-28', 'Corrida teste', '00:30:00', 3, 3, 0);