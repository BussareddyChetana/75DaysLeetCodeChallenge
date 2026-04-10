SELECT Visits.customer_ID, COUNT(Visits. Customer_id) as count_no_trans FROM Visits
    LEFT JOIN
Transactions on Visits.visit_id = Transactions.visit_id
    WHERE  transaction_ID is null
    Group by customer_id ;
