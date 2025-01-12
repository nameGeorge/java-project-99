### Hexlet tests and linter status:
[![Actions Status](https://github.com/nameGeorge/java-project-99/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/nameGeorge/java-project-99/actions)
[![Java CI](https://github.com/nameGeorge/java-project-99/actions/workflows/my-check.yml/badge.svg)](https://github.com/nameGeorge/java-project-99/actions/workflows/my-check.yml)

### Maintainability and Test coverage:
<a href="https://codeclimate.com/github/nameGeorge/java-project-99/maintainability"><img src="https://api.codeclimate.com/v1/badges/b9cf179f38c80e7a7aab/maintainability" /></a>
<a href="https://codeclimate.com/github/nameGeorge/java-project-99/test_coverage"><img src="https://api.codeclimate.com/v1/badges/b9cf179f38c80e7a7aab/test_coverage" /></a>

### Описание
Менеджер задач – веб-сайт предназначенный для управления задачами. Система позволяет ставить задачи, назначать исполнителей и устанавливать статусы задач.
Веб-сайт разработан на языке Java с использованием фреймворка Spring Boot. Деплой произведен на хостинге render.com, также возможен локальный запуск веб-приложения.
В качестве базы данных в продакшен среде использована БД PostgreSQL, при локальном запуске - база данных H2 в памяти.

### Использование
Адрес веб-сайта: https://java-project-99-1-36tt.onrender.com



Для работы с системой требуется регистрация и аутентификация:

- логин: hexlet@example.com
- пароль: qwerty

### Локальная установка

    git clone git@github.com:nameGeorge/java-project-99.git
    cd java-project-99
    make install

### Локальный запуск

    make run-dist

в браузере перейти на http://localhost:8080/