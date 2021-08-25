create table qrtz_scheduler_state
(
    sched_name        varchar(120) not null,
    instance_name     varchar(200) not null,
    last_checkin_time bigint(13)   not null,
    checkin_interval  bigint(13)   not null,
    primary key (sched_name, instance_name)
);

INSERT INTO wkscrm_job.qrtz_scheduler_state (sched_name, instance_name, last_checkin_time, checkin_interval) VALUES ('wkscrmScheduler', 'phoenix1626515086000', 1626517903348, 15000);