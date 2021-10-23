--tb_user
INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com',
'$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com',
'$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com',
'$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

--tb_notification
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Notificatio text', '2020-07-14T10:00:00Z', 'false', 'notification', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Notificatio text', '2020-07-14T10:00:00Z', 'false', 'notification', 1);

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
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Bootcamp HTML', 'https://img.youtube.com/vi/yWE4L1Oa1AU/0
.jpg', 'http://coursestock.com/assets/frontend/default/img/course_thumbnail_placeholder.jpg');

--tb_offer
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', '2020-07-14T10:00:00Z', '2020-07-14T10:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', '2020-07-14T10:00:00Z', '2020-07-14T10:00:00Z', 1);

--tb_resource
INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES ('title 1', 'description 1', 1,'img_uri 1', 1, 'external_link 1', 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, external_link, offer_id) VALUES ('title 2', 'description 2', 2,'img_uri 2', 2, 'external_link 2', 2);

INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('title 1', 'description 1', 1,'img_uri 1', 1, null);
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('title 2', 'description 2', 1,'img_uri 2', 1, 1);

