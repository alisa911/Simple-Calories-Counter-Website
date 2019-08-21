[![Codacy Badge](https://api.codacy.com/project/badge/Grade/e8c6d0244b6b4fb3bce0330f2d93e2c0)](https://www.codacy.com/app/javawebinar/topjava)
[![Build Status](https://travis-ci.org/JavaWebinar/topjava.svg?branch=master)](https://travis-ci.org/JavaWebinar/topjava)

Java Enterprise Online Project
===============================

Демо http://simple-calories-counter.herokuapp.com/login

Наиболее востребованные технологии /инструменты / фреймворки Java Enterprise:
Maven/ Spring/ Security/ JPA(Hibernate)/ REST(Jackson)/ Bootstrap(CSS)/ jQuery + plugins.

- Java Enterprise проект с регистрацией/авторизацией и интерфейсом на основе ролей (USER, ADMIN). 

- Администратор может создавать/редактировать/удалять пользователей, а пользователи - управлять своим профилем и данными (день, еда, калории) через UI (по AJAX) и по REST интерфейсу с базовой авторизацией. 

- Возможна фильтрация данных по датам и времени, при этом цвет записи таблицы еды зависит от того, превышает ли сумма калорий за день норму (редактируемый параметр в профиле пользователя). 

- Весь REST интерфейс покрывается JUnit тестами, используя Spring MVC Test и Spring Security Test.
