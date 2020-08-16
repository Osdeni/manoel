-- pacientes --
INSERT INTO paciente (id, nome, cpf, telefone) VALUES (1, 'Paciente A', '05951347939', '48991245987');
INSERT INTO paciente (id, nome, cpf, telefone) VALUES (2, 'Paciente B', '12345678909', '48991181415');

-- sessoes --
INSERT INTO sessao (id, data, paciente_id, presenca) VALUES (1, '2020-08-20 15:30:27', 1, 'PRESENTE');
INSERT INTO sessao (id, data, paciente_id, presenca) VALUES (2, '2020-08-20 16:30:25', 2, 'AUSENTE');
INSERT INTO sessao (id, data, paciente_id, presenca) VALUES (3, '2020-08-19 16:30:25', 2, 'CANCELADO');

-- roles --
INSERT INTO role (id, nome) VALUES (1, 'ADMIN');

-- usuarios
INSERT INTO usuario (id, nome, email, senha) VALUES (1, 'admin', 'admin@gmail.com', '$2y$12$G1dhGzoZBRBJ8UQme4V4leng7kaWVtAqkyP2DuRrQ9gL5siZKJy9K');
INSERT INTO user_role (usuario_id, role_id) VALUES (1, 1);

