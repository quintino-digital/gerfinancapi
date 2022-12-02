create table if not exists tb_cartao_bancario (
    codigo integer not null, 
    id_categoria_cartao_bancario integer not null, 
    id_bandeira_cartao_bancario integer not null, 
    id_funcao_cartao_bancario integer not null, 
    numero varchar(100) not null unique, 
    nome_impresso varchar(100) not null, 
    data_validade date not null, 
    data_cancelamento date null, 
    e_aproximacao boolean not null
);

alter table tb_cartao_bancario add constraint pk_cartao_bancario primary key (codigo);

alter table tb_cartao_bancario add unique (numero);

alter table tb_cartao_bancario modify column codigo int comment "Identificador Único da Tabela";
alter table tb_cartao_bancario modify column id_categoria_cartao_bancario int comment "Chave Estrangeira da Tabela";
alter table tb_cartao_bancario modify column id_bandeira_cartao_bancario int comment "Chave Estrangeira da Tabela";
alter table tb_cartao_bancario modify column id_funcao_cartao_bancario int comment "Chave Estrangeira da Tabela";
alter table tb_cartao_bancario modify column numero int comment "Refere-se ao Número de um determinado Cartão de Crédito";
alter table tb_cartao_bancario modify column nome_impresso int comment "Refere-se ao Nome Impresso em um determinado Cartão de Crédito";
alter table tb_cartao_bancario modify column data_validade int comment "Refere-se ao Data de Validade de um determinado Cartão de Crédito";
alter table tb_cartao_bancario modify column data_cancelamento int comment "Refere-se ao Data de Cancelamento de um determinado Cartão de Crédito";
alter table tb_cartao_bancario modify column e_aproximacao int comment "Indica se um determinado Cartão de Crédito possuí tecnologia de realizar pagamentos com Aproximação";
