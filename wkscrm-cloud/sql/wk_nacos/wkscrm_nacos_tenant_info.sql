create table tenant_info
(
    id            bigint auto_increment comment 'id'
        primary key,
    kp            varchar(128)            not null comment 'kp',
    tenant_id     varchar(128) default '' null comment 'tenant_id',
    tenant_name   varchar(128) default '' null comment 'tenant_name',
    tenant_desc   varchar(256)            null comment 'tenant_desc',
    create_source varchar(32)             null comment 'create_source',
    gmt_create    bigint                  not null comment '创建时间',
    gmt_modified  bigint                  not null comment '修改时间',
    constraint uk_tenant_info_kptenantid
        unique (kp, tenant_id)
)
    comment 'tenant_info' collate = utf8_bin;

create index idx_tenant_id
    on tenant_info (tenant_id);

INSERT INTO wkscrm_nacos.tenant_info (id, kp, tenant_id, tenant_name, tenant_desc, create_source, gmt_create, gmt_modified) VALUES (1, '1', '798c498e-203e-42b1-b1d0-df93480cd53f', 'dev', '开发环境', 'nacos', 1626417918875, 1626417918875);
INSERT INTO wkscrm_nacos.tenant_info (id, kp, tenant_id, tenant_name, tenant_desc, create_source, gmt_create, gmt_modified) VALUES (2, '1', '31b5b671-49fe-4d1f-972a-6ace121c7370', 'test', '测试环境', 'nacos', 1626417975615, 1626417975615);
INSERT INTO wkscrm_nacos.tenant_info (id, kp, tenant_id, tenant_name, tenant_desc, create_source, gmt_create, gmt_modified) VALUES (3, '1', 'b83dca09-45bb-4362-bd17-8660ad8c8603', 'prod', '生产环境', 'nacos', 1626417989732, 1626417989732);