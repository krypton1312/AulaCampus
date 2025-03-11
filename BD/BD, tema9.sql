SAVEPOINT inicio;

INSERT INTO jobs VALUES ('B_SIT', 'Baby Sitter', 500, 55000);

INSERT INTO departments (department_id, department_name, manager_id, location_id)
SELECT MAX(department_id) + 10, 'Babysitting Services', NULL, 1500
FROM departments;

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number,hire_date, job_id, salary, commission_pct, manager_id, department_id)
SELECT MAX(employee_id) + 1, 'Jonny', 'Sins', 'BIGHEAD', '555.555.4322' , SYSDATE, 'B_SIT', 55000, null, null, 280  FROM employees;

COMMIT;

SAVEPOINT JONNY;

UPDATE employees
SET salary = 50000
WHERE first_name = 'Jonny' AND last_name = 'Sins';

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number,hire_date, job_id, salary, commission_pct, manager_id, department_id)
SELECT MAX(employee_id) + 1, 'Michael', 'Jordan', 'goodman', '444.555.4322' , SYSDATE, 'B_SIT', 5000, null, null, 280  FROM employees;

SAVEPOINT michael;

DELETE FROM job_history;

rollback michael;

DELETE FROM job_history
WHERE department_id = 280;

COMMIT;

SAVEPOINT point;

UPDATE employees
SET salary = 8999;

ROLLBACK;

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
SELECT MAX(employee_id) + 1, 'Lucas', 'Ramírez', 'lramirez', '444.555.1001', SYSDATE, 'IT_PROG', 5000, 0.25, NULL, 60 FROM employees
UNION ALL
SELECT MAX(employee_id) + 2, 'Sofía', 'González', 'sgonzalez', '444.555.1002', SYSDATE, 'SA_MAN', 7000, 0.15, 101, 80 FROM employees
UNION ALL
SELECT MAX(employee_id) + 3, 'Mateo', 'Fernández', 'mfernandez', '444.555.1003', SYSDATE, 'AC_MGR', 8200, 0.10, 102, 10 FROM employees
UNION ALL
SELECT MAX(employee_id) + 4, 'Valentina', 'López', 'vlopez', '444.555.1004', SYSDATE, 'PU_CLERK', 4500, 0.25, 103, 30 FROM employees
UNION ALL
SELECT MAX(employee_id) + 5, 'Javier', 'Torres', 'jtorres', '444.555.1005', SYSDATE, 'MK_MAN', 9000, 0.15, 104, 20 FROM employees
UNION ALL
SELECT MAX(employee_id) + 6, 'Camila', 'Díaz', 'cdiaz', '444.555.1006', SYSDATE, 'HR_REP', 4600, 0.10, NULL, 40 FROM employees
UNION ALL
SELECT MAX(employee_id) + 7, 'Alejandro', 'Castro', 'acastro', '444.555.1007', SYSDATE, 'FI_ACCOUNT', 4200, 0.25, 105, 100 FROM employees
UNION ALL
SELECT MAX(employee_id) + 8, 'Martina', 'Pérez', 'mperez', '444.555.1008', SYSDATE, 'ST_MAN', 5500, 0.15, NULL, 50 FROM employees
UNION ALL
SELECT MAX(employee_id) + 9, 'Tomás', 'Silva', 'tsilva', '444.555.1009', SYSDATE, 'SA_REP', 6000, 0.10, 106, 80 FROM employees
UNION ALL
SELECT MAX(employee_id) + 10, 'Elena', 'Mendoza', 'emendoza', '444.555.1010', SYSDATE, 'AD_VP', 15000, 0.25, 107, 90 FROM employees;

COMMIT;
SAVEPOINT emp;

-- 1. Add a new job position for 'Graphic Designer' with a salary range
SAVEPOINT job1;
INSERT INTO jobs VALUES ('G_DES', 'Graphic Designer', 6000, 75000);
COMMIT;

-- 2. Create a new department 'Marketing and Communications' and assign it a location
SAVEPOINT department1;
INSERT INTO departments (department_id, department_name, manager_id, location_id)
SELECT MAX(department_id) + 1, 'Marketing and Communications', NULL, 2000 FROM departments;
COMMIT;

-- 3. Add a new employee 'Isabella', a 'Graphic Designer', with a salary and commission
SAVEPOINT employee1;
INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
SELECT MAX(employee_id) + 1, 'Isabella', 'Martinez', 'imartinez', '444.555.1011', SYSDATE, 'G_DES', 6500, 0.20, NULL, 60 FROM employees;
COMMIT;

-- 4. Update salary of an employee 'Jonny Sins' to 60000 (the salary is raised)
SAVEPOINT updateSalary1;
UPDATE employees
SET salary = 60000
WHERE first_name = 'Jonny' AND last_name = 'Sins';
COMMIT;

-- 5. Remove an old employee 'Michael Jordan' from the employees table
SAVEPOINT deleteEmployee1;
DELETE FROM employees
WHERE first_name = 'Michael' AND last_name = 'Jordan';
COMMIT;

SAVEPOINT beforetrunc
TRUNCATE TABLE job_history;
SELECT * from job_history;

rollback beforetrunc;