
  alter table if exists emp.users
       add column user_type_id bigint not null;

    alter table if exists emp.users
       add constraint fk_users_user_type_id
       foreign key (user_type_id)
       references emp.user_types;
