insert into user_account (user_id, user_password, role_types, email, nickname, memo, created_at, created_by, modified_at, modified_by) values
 ('yoon', '{noop}yoon123', 'ADMIN', 'yoon@naver.com', 'yoon', 'yoon''s memo', now(), 'yoon', now(), 'yoon'),
 ('kim', '{noop}kim123', 'MANAGER', 'kim@naver.com', 'kim', 'kim''s memo', now(), 'kim', now(), 'kim'),
 ('lee', '{noop}lee123', 'MANAGER,DEVELOPER', 'lee@naver.com', 'lee', 'lee''s memo', now(), 'lee', now(), 'lee'),
 ('park', '{noop}park123', 'USER', 'park@naver.com', 'park', 'park''s memo', now(), 'park', now(), 'park');
