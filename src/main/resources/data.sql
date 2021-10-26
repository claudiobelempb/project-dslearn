--tb_user
INSERT INTO tb_user (name, email, password) VALUES
('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES
('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES
('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

--tb_notification
INSERT INTO tb_notification (text, moment, read, route, user_id)
VALUES ('Notificatio text', '2020-07-14T10:00:00Z', 'false', 'notification', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id)
VALUES ('Notificatio text', '2020-07-14T10:00:00Z', 'false', 'notification', 1);

--tb_role
INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

--tb_user_role
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

--tb_course
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES
('Bootcamp HTML', 'https://img.youtube.com/vi/yWE4L1Oa1AU/0.jpg', 'http://coursestock.com/assets/frontend/default/img/course_thumbnail_placeholder.jpg');

--tb_offer
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES
('1.0', '2020-07-14T10:00:00Z', '2020-07-14T10:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES
('2.0', '2020-07-14T10:00:00Z', '2020-07-14T10:00:00Z', 1);

--tb_resource
INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES
('title 1', 'description 1', 1,'img_uri 1', 1, 'external_link 1', 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES
('title 2', 'description 2', 2,'img_uri 2', 2, 'external_link 2', 2);

--tb_section
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES
('title 1', 'description 1', 1,'img_uri 1', 1, null);
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES
 ('title 2', 'description 2', 1,'img_uri 2', 1, 1);

--tb_enrollment = matriculas
INSERT INTO tb_enrollment (enroll_moment, refund_moment, available, only_update, user_id, offer_id) VALUES
('2020-07-14T10:00:00Z', null, 'true', 'false', 1, 1);
INSERT INTO tb_enrollment (enroll_moment, refund_moment, available, only_update, user_id, offer_id) VALUES
('2020-07-14T10:00:00Z', null, 'true', 'false', 2, 1);

--tb_lesson = aulas
INSERT INTO tb_lesson (section_id, title, position) VALUES (1, 'Aula 01', 1);
INSERT INTO tb_lesson (section_id, title, position) VALUES (2, 'Aula 01', 2);
INSERT INTO tb_lesson (section_id, title, position) VALUES (2, 'Tarefa 01', 3);

--tb_content
INSERT INTO tb_content (id, text_content, video_uri) VALUES (1, 'conten 01', 'video uri 01');
INSERT INTO tb_content (id, text_content, video_uri) VALUES (2, '', 'video uri 02');

--tb_task
INSERT INTO tb_task (id, description, question_count, appoval_count, weight, due_date)
VALUES (3, 'description tarefa', 5, 4, 1.0, '2020-07-14T10:00:00Z');

--tb_lessons_done
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor  revisar', '2020-12-10T13:00:00Z', 'true', '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', '2020-12-12T13:00:00Z', 'true', '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', '2020-12-14T13:00:00Z', 'true', '/offers/1/resource/1/sections/1', 1);

INSERT INTO tb_deliver (uri, moment, status, feedback, correct_count, lesson_id, user_id, offer_id) VALUES
('https://github.com/devsuperior/bds-dslearn', '2020-12-10T10:00:00Z', 0, null, null, 3, 1, 1);

INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 1', 'Corpo do tópico 1', '2020-12-12T13:00:00Z', 1, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 2', 'Corpo do tópico 2', '2020-12-13T13:00:00Z', 2, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 3', 'Corpo do tópico 3', '2020-12-14T13:00:00Z', 2, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 4', 'Corpo do tópico 4', '2020-12-15T13:00:00Z', 1, 1, 2);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 5', 'Corpo do tópico 5', '2020-12-16T13:00:00Z', 1, 1, 2);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 6', 'Corpo do tópico 6', '2020-12-17T13:00:00Z', 2, 1, 3);

INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (1, 2);
INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (2, 1);

INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Tente reiniciar o computador', '2020-12-15T13:00:00Z', 1, 2);
INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Deu certo, valeu!', '2020-12-20T13:00:00Z', 1, 1);

INSERT INTO tb_reply_likes (reply_id, user_id) VALUES (1, 1);