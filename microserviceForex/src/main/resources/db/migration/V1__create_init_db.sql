create table exchange_value (
    id int8 not null,
    conversion_multiple numeric(19, 2),
    currency_from varchar(255),
    port int4 not null,
    currency_to varchar(255),
    primary key (id)
)