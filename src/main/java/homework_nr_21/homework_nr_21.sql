-- create tables
create table departments (
    department_id int primary key,
    department_name varchar(50)
);

create table employees (
    employee_id int primary key,
    employee_name varchar(50),
    department_id int,
    foreign key (department_id) references departments(department_id)
);

create table projects (
    project_id int primary key,
    project_name varchar(50)
);

create table employee_projects (
    employee_id int,
    project_id int,
    foreign key (employee_id) references employees(employee_id),
    foreign key (project_id) references projects(project_id)
);

-- inserting data into tables
insert into departments (department_id, department_name) values
(1, 'hr'),
(2, 'it'),
(3, 'sales');

insert into employees (employee_id, employee_name, department_id) values
(1, 'alice', 1),
(2, 'bob', 2),
(3, 'charlie', null),
(4, 'david', 2),
(5, 'eve', 3);

insert into projects (project_id, project_name) values
(1, 'project a'),
(2, 'project b'),
(3, 'project c');

insert into employee_projects (employee_id, project_id) values
(1, 1),
(2, 2),
(3, 3),
(4, 1),
(5, 2);

--1
select e.employee_name, d.department_name
from employees e
left join departments d on e.department_id = d.department_id;

--2
select employee_name
from employees
where department_id is null;

--3
select p.project_name, e.employee_name
from projects p
join employee_projects ep on p.project_id = ep.project_id
join employees e on ep.employee_id = e.employee_id;

--4
select e.employee_name, d.department_name
from employees e
left join departments d on e.department_id = d.department_id;

--5
select d.department_name, count(e.employee_id) as employee_count
from departments d
left join employees e on d.department_id = e.department_id
group by d.department_name;
