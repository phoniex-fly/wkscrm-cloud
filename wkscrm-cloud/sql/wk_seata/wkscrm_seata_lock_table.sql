create table lock_table
(
    row_key        varchar(128) not null
        primary key,
    xid            varchar(96)  null,
    transaction_id bigint       null,
    branch_id      bigint       not null,
    resource_id    varchar(256) null,
    table_name     varchar(32)  null,
    pk             varchar(36)  null,
    gmt_create     datetime     null,
    gmt_modified   datetime     null
);

create index idx_branch_id
    on lock_table (branch_id);

