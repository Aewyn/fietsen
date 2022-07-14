insert into groepscursussen(id, naam, van, tot)
VALUES (uuid_to_bin(uuid()), 'testGroep', '2018-01-01', '2018-01-01');
insert into individuelecursussen(id, naam, duurtijd)
VALUES (uuid_to_bin(uuid()), 'testIndividueel', 3);