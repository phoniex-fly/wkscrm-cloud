create table qrtz_locks
(
    sched_name varchar(120) not null,
    lock_name  varchar(40)  not null,
    primary key (sched_name, lock_name)
);

INSERT INTO wkscrm_job.qrtz_locks (sched_name, lock_name) VALUES ('wkscrmScheduler', 'STATE_ACCESS');
INSERT INTO wkscrm_job.qrtz_locks (sched_name, lock_name) VALUES ('wkscrmScheduler', 'TRIGGER_ACCESS');