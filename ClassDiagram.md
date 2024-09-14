TABLE: USER

| FIELD  | TYPE | NULL | KEY  | DEFAULT | EXTRA |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| user_id | INT(11)  | NO  | PRI  | NULL | auto_increment  |
| user_name  | VARCHAR(30)  | NO  | | NULL | |
| user_password  | VARCHAR(64)  | NO  | | NULL |  |
| user_role  | ENUM('USER', 'ADMIN')  | NO  | | NULL |  |
| user_create_at  | DATE  | YES  |  | NULL | |
