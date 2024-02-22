-- Создание таблицы "department"
CREATE TABLE IF NOT EXISTS department (
    dep_id BINARY(32) PRIMARY KEY NOT NULL,
    dep_name VARCHAR(128) NOT NULL UNIQUE,
    service_id BINARY(32) PRIMARY KEY NOT NULL UNIQUE
    );

-- Создание таблицы "users"
CREATE TABLE IF NOT EXISTS users (
    user_id BINARY(32) PRIMARY KEY NOT NULL,
    first_name VARCHAR(128) NOT NULL UNIQUE,
    last_name VARCHAR(128) NOT NULL UNIQUE,
    email VARCHAR(128) NOT NULL,
    phone_number VARCHAR(128) NOT NULL,
    age DOUBLE NOT NULL,
    driver_category VARCHAR(128),
    user_role VARCHAR(16) NOT NULL,
    department_id BINARY(32) PRIMARY KEY NOT NULL,
    service_id BINARY(32) PRIMARY KEY NOT NULL,
    birth_day VARCHAR(128) NOT NULL,
    logistic_id BINARY(32) PRIMARY KEY NOT NULL
    );

-- Создание таблицы "services"
CREATE TABLE IF NOT EXISTS services (
    service_id BINARY(32) PRIMARY KEY NOT NULL,
    service_name VARCHAR(128) NOT NULL UNIQUE,
    dep_id BINARY(32) PRIMARY KEY NOT NULL UNIQUE
    );

-- Создание таблицы "logistic"
CREATE TABLE IF NOT EXISTS logistic (
    auto_id BINARY(32) PRIMARY KEY NOT NULL,
    auto_name VARCHAR(128) NOT NULL UNIQUE,
    auto_status VARCHAR(128) NOT NULL UNIQUE
    );

