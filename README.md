# TemplateForBot
Это тестовый шаблон для создания ботов в будущем

---

перед работой над каждым проектом мы создаем отдельную базу данных, и к ней отдельного юзера, для этого
сначала в командной строке пишем:

    -mariadb.exe -u root -p

Затем уже в командной строке MariaDB:

    CREATE DATABASE своё_название_бд;

    CREATE USER 'свой_юзернейм'@'localhost' IDENTIFIED BY 'свой_пароль';

    GRANT ALL PRIVILEGES ON своё_название_бд.* TO 'свой_юзернейм'@'localhost';

    FLUSH PRIVILEGES;

После этого нужно настроить подключение нашего Hibernate к MariaDB, для этого
в application properties нам нужно добавить следующие строчки:

    spring.datasource.url=jdbc:mariadb://localhost:3306/свое_название
    spring.datasource.username=свой_юзернейм
    spring.datasource.password=свой_пароль
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect

## Примечание 1
данные подсказки предназначены для версии java 25

## Примечание 2
Лучше не запускать код пока не заполнишь все классы в папке db
