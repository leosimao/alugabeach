CREATE TABLE app_user (
    id VARCHAR(36) PRIMARY KEY NOT NULL DEFAULT gen_random_uuid()::text,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(100) NOT NULL
);

CREATE TABLE sand_court (
    id VARCHAR(36) PRIMARY KEY NOT NULL DEFAULT gen_random_uuid()::text,
    court_number INTEGER NOT NULL,
    capacity INTEGER NOT NULL,
    status VARCHAR(100)
);

CREATE TABLE reservations (
    id VARCHAR(36) PRIMARY KEY NOT NULL DEFAULT gen_random_uuid()::text,
    user_id VARCHAR(36) NOT NULL,
    sand_court_id VARCHAR(36) NOT NULL,
    date_reservation TIMESTAMP(6) WITHOUT TIME ZONE NOT NULL,
    status VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES app_user(id),
    FOREIGN KEY (sand_court_id) REFERENCES sand_court(id)
)