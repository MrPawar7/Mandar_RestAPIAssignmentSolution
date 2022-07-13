
insert into Roles(role_id,name) values (default,'ADMIN');
insert into Roles(role_id,name) values (default,'USER');

insert into users(user_id,username,password) values (default,'admin','$2a$12$BGl3JFnCxvkwDJre8GjKgehGuvaDQQ6TtAVj1tAQunaIhMLvDG1Ja');
insert into users(user_id,username,password) values (default,'user','$2a$12$s.qS5ME3O74tzKCo/4hAWOQtHEznxxVhXsb0Z4MVKzxLkOgLArDrK');

insert into users_roles(role_id,user_id) values (1,1);
insert into users_roles(role_id,user_id) values (2,2);

insert into employee(id,first_name,last_name,email) values (default,'Vashist','Kannan','vashist@gmail.com');
insert into employee(id,first_name,last_name,email) values (default,'Sowmiya','Muthaian','sowmiya@gmail.com');