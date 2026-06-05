
  alter table if exists org.users
       add column user_type_id bigint not null;

  alter table if exists org.users
      add column org_id bigint not null;

    alter table if exists org.users
       add constraint fk_users_user_type_id
       foreign key (user_type_id)
       references org.user_types;


  alter table if exists org.users
      add constraint fk_users_org_id
      foreign key (org_id)
      references org.organizations;
