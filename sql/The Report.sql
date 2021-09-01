
-- hacker rank problem 

SELECT CASE WHEN grade < 8 THEN 'Null' WHEN grade >= 8 THEN name END AS name,
       grade,
       marks
  FROM (SELECT name,
               CASE
                  WHEN marks >= 0 AND marks <= 9 THEN 1
                  WHEN marks >= 10 AND marks <= 19 THEN 2
                  WHEN marks >= 20 AND marks <= 29 THEN 3
                  WHEN marks >= 30 AND marks <= 39 THEN 4
                  WHEN marks >= 40 AND marks <= 49 THEN 5
                  WHEN marks >= 50 AND marks <= 59 THEN 6
                  WHEN marks >= 60 AND marks <= 69 THEN 7
                  WHEN marks >= 70 AND marks <= 79 THEN 8
                  WHEN marks >= 80 AND marks <= 89 THEN 9
                  WHEN marks >= 10 AND marks <= 100 THEN 10
               END
                  AS grade,
               marks
          FROM students)
          order by grade desc,name;