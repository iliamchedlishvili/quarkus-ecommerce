
CREATE TABLE emp.users (
    id        BIGSERIAL PRIMARY KEY,        -- Long + GenerationType.IDENTITY
    username  VARCHAR(255) NOT NULL,        -- @Column(nullable = false)
    password  VARCHAR(255)                  -- nullable by default
);