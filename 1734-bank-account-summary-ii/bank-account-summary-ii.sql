# Write your MySQL query statement below
SELECT u.name AS NAME , SUM(t.amount) AS BALANCE 
FROM Users as u
LEFT JOIN
Transactions as t
ON u.account = t.account
GROUP BY t.account
HAVING balance > 10000;