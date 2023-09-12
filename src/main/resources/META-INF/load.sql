INSERT INTO Hospital(NOMEFANTASIA, RAZAOSOCIAL, DATADAABERTURA, CEP, LOGRADOURO, NUMERO, BAIRRO, COMPLEMENTO, CNPJ, ATIVO) VALUES ('Hospital ABC', 'João da Silva', TO_DATE('2023-09-11', 'YYYY-MM-DD'), 12345678, 'Rua Hospitalar', 123, 'Bairro Saúde', 'Sem Complemento', '1234567890123', 1);
INSERT INTO Médico(NOME, CPF, CNPJ, CMR, ESPECIALIDADE, CEP, LOGRADOURO, NUMERO, BAIRRO, COMPLEMENTO, ATIVO) VALUES('Renato Ruiz', '12345678901', '12345678901234', 'cmr123456', 'Cardiologista', 87654321, 'Rua Médica', 1245, 'Bairro Saúde', 'Complemento Médico', 1);
INSERT INTO Usuário(NOME, CPF, EMAIL, SENHA, DATADENASCIMENTO, CEP, LOGRADOURO, NUMERO, BAIRRO, COMPLEMENTO) VALUES ('Elizabeth Grant', '23324234126', 'lanadelrey@email.com', '210685', TO_DATE('1985-06-21', 'YYYY-MM-DD'), 67890453, 'Rua das Lamentações', 505, 'Hollywood', 'Sem Complemento');
INSERT INTO Agendamento(DATA, DESCRICAO) VALUES (TO_DATE('2023-09-17', 'YYYY-MM-DD'), 'Consulta Médica de Clínica Geral');
INSERT INTO Agendamento(DATA, DESCRICAO) VALUES (TO_DATE('2023-09-12', 'YYYY-MM-DD'), 'Consulta Médica de Endocrinologista');