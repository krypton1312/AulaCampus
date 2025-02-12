-- 1
DEFINE apellido = '&apellido'
SELECT last_name, hire_date 
FROM employees 
WHERE department_id = (SELECT department_id 
                       FROM employees 
                       WHERE last_name = '&&apellido') 
AND last_name <> '&&apellido';
-- 2 
SELECT employee_id, last_name, salary
FROM employees
WHERE salary >  (SELECT AVG(salary) FROM employees)
ORDER BY salary;
-- 3
SELECT employee_id, last_name
FROM employees
WHERE department_id IN (SELECT DISTINCT department_id 
                        FROM employees 
                        WHERE last_name LIKE '%u%');
-- 4
SELECT e.last_name, e.department_id, e.job_id
FROM employees e JOIN departments d
ON e.department_id = d.department_id
WHERE e.department_id IN (SELECT d.department_id 
                            FROM departments 
                            WHERE d.location_id = '&locID');
-- 5
SELECT last_name, salary
FROM employees
WHERE manager_id = (SELECT employee_id 
                    FROM employees
                    WHERE last_name = 'King' AND job_id = 'AD_PRES');
-- 6
SELECT department_id, last_name, job_id
FROM employees
WHERE department_id = (SELECT department_id
                        FROM departments
                        WHERE department_name = 'Executive');
-- 7
SELECT last_name, salary 
FROM employees
WHERE salary > (SELECT MAX(salary)
                FROM employees
                WHERE department_id = 60);
-- 8
SELECT employee_id, last_name, salary 
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees)
AND department_id IN (SELECT DISTINCT department_id 
                        FROM employees 
                        WHERE last_name LIKE '%u%');