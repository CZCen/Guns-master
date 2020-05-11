create schema lbs collate utf8_general_ci;

create table audit_bottom
(
    id           bigint auto_increment
        primary key,
    des          varchar(255) null comment '描述',
    audit_status bigint       null comment '1：已审核 2：未审核',
    audit_people bigint       null,
    audit_date   date         null,
    type_name    varchar(255) null,
    mgr_id       bigint       null comment '项目id'
)
    charset = utf8mb4;

create table audit_danger
(
    id           bigint auto_increment
        primary key,
    danger_point varchar(255) null,
    audit_people bigint       null comment 'work_people人员id',
    audit_status bigint       null comment '1：已审核 2：未审核',
    audit_add    varchar(255) null comment '审核补充',
    type_name    varchar(20)  null comment '1:工作票 2：操作票',
    mgr_id       bigint       null comment '项目id'
)
    charset = utf8mb4;

create table interface_info
(
    api_id          int auto_increment comment 'ID'
        primary key,
    api_method      varchar(12)                        not null comment 'HttpMethod：GET、PUT、POST',
    api_path        varchar(512)                       not null comment '拦截路径',
    api_status      int(2)                             not null comment '状态：0草稿，1发布，2有变更，3禁用',
    api_comment     varchar(255)                       null comment '注释',
    api_type        varchar(24)                        not null comment '脚本类型：SQL、DataQL',
    api_script      mediumtext                         not null comment '查询脚本：xxxxxxx',
    api_schema      mediumtext                         null comment '接口的请求/响应数据结构',
    api_sample      mediumtext                         null comment '请求/响应/请求头样本数据',
    api_create_time datetime default CURRENT_TIMESTAMP null comment '创建时间',
    api_gmt_time    datetime default CURRENT_TIMESTAMP null comment '修改时间'
)
    comment 'Dataway 中的API' charset = utf8mb4;

create table interface_release
(
    pub_id           int auto_increment comment 'Publish ID'
        primary key,
    pub_api_id       int                                not null comment '所属API ID',
    pub_method       varchar(12)                        not null comment 'HttpMethod：GET、PUT、POST',
    pub_path         varchar(512)                       not null comment '拦截路径',
    pub_status       int(2)                             not null comment '状态：0有效，1无效（可能被下线）',
    pub_type         varchar(24)                        not null comment '脚本类型：SQL、DataQL',
    pub_script       mediumtext                         not null comment '查询脚本：xxxxxxx',
    pub_script_ori   mediumtext                         not null comment '原始查询脚本，仅当类型为SQL时不同',
    pub_schema       mediumtext                         null comment '接口的请求/响应数据结构',
    pub_sample       mediumtext                         null comment '请求/响应/请求头样本数据',
    pub_release_time datetime default CURRENT_TIMESTAMP null comment '发布时间（下线不更新）'
)
    comment 'Dataway API 发布历史。' charset = utf8mb4;

create index idx_interface_release
    on interface_release (pub_api_id);

create table mgr
(
    id               bigint auto_increment
        primary key,
    mgr_name         varchar(255) null,
    mgr_no           varchar(20)  null,
    rencai_fengxian  bigint       null,
    xingwei_fengxian bigint       null,
    guanli_fengxian  bigint       null,
    jishu_fengxian   bigint(255)  null,
    jingji_fengxian  bigint       null,
    pingjia          varchar(255) null,
    create_user      bigint       null,
    pingjia_ren      bigint       null comment '评价人',
    fengxian_ren     bigint       null comment '风险预估人'
)
    charset = utf8mb4;

