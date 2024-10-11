# User
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```Fund```](/ERD/Fund.md)

## Table

| FIELD         | TYPE          | NULL  | KEY | Default | EXTRA           |
|---------------|---------------|-------|-----|---------|-----------------|
| fund_id       | int(11)       | NO    | PRI | NULL    | AUTO_INCREMENT  |
| title         | varchar(50)   | NO    |     | NULL    |                 |
| Description   | varchar(3500) | YES   |     | NULL    |                 |
| goal_amount   | int(11)       | NO    |     | NULL    |                 |
| raised_amount | int(11)       | NO    |     | 0       |                 |
| imageset_id   | int(11)       | NO    | MUL | NULL    |                 |

## Code
```MySQL
CREATE TABLE FUND(
	fund_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(50) NOT NULL,
	description VARCHAR(3500),
	goal_amount INT(11) NOT NULL,
	raised_amount INT(11) NOT NULL,
	imageset_id INT(11) NOT NULL,
	FOREIGN KEY (imageset_id) REFERENCES IMAGESET(imageset_id)
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [ImageSet](/ERD/ImageSet.md) | 1 |  |   (Fund—ImageSet) |
| [Contributions](/ERD/Contributions.md) | 0..1 |  |   (Fund—Contributions) |
