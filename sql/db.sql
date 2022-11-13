create database if not exists winter_api;

-- 接口信息表
create table if not exists winter_api.`interface_info`
(
    `id` bigint not null comment '接口ID' primary key,
    `name` varchar(256) not null comment '接口名称',
    `description` varchar(512) null comment '接口描述',
    `url` varchar(512) not null comment '接口URL地址',
    `method` varchar(256) not null comment '接口请求类型',
    `request_header` varchar(256) null comment '请求头',
    `response_header` varchar(256) null comment '响应头',
    `status` tinyint default 0 not null comment '接口发布状态，0——下线，1——上线',
    `user_id` bigint not null comment '创建人ID',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_delete` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口信息表';

insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (2509655528, 'W9', 'Uh', 'www.carley-kerluke.org', 'Put', 'hO', 'H17T', 0, 69916);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (5734627376, 'Ndcb', 'ngG', 'www.jonas-watsica.com', 'Delete', 'za', 'jkIN', 1, 909);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (38688337, '4kF', 'Ju', 'www.marshall-spinka.co', 'Post', 'KlFA', 'MZqRV', 1, 795);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (57152, 'vSQq', 'H2', 'www.felix-ankunding.net', 'Delete', 'R6EW', 'VOIuX', 0, 5);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (762, 'KjeT', 'tUc06', 'www.al-johnston.com', 'Delete', 'RHiL', 'EA6', 1, 9);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (7778, 'epX', 'lAeYu', 'www.catheryn-sawayn.biz', 'Post', 'di', 'Nkdpl', 0, 7796711017);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (7704, '7YII2', 'nC8L', 'www.nenita-mckenzie.io', 'Put', 'vhNv', 'FC1X', 1, 55268803);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (65868787, 'Bqe0V', 'kZ', 'www.dollie-barton.net', 'Get', 'TNqm', 'u0', 1, 19152859);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (7, '3s', 'lfZga', 'www.bernard-grant.org', 'Post', 'ZfJV9', 'ig', 1, 6);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (59853, '2Gg1', 'Ei', 'www.israel-ondricka.com', 'Post', 'fCdj', 'pRE', 0, 644);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (826, 'X12', 'r2N', 'www.faye-mosciski.net', 'Post', 'X8rHM', 'Y5yAb', 0, 4);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (128414731, 'FJp31', 'vQ', 'www.zachariah-ledner.com', 'Post', 'me', 'MDd', 1, 2903062);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (8274, '1zj4', 'Hv', 'www.dixie-gislason.co', 'Put', 'a2Lf', 'NkjMJ', 0, 841288);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (5732679, '5E', 'v8I', 'www.penny-cronin.com', 'Delete', 'CRx', 'AG2l', 1, 415648);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (3747721878, 'QHHf', 'wiFL', 'www.jon-lemke.info', 'Get', 'VM', 'VyD2M', 1, 287);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (8996, 'kmq3', 'J0', 'www.danuta-kautzer.org', 'Get', 'Dl', 'zqC', 1, 4511439858);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (6, 'Oy', 'YvWkw', 'www.jamal-lockman.net', 'Get', 'gEy', 'zV', 0, 688615539);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (70, 'mExZ0', 'hpCs2', 'www.steven-cassin.biz', 'Get', '3k', 'phM', 0, 7);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (1, 'Mt', 'q3zgu', 'www.morton-senger.co', 'Delete', 'QPws', 'Le1', 0, 20);
insert into winter_api.`interface_info` (`id`, `name`, `description`, `url`, `method`, `request_header`, `response_header`, `status`, `user_id`) values (89850, 'dB', 'XGYZ', 'www.jermaine-friesen.net', 'Put', 'wOW', 'Nc5', 1, 4);