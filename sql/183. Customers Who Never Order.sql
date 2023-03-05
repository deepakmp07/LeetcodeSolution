# Write your MySQL query statement below
SELECT name Customers FROM Customers 
where id NOT IN(SELECT customerid from Orders);