create database dbd_gerfinanc;

use dbd_gerfinanc;

show tables;

desc tb_cartao_bancario;

desc tb_categoria_cartao_bancario;

desc tb_funcao_cartao_bancario;

desc tb_bandeira_cartao_bancario;

desc tb_cartao_bancario;

select * from tb_categoria_cartao_bancario;

select * from tb_funcao_cartao_bancario;

select * from tb_bandeira_cartao_bancario;

select * from tb_cartao_bancario;

insert into tb_categoria_cartao_bancario (codigo, descricao) values (1, 'Basic');
insert into tb_categoria_cartao_bancario (codigo, descricao) values (2, 'Gold');
insert into tb_categoria_cartao_bancario (codigo, descricao) values (3, 'Platinum');
insert into tb_categoria_cartao_bancario (codigo, descricao) values (4, 'Black');

insert into tb_funcao_cartao_bancario (codigo, descricao) values (1, 'Crédito');
insert into tb_funcao_cartao_bancario (codigo, descricao) values (2, 'Débito');

insert into tb_bandeira_cartao_bancario (codigo, descricao) values (1, 'Visa');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (2, 'Mastercard');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (3, 'Americas Express');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (4, 'Diners Club');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (5, 'Discover');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (6, 'EnRoute');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (7, 'Aura');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (8, 'Discover');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (9, 'Voyager');
insert into tb_bandeira_cartao_bancario (codigo, descricao) values (10, 'Hiper Card');

insert into tb_cartao_bancario (codigo, id_categoria_cartao_bancario, id_funcao_cartao_bancario, id_bandeira_cartao_bancario, nome_impresso, numero, data_validade, data_cancelamento, e_aproximacao) values (
    1, (select codigo from tb_categoria_cartao_bancario where descricao like 'Basic'), (1), (2), 'Bolluthen Muergoy Harhoma Gillogo', '5344 1524 1581 4287', '2023-05-02', null, true 
);

insert into tb_cartao_bancario (codigo, id_categoria_cartao_bancario, id_funcao_cartao_bancario, id_bandeira_cartao_bancario, nome_impresso, numero, data_validade, data_cancelamento, e_aproximacao) values (
    2, (select codigo from tb_categoria_cartao_bancario where descricao like 'Gold'), (1), (1), 'Bolluthen Muergoy Harhoma Gillogo', '5182 7942 5764 4390', '2023-09-09', null, true 
);