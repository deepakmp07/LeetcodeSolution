# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
delete from person where id in
(
select id from
(select id, dense_rank() 
OVER(PARTITION BY email order by id ASC) row_n from person) p
where row_n > 1
)
