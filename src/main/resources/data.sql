-- USERS
INSERT INTO USER_DETAILS(id, birth_date, name) VALUES (10001, current_date(), 'Alex');
INSERT INTO USER_DETAILS(id, birth_date, name) VALUES (10002, current_date(), 'Laia');
INSERT INTO USER_DETAILS(id, birth_date, name) VALUES (10003, current_date(), 'Adrian');

-- POSTS
INSERT INTO POST(id, description, user_id) VALUES(20001, 'I want to learn AWS', 10001);
INSERT INTO POST(id, description, user_id) VALUES(20002, 'I want to learn DevOps', 10001);
INSERT INTO POST(id, description, user_id) VALUES(20003, 'I want to learn JUnit', 10002);
INSERT INTO POST(id, description, user_id) VALUES(20004, 'I want to learn Java', 10002);