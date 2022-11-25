create table if not exists tb_funcao_cartao_bancario (
    codigo integer auto_increment not null,
    descricao varchar(100) not null unique,
    primary key (codigo)
);