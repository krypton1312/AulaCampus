// 1       2      3 
// true , falso, true

// 4 
SELECT ROUND(MAX(salary), 0) as "Maximum",
       ROUND(MIN(salary), 0) as "Minimum",
       ROUND(SUM(salary), 0) as "Sum",
       ROUND(AVG(salary), 0) as "Average"
FROM employees;

// 5 
SELECT job_id, ROUND(MAX(salary), 0) as "Maximum", 
       ROUND(MIN(salary), 0) as "Minimum",
       ROUND(SUM(salary), 0) as "Sum",
       ROUND(AVG(salary), 0) as "Average"
FROM employees
GROUP BY job_id;

// 6
SELECT job_id, COUNT(*)
FROM employees
WHERE job_id = '&job_id'
GROUP BY job_id;

// 7 
SELECT COUNT(DISTINCT manager_id) as "Number of Managers"
FROM employees;

// 8
SELECT MAX(salary) - MIN(salary) as difference
FROM employees;

// 9
SELECT manager_id, MIN(salary)
FROM employees
GROUP BY manager_id
HAVING MIN(salary) > 6000
ORDER BY MIN(salary) DESC;

// 10
SELECT COUNT(hire_date) as "age1995",
    COUNT(hire_date) as "age1996",
    COUNT(hire_date) as "1997",
    COUNT(hire_date) as "1998"
FROM employees
HAVING age1995 LIKE '%1995', age1996 LIKE '%1996',1997 LIKE '%1997',1998 LIKE '%1998'