create table sys_dept
(
    DEPT_ID     bigint auto_increment comment '主键id'
        primary key,
    PID         bigint       null comment '父部门id',
    PIDS        varchar(512) null comment '父级ids',
    SIMPLE_NAME varchar(45)  null comment '简称',
    FULL_NAME   varchar(255) null comment '全称',
    DESCRIPTION varchar(255) null comment '描述',
    VERSION     int          null comment '版本（乐观锁保留字段）',
    SORT        int          null comment '排序',
    CREATE_TIME datetime     null comment '创建时间',
    UPDATE_TIME datetime     null comment '修改时间',
    CREATE_USER bigint       null comment '创建人',
    UPDATE_USER bigint       null comment '修改人'
)
    comment '部门表';

create table sys_dict
(
    DICT_ID     bigint unsigned auto_increment comment '主键id'
        primary key,
    PID         bigint       null comment '父级字典id',
    NAME        varchar(255) null comment '字典名称',
    CODE        varchar(255) null comment '字典的编码',
    DESCRIPTION varchar(255) null comment '字典描述',
    SORT        int          null comment '排序',
    CREATE_TIME datetime     null comment '创建时间',
    UPDATE_TIME datetime     null comment '修改时间',
    CREATE_USER bigint       null comment '创建人',
    UPDATE_USER bigint       null comment '修改人'
)
    comment '字典表';

create table sys_file_info
(
    FILE_ID     varchar(50) not null comment '主键id'
        primary key,
    FILE_DATA   text        null comment 'base64编码的文件',
    CREATE_TIME datetime    null comment '创建时间',
    UPDATE_TIME datetime    null comment '修改时间',
    CREATE_USER bigint      null comment '创建用户',
    UPDATE_USER bigint      null comment '修改用户'
)
    comment '文件信息表
';

create table sys_login_log
(
    LOGIN_LOG_ID bigint auto_increment comment '主键'
        primary key,
    LOG_NAME     varchar(255) null comment '日志名称',
    USER_ID      bigint       null comment '管理员id',
    CREATE_TIME  datetime     null comment '创建时间',
    SUCCEED      varchar(255) null comment '是否执行成功',
    MESSAGE      text         null comment '具体消息',
    IP_ADDRESS   varchar(255) null comment '登录ip'
)
    comment '登录记录';

create table sys_menu
(
    MENU_ID       bigint auto_increment comment '主键id'
        primary key,
    CODE          varchar(255)                 null comment '菜单编号',
    PCODE         varchar(255)                 null comment '菜单父编号',
    PCODES        varchar(255)                 null comment '当前菜单的所有父菜单编号',
    NAME          varchar(255)                 null comment '菜单名称',
    ICON          varchar(255)                 null comment '菜单图标',
    URL           varchar(255)                 null comment 'url地址',
    SORT          int(65)                      null comment '菜单排序号',
    LEVELS        int(65)                      null comment '菜单层级',
    MENU_FLAG     varchar(32)                  null comment '是否是菜单(字典)',
    DESCRIPTION   varchar(255)                 null comment '备注',
    STATUS        varchar(32) default 'ENABLE' null comment '菜单状态(字典)',
    NEW_PAGE_FLAG varchar(32)                  null comment '是否打开新页面的标识(字典)',
    OPEN_FLAG     varchar(32)                  null comment '是否打开(字典)',
    CREATE_TIME   datetime                     null comment '创建时间',
    UPDATE_TIME   datetime                     null comment '修改时间',
    CREATE_USER   bigint                       null comment '创建人',
    UPDATE_USER   bigint                       null comment '修改人'
)
    comment '菜单表';

create table sys_notice
(
    NOTICE_ID   bigint auto_increment comment '主键'
        primary key,
    TITLE       varchar(255) null comment '标题',
    CONTENT     text         null comment '内容',
    CREATE_TIME datetime     null comment '创建时间',
    CREATE_USER bigint       null comment '创建人',
    UPDATE_TIME datetime     null comment '修改时间',
    UPDATE_USER bigint       null comment '修改人'
)
    comment '通知表';

