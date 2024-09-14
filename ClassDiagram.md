TABLE: USER

| FIELD  | TYPE | NULL | KEY  | DEFAULT | EXTRA |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| user_id | INT(11)  | NO  | PRI  | NULL | auto_increment  |
| user_name  | VARCHAR(30)  | NO  | | NULL | |
| user_password  | VARCHAR(64)  | NO  | | NULL |  |
| user_role  | ENUM('USER', 'ADMIN')  | NO  | | NULL |  |
| user_create_at  | DATE  | YES  |  | NULL | |

TABLE: BOARDGAME

| FIELD  | TYPE | NULL | KEY  | DEFAULT | EXTRA |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| boardgame_id | INT(11)  | NO  | PRI  | NULL | auto_increment  |
| boardgame_name  | VARCHAR(30)  | NO  | | NULL | |
| boardgame_max_player  | INT(11)  | NO  | | NULL |  |
| boardgame_description  | VARCHAR(150) | YES  | | NULL |  |
