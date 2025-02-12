-- 1 
SELECT employee_id, job_id
FROM employees
UNION 
SELECT employee_id, job_id
FROM job_history;
-- 2
SELECT employee_id, job_id
FROM employees
INTERSECT
SELECT employee_id, job_id
FROM job_history;
-- 3
SELECT employee_id, job_id
FROM employees
MINUS
SELECT employee_id, job_id
FROM job_history;
-- 4
SELECT employee_id, job_id, salary 
FROM employees;
-- 5
SELECT employee_id, job_id, salary 
FROM employees
ORDER by salary DESC;
