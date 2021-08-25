create table sys_logininfor
(
    info_id     bigint auto_increment comment '访问ID'
        primary key,
    user_name   varchar(50)  default ''  null comment '用户账号',
    ipaddr      varchar(128) default ''  null comment '登录IP地址',
    status      char         default '0' null comment '登录状态（0成功 1失败）',
    msg         varchar(255) default ''  null comment '提示信息',
    access_time datetime                 null comment '访问时间'
)
    comment '系统访问记录';

INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (1, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-17 09:21:30');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (2, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-17 10:34:51');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (3, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-18 09:02:08');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (4, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-18 09:48:31');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (5, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-19 00:54:03');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (6, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-19 04:20:46');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (7, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-19 04:22:23');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (8, 'admin', '10.0.75.1', '0', '退出成功', '2021-07-19 04:23:34');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (9, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-19 04:25:35');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (10, 'admin', '10.0.75.1', '0', '退出成功', '2021-07-19 04:26:08');
INSERT INTO wkscrm_system.sys_logininfor (info_id, user_name, ipaddr, status, msg, access_time) VALUES (11, 'admin', '10.0.75.1', '0', '登录成功', '2021-07-19 05:34:04');