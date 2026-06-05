CREATE TABLE log.errors_logs
(
    id bigserial primary key,
    error_text  VARCHAR(255) NOT NULL,
    username  VARCHAR(255) NOT NULL,
    log_date    TIMESTAMP DEFAULT NOW()
);