create table sys_operation_log
(
    OPERATION_LOG_ID bigint auto_increment comment '主键'
        primary key,
    LOG_TYPE         varchar(32)  null comment '日志类型(字典)',
    LOG_NAME         varchar(255) null comment '日志名称',
    USER_ID          bigint(65)   null comment '用户id',
    CLASS_NAME       varchar(255) null comment '类名称',
    METHOD           text         null comment '方法名称',
    CREATE_TIME      datetime     null comment '创建时间',
    SUCCEED          varchar(32)  null comment '是否成功(字典)',
    MESSAGE          text         null comment '备注'
)
    comment '操作日志';

create table sys_relation
(
    RELATION_ID bigint not null comment '主键'
        primary key,
    MENU_ID     bigint null comment '菜单id',
    ROLE_ID     bigint null comment '角色id'
)
    comment '角色和菜单关联表';

create table sys_role
(
    ROLE_ID     bigint auto_increment comment '主键id'
        primary key,
    PID         bigint       null comment '父角色id',
    NAME        varchar(255) null comment '角色名称',
    DESCRIPTION varchar(255) null comment '提示',
    SORT        int          null comment '序号',
    VERSION     int          null comment '乐观锁',
    CREATE_TIME datetime     null comment '创建时间',
    UPDATE_TIME datetime     null comment '修改时间',
    CREATE_USER bigint       null comment '创建用户',
    UPDATE_USER bigint       null comment '修改用户'
)
    comment '角色表';

create table sys_user
(
    USER_ID     bigint       not null comment '主键id'
        primary key,
    AVATAR      varchar(255) null comment '头像',
    ACCOUNT     varchar(45)  null comment '账号',
    PASSWORD    varchar(45)  null comment '密码',
    SALT        varchar(45)  null comment 'md5密码盐',
    NAME        varchar(45)  null comment '名字',
    BIRTHDAY    datetime     null comment '生日',
    SEX         varchar(32)  null comment '性别(字典)',
    EMAIL       varchar(45)  null comment '电子邮件',
    PHONE       varchar(45)  null comment '电话',
    ROLE_ID     varchar(255) null comment '角色id(多个逗号隔开)',
    DEPT_ID     bigint       null comment '部门id(多个逗号隔开)',
    STATUS      varchar(32)  null comment '状态(字典)',
    CREATE_TIME datetime     null comment '创建时间',
    CREATE_USER bigint       null comment '创建人',
    UPDATE_TIME datetime     null comment '更新时间',
    UPDATE_USER bigint       null comment '更新人',
    VERSION     int          null comment '乐观锁'
)
    comment '管理员表';

create table work_people
(
    id           bigint       not null
        primary key,
    name         varchar(20)  null,
    mobile       varchar(50)  null,
    description  varchar(255) null comment '描述：设备部、基建部、安监部、调度部门、供电所负责人',
    ege          varchar(20)  null,
    zi_zhi       varchar(255) null comment '资质',
    audit_status bigint       null comment '1：已审核 2：未审核',
    audit_people bigint       null comment '审核人员id',
    audit_time   date         null,
    type_name    varchar(20)  null comment '1:工作牌 2：操作票',
    mgr_id       bigint       null comment '项目id'
)
    charset = utf8mb4;

create table work_plan
(
    id           bigint auto_increment
        primary key,
    work_plan    varchar(255) null,
    plan_des     varchar(255) null,
    audit_status bigint       null comment '1：已审核 2：未审核',
    audit_people bigint       null,
    audit_time   date         null,
    type_name    varchar(20)  null comment '1:工作牌 2：操作票',
    mgr_id       bigint       null comment '项目id'
)
    charset = utf8mb4;

create table work_ticket
(
    id           bigint(100) auto_increment
        primary key,
    work_place   varchar(100) null,
    work_time    varchar(80)  null comment '工作时间',
    work_content varchar(255) null comment '工作内容',
    equipment    varchar(255) null comment '设备',
    material     varchar(255) null comment '材料',
    ping_jia     varchar(255) null comment '工作票评价',
    type_name    varchar(20)  null comment '1:工作牌 2：操作票',
    mgr_id       bigint       null comment '项目id'
)
    charset = utf8mb4;

