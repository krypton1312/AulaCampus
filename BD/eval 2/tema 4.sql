// 1
SELECT last_name || ' earns $' || salary || ' monthly but wants $'
        || (salary * 3) || '.' AS "Dream Salaries"
FROM employees;

// 2
SELECT last_name, hire_date, 
        TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 6), 'Lunes'), 
        'Day, "the" DdSPTH "of" Month, YYYY' ) AS review
FROM employees;

// 3 
SELECT last_name, hire_date, TO_CHAR(hire_date, 'Day') AS day
FROM employees
ORDER BY 
  CASE TO_CHAR(hire_date, 'D')
    WHEN '1' THEN 1
    WHEN '2' THEN 2
    WHEN '3' THEN 3
    WHEN '4' THEN 4
    WHEN '5' THEN 5
    WHEN '6' THEN 6
    WHEN '7' THEN 7
  END;

// 4
SELECT last_name, 
        DECODE(commission_pct, null,'No Commission', commission_pct) 
        as comm 
FROM employees;

// 5
SELECT job_id, 
        DECODE(job_id, 'AD_PRES','A', 
        'ST_MAN','B',
        'IT_PROG','C', 
        'SA_REP','D',
        'ST_CLERK','E',
        job_id, 0) 
        as comm 
FROM employees;

// 6
SELECT job_id, 
        CASE(job_id)
        WHEN 'AD_PRES' THEN 'A' 
        WHEN 'ST_MAN' THEN 'B'
        WHEN 'IT_PROG' THEN 'C' 
        WHEN 'SA_REP' THEN 'D'
        WHEN 'ST_CLERK' THEN 'E'
        ELSE '0'
        END
        as comm 
FROM employees;