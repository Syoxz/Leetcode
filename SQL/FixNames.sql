/*
 https://leetcode.com/problems/fix-names-in-a-table/
 */

Select user_id,  CONCAT(UCASE(LEFT(name, 1)), LCASE(SUBSTRING(name, 2))) as name
FROM users
ORDER BY user_id;