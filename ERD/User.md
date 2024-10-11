# User
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```User```](/ERD/User.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| user_id | int(11) | NO | PRI | NULL | auto_increment |
| user_name | varchar(30) | NO | UNI | NULL |  |
| user_password | char(64) | NO |  | NULL |  |
| user_profile | mediumblob | YES |  | NULL |  |

## Code
```MySQL
CREATE TABLE USER(
	user_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	user_name VARCHAR(30) UNIQUE NOT NULL,
	user_password char(64) NOT NULL,
	user_profile MEDIUMBLOB
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [PlayerLobby](/ERD/PlayerLobby.md) | 0..1 |  |   (User—PlayerLobby) |
| [Contributions](/ERD/Contributions.md) | 0..1 |  |   (User—Contributions) |


