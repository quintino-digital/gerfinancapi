    create table if not exists tb_bandeira_cartao_bancario (
        codigo integer not null,
        descricao varchar(100) not null unique
    );

    alter table tb_bandeira_cartao_bancario add constraint pk_bandeira_cartao_bancario primary key (codigo);

    alter table tb_bandeira_cartao_bancario add unique (descricao);