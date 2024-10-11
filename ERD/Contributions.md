# User
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```Contributions```](/ERD/Conributions.md)

## Table

| FIELD           | TYPE          | NULL  | KEY | Default |
|-----------------|---------------|-------|-----|---------|
| contribution_id | int(11)       | NO    | PRI | NULL    |
| user_id         | int(11)       | NO    | MUL | NULL    |
| fund_id         | int(11)       | NO    | MUL | NULL    |
| amount          | int(11)       | NO    |     | NULL    |

## Code
```MySQL
CREATE TABLE CONTRIBUTIONS(
	contribution_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	user_id INT(11) NOT NULL,
	fund_id INT(11) NOT NULL,
	amount INT(11) NOT NULL,
	FOREIGN KEY (user_id) REFERENCES USER(user_id),
	FOREIGN KEY (fund_id) REFERENCES FUND(fund_id)
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [User](/ERD/User.md) | 1 |  |   (User—Conributions) |
| [Fund](/ERD/Fund.md) | 1 |  |   (Fund—Conributions) |

