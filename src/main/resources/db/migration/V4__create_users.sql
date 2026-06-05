
CREATE TABLE org.organizations
(
    id bigserial primary key,
    name  VARCHAR(255) NOT NULL,
    email  VARCHAR(255) NOT NULL,
    phone   VARCHAR(255) NOT NULL,
    address  VARCHAR(255) NOT NULL
);

CREATE TABLE org.users (
    id        BIGSERIAL PRIMARY KEY,
    username  VARCHAR(255) NOT NULL,
    password  VARCHAR(255) NOT NULL,
    firstname varchar(50) NOT NULL,
    lastName varchar(100) not null
);