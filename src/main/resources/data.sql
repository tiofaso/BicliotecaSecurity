--Inserindo regras na db
INSERT INTO tb_role(role) values('ROLE_USER');
INSERT INTO tb_role(role) values('ROLE_ADMIN');

-- Inserindo usuários na db
-- Senha do tiofaso é 12345 e do fabiovaz 67890
INSERT INTO tb_usuario(password ,username) VALUES('$2a$10$zQiIOknKCgT0s7hWk8hVXODcAbuvRsnp697yy2hF1eQl66KzNrfqW','tiofaso');
INSERT INTO tb_usuario(password ,username) VALUES('$2a$10$X.c07v7omxJDI7ytri5fy.fR.VQluJoMITuGru4LiNFDbX/b.XDpO','fabiovaz');

-- Definindo regras para cada usuário
INSERT INTO tb_usuarios_roles(id_usuario,id_role) values('1','2');
INSERT INTO tb_usuarios_roles(id_usuario,id_role) values('2','1');

-- Inserindo um livro
INSERT INTO tb_livro(autor, datade_lancamento, isbn, nome) values('Pablo Rangel','2021','9786588431412','Sistemas Orientados a Objetos');