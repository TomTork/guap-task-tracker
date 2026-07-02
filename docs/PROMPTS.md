1)
Ты являешься опытным системным аналитиком.
Используй PlantUML.
Используй лучшие практики оформления диаграмм.
Создай Use Case Diagram для проекта "Task Tracker".
Архитектура состоит из двух независимых микросервисов:
User Service
Task Service
Актор один:
User
Доступные варианты использования:
Создать пользователя
Получить пользователя по ID
Создать задачу
Получить список своих задач
Делегировать задачу другому пользователю
Используй package для разделения микросервисов.
Будущие возможности (Future Features) выдели светло-серым цветом через stereotype или skinparam:
Авторизация
Роли
Комментарии
Вложения
Дедлайны
Теги
Проекты
Команды
Поиск задач
История изменений
Уведомления
Приоритет задачи
Используй left to right direction.
Добавь title.
Сделай диаграмму читаемой.
Верни только код PlantUML.
полученный файл .puml положи в папку docs
2)
Создай Sequence Diagram в PlantUML.
Проект Task Tracker.
Участники:
Client
Task Service
User Service
Task Database
User Database
Сценарий:
Клиент вызывает
POST /tasks/{taskId}/delegate?assigneeId=X
Task Service получает запрос.
Task Service отправляет HTTP GET
/users/{assigneeId}
в User Service.
User Service проверяет пользователя в своей базе данных.
Используй alt/else.
Нужно показать минимум четыре сценария.
1.
Пользователь найден
HTTP 200
Task Service обновляет assigneeId
возвращает 200 OK.
2.
Пользователь не найден
404
Task Service возвращает 404.
3.
Задача не существует
Task Service сразу возвращает 404.
4.
User Service недоступен
HTTP timeout или 503
Task Service возвращает 503 Service Unavailable.
Используй activation/deactivation.
Подпиши HTTP методы.
Подпиши ответы.
Добавь title.
Верни только PlantUML.
тоже положи в папку docs, не забывай использовать skill здесь и далее
3)
ошибка participant "Task Service" as TS в файле /Users/tomtork/IdeaProjects/task-tracker/docs/sequence_diagram.puml Syntax Error? (Assumed diagram type: component)
исправь ошибку
4)
сделай следующую диаграмму, результат положи в папку docs, используй plantuml-skill
Создай ER Diagram в PlantUML.
Это отдельная база данных микросервиса User Service.
Сущность:
User
Поля:
id BIGINT PK
first_name VARCHAR
last_name VARCHAR
email VARCHAR UNIQUE
Покажи типы данных.
Покажи первичный ключ.
Не связывай эту диаграмму с другими сервисами.
Добавь title.
Верни только PlantUML.
5)
Создай ER Diagram в PlantUML.
Это отдельная база данных микросервиса Task Service.
Сущность:
Task
Поля:
id BIGINT PK
title VARCHAR
status ENUM
creator_id BIGINT
assignee_id BIGINT
Значения ENUM:
TODO
IN_PROGRESS
DONE
Важно:
creator_id и assignee_id являются только идентификаторами пользователей.
Никаких внешних ключей на таблицу User быть не должно, так как базы данных микросервисов полностью независимы.
Покажи типы данных.
Покажи первичный ключ.
Добавь title.
Верни только PlantUML.
6)
Проверь все созданные PlantUML диаграммы проекта Task Tracker.
Убедись, что соблюдены принципы микросервисной архитектуры:
User Service имеет собственную базу данных.
Task Service имеет собственную базу данных.
Нет прямых связей между таблицами разных сервисов.
Task Service обращается к User Service только через HTTP REST API.
Все диаграммы используют единый стиль оформления.
Если обнаружены нарушения — исправь их.
Верни обновленный PlantUML код.