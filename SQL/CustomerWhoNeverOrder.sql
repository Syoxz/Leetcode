/*
 https://leetcode.com/problems/customers-who-never-order/
 */
SELECT Name AS Customers
FROM CUSTOMERS
         LEFT JOIN ORDERS
                   ON ORDERS.CustomerID = Customers.Id
WHERE Orders.CustomerID IS NULL