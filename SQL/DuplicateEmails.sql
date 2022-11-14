/*
 https://leetcode.com/problems/duplicate-emails/
 */
SELECT Email
FROM (
         SELECT email, COUNT(email) as num
         FROM Person
         GROUP BY email
     ) as email
WHERE num > 1;