create table work_unit
(
    id          bigint auto_increment
        primary key,
    unit_name   varchar(255)               null,
    zi_zhi      varchar(255)               null comment '资质',
    mobile      varchar(20)                null,
    create_time date                       null,
    create_user bigint                     null,
    principal   bigint                     null comment '负责人',
    type_name   varchar(20)                null comment '1:工作牌 2：操作票',
    mgr_id      bigint                     null comment '项目id',
    unit_type   varchar(32) default '施工单位' null
)
    charset = utf8mb4;

create definer = root@`%` view word as
select `lbs`.`mgr`.`id`                                  AS `id`,
       `lbs`.`work_ticket`.`work_content`                AS `workContent`,
       `lbs`.`work_plan`.`work_plan`                     AS `workPlan`,
       `lbs`.`mgr`.`mgr_no`                              AS `mgrNo`,
       `lbs`.`mgr`.`mgr_name`                            AS `mgrName`,
       (select count(0)
        from `lbs`.`work_people`
        where ((`lbs`.`work_plan`.`mgr_id` = `lbs`.`work_ticket`.`mgr_id`) and
               (`lbs`.`work_plan`.`type_name` = '工作票'))) AS `countPeople`,
       `lbs`.`work_ticket`.`type_name`                   AS `type_name`
from `lbs`.`work_ticket`
         join `lbs`.`work_plan`
         join `lbs`.`mgr`
         join `lbs`.`work_people`
where ((`lbs`.`work_ticket`.`mgr_id` = `lbs`.`work_plan`.`mgr_id`) and (`lbs`.`work_ticket`.`type_name` = 0) and
       (`lbs`.`work_plan`.`type_name` = '工作票') and (`lbs`.`work_people`.`type_name` = '工作票') and
       (`lbs`.`work_ticket`.`mgr_id` = `lbs`.`mgr`.`id`) and
       (`lbs`.`work_ticket`.`mgr_id` = `lbs`.`work_people`.`mgr_id`));

-- comment on column word.workContent not supported: 工作内容

-- comment on column word.type_name not supported: 1:工作牌 2：操作票

create definer = root@`%` view word1 as
select `lbs`.`mgr`.`id`                                  AS `id`,
       `lbs`.`work_ticket`.`work_content`                AS `workContent`,
       `lbs`.`work_plan`.`work_plan`                     AS `workPlan`,
       `lbs`.`mgr`.`mgr_no`                              AS `mgrNo`,
       `lbs`.`mgr`.`mgr_name`                            AS `mgrName`,
       (select count(0)
        from `lbs`.`work_people`
        where ((`lbs`.`work_plan`.`mgr_id` = `lbs`.`work_ticket`.`mgr_id`) and
               (`lbs`.`work_plan`.`type_name` = '操作票'))) AS `countPeople`,
       `lbs`.`work_ticket`.`type_name`                   AS `type_name`
from `lbs`.`work_ticket`
         join `lbs`.`work_plan`
         join `lbs`.`mgr`
         join `lbs`.`work_people`
where ((`lbs`.`work_ticket`.`mgr_id` = `lbs`.`work_plan`.`mgr_id`) and (`lbs`.`work_ticket`.`type_name` = 1) and
       (`lbs`.`work_plan`.`type_name` = '操作票') and (`lbs`.`work_people`.`type_name` = '操作票') and
       (`lbs`.`work_ticket`.`mgr_id` = `lbs`.`mgr`.`id`) and
       (`lbs`.`work_ticket`.`mgr_id` = `lbs`.`work_people`.`mgr_id`));

-- comment on column word1.workContent not supported: 工作内容

-- comment on column word1.type_name not supported: 1:工作牌 2：操作票

