

/*
https://leetcode.com/problems/swap-salary/
Zwei verschiedene Lösungsansätze, welche beide zu dem gleichen Ergebnis führen
 */

UPDATE Salary
SET sex =
IF(sex = 'm', 'f', 'm');



UPDATE Salary
SET sex = CASE
WHEN sex = 'm' THEN 'f'
ELSE 'm'
END