DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    `id`          BIGINT(20)  NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`        VARCHAR(30) NULL     DEFAULT NULL COMMENT '姓名',
    `age`         INT(3)      NULL     DEFAULT NULL COMMENT '年龄',
    `grade`       INT(2)      NULL     DEFAULT NULL COMMENT '年级',
    `email`       VARCHAR(50) NULL     DEFAULT NULL COMMENT '邮箱',
    `deleted`     tinyint(1)  NOT NULL DEFAULT 0 COMMENT '逻辑删除',
    `create_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (id)
);


INSERT INTO user (id, name, age, email,grade)
VALUES (1, 'Jone', 1, 'test1@baomidou.com',1),
       (2, 'Jack', 2, 'test2@baomidou.com',1),
       (3, 'Tom', 3, 'test3@baomidou.com',1),
       (4, 'Sandy', 3, 'test4@baomidou.com',1),
       (5, 'Billie', 1, 'test5@baomidou.com',1);