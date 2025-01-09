// 1
SELECT sysdate AS "Date"
FROM DUAL;
// 2 , 3
SELECT employee_id, last_name, salary, ROUND(salary *1.155,0) as "New salary"
FROM employees;
// 4
SELECT employee_id, last_name, salary, ROUND(salary *1.155,0) as "New salary", 
        ROUND(salary *1.155,0) - salary as "Increase"
FROM employees;
// 5
SELECT INITCAP(first_name) AS "Name", LENGTH(first_name) as "Length"
FROM employees
WHERE first_name LIKE 'A%'
OR first_name LIKE 'J%'
OR first_name LIKE 'M%'
ORDER BY last_name DESC;

SELECT first_name AS "Name", LENGTH(first_name) as "Length"
FROM employees
WHERE first_name LIKE '&name%'
ORDER BY last_name DESC;

SELECT first_name AS "Name", LENGTH(first_name) as "Length"
FROM employees
WHERE first_name LIKE UPPER('&name%')
ORDER BY last_name DESC;
// 6
SELECT last_name, ROUND(((SYSDATE-hire_date)/30),0) as months_worked
FROM employees
ORDER BY months_worked;
// 7 
SELECT last_name, LPAD(salary, 15, '$') salary
FROM employees;
// 8
SELECT RPAD((SUBSTR(last_name,1,8)) || ' ',((salary/1000) + 
        LENGTH(last_name)),'*'), salary
FROM employees;
// 9
SELECT last_name, ROUND(((SYSDATE-hire_date)/7),0) as tenure
FROM employees
WHERE department_id = 90
ORDER BY tenure DESC;

// Tarea extra
SELECT LOWER('LOWER') AS "lower",
        UPPER('upper') AS "upper",
        INITCAP('initcap') as "initcap"
from employees;

SELECT CONCAT(first_name, last_name) as "CONCATR",
        SUBSTR(first_name, 1,7) SUBSTR,
        LENGTH(first_name) LENGTH,
        INSTR(first_name, 'H') INSTR,
        LPAD(first_name, 15, '+') LPAD,
        RPAD(first_name, 15, '+') RPAD,
        REPLACE(first_name, 'H', 'WORLD OF TANKS AHAHAHHAHAHA') REPLACE
FROM employees;