
CREATE TABLE production.warehouses
(
    id BIGSERIAL PRIMARY KEY,
    name varchar(50) NOT NULL
);

CREATE TABLE production.unit_types
(
    id BIGSERIAL PRIMARY KEY,
    name varchar(50) NOT NULL
);

CREATE TABLE production.products
(
    bar_code varchar(20) NOT NULL,
    org_id bigint NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id  bigint not null,
    name  VARCHAR(255) NOT NULL,
    quantity numeric(10,2) NOT NULL,
    price numeric(10,2) NOT NULL,
    unit_type_id bigint NOT NULL,
    log_date    TIMESTAMP DEFAULT NOW(),

    primary key (bar_code, org_id),

    constraint fk_products_user_id
        foreign key (user_id)
            references org.users,

    constraint fk_products_unit_type_id
        foreign key (unit_type_id)
            references production.unit_types
);

CREATE TABLE production.products_in
(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    bar_code varchar(20) NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id  bigint not null,
    name  varchar(200) NOT NULL,
    quantity numeric(10,2) NOT NULL,
    price numeric(10,2) NOT NULL,
    unit_type_id bigint NOT NULL,
    status numeric NOT NULL,
    date_in    TIMESTAMP DEFAULT NOW(),

    constraint fk_products_user_id
        foreign key (user_id)
    references org.users,

    constraint fk_products_warehouse_id
        foreign key (warehouse_id)
    references production.warehouses
);

CREATE TABLE production.products_out
(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    bar_code varchar(20) NOT NULL,
    user_id bigint NOT NULL,
    warehouse_id  bigint not null,
    name  varchar(200) NOT NULL,
    quantity numeric(10,2) NOT NULL,
    price numeric(10,2) NOT NULL,
    unit_type_id bigint NOT NULL,
    status numeric NOT NULL,
    date_out  TIMESTAMP DEFAULT NOW(),

    constraint fk_products_user_id
        foreign key (user_id)
            references org.users,

    constraint fk_products_warehouse_id
        foreign key (warehouse_id)
        references production.warehouses
);
