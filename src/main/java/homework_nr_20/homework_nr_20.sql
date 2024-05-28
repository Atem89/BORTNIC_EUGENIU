-- Create table
create table Books (
	book_id serial primary key,
	name text not null,
	author text not null,
	date_of_publishing date not null,
	genre text,
	available_count int
);

-- Insert data into table
insert into Books (name, author, date_of_publishing, genre, available_count)
values
	('The Great Gatsby', 'F. Sco^ Fitzgerald', '1925-01-01', 'Classics', 3),
	('To Kill a Mockingbird', 'Harper Lee', '1960-01-01' ,'Ficnon', 5),
	('1984', 'George Orwel', '1949-01-01', 'Science Ficnon', 2),
	('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4);

-- Select everything from table
select *
from Books;

-- Create tablle
create table leased_books (
	leased_books_id serial primary key,
	name text not null,
	surname text not null,
	date_of_lease date,
	date_of_return date,
	fk_book_id int,
	constraint fk_book
	foreign key (fk_book_id)
	references Books (book_id)
);

-- Insert data into table
INSERT INTO leased_books (name, surname, date_of_lease, date_of_return, fk_book_id)
VALUES
	('John', 'Doe', '2024-05-01', '2024-05-15', 1),
	('Alexandr', 'Smith', '2024-05-02', '2024-05-16', 2),
	('Emily', 'Johnson', null, null, 3),
	('Michael', 'Brown', '2024-05-04', '2024-05-18', 4),
	('Sarah', 'Davis', null, null, 1),
	('Alexee', 'Smith', '2024-05-10', '2024-05-20', 1);

-- Select everything from leased_books table
select *
from leased_books;

--1
select b.name, lb.date_of_lease
from books b
left join leased_books lb on b.book_id = lb.fk_book_id
where lb.date_of_lease is null;

--2
select b.name, lb.date_of_lease
from books b
full outer join leased_books lb on b.book_id = lb.fk_book_id;

--3
select ls.name, ls.surname, ls.date_of_return
from leased_books ls
where ls.name is not null and ls.surname is not null and ls.date_of_return is not null;

--4
select ls.name, ls.surname, ls.date_of_return
from leased_books ls
where ls.name like 'A%e%e%' and ls.name is not null and ls.surname is not null and ls.date_of_return is not null;







