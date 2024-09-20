# User

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| user_id | int(11) | NO | PRI | NULL | auto_increment |
| user_name | varchar(30) | NO |  | NULL |  |
| user_password | varchar(64) | NO |  | NULL |  |
| user_role | enum('USER','ADMIN') | NO |  | NULL |  |
| user_profile | mediumblob | YES |  | NULL |  |
