# User
[```ERDDiagram```](/ERDDiagram.md)::[```User```](/User.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| user_id | int(11) | NO | PRI | NULL | auto_increment |
| user_name | varchar(30) | NO |  | NULL |  |
| user_password | varchar(64) | NO |  | NULL |  |
| user_role | enum('USER','ADMIN') | NO |  | NULL |  |
| user_profile | mediumblob | YES |  | NULL |  |

## Code
```MySQL
CREATE TABLE USER(
	user_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	user_name VARCHAR(30) NOT NULL,
	user_password VARCHAR(64) NOT NULL,
	user_role ENUM("USER", "ADMIN") NOT NULL,
	user_profile MEDIUMBLOB
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [PlayerLobby](/PlayerLobby.md) | 0..1 |  |   (User—PlayerLobby) |

