Relation Between User <-> Lobby AND Lobby <-> Boardgame

<img width="527" alt="Relations" src="https://github.com/user-attachments/assets/d3be853a-3995-4197-bedd-99d314bc4c76">


TABLE: USER

| FIELD  | TYPE | NULL | KEY  | DEFAULT | EXTRA |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| user_id | INT(11)  | NO  | PRI  | NULL | auto_increment  |
| user_name  | VARCHAR(30)  | NO  | | NULL | |
| user_password  | VARCHAR(64)  | NO  | | NULL |  |
| user_role  | ENUM('USER', 'ADMIN')  | NO  | | NULL |  |
| user_create_at  | DATE  | YES  |  | NULL | |

```mySQL
CREATE TABLE USER(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	user_name varchar(30) NOT NULL,
	user_password varchar(64) NOT NULL,
	user_role ENUM("USER", "ADMIN") NOT NULL,
	user_created_at DATE
);
```

TABLE: BOARDGAME

| FIELD  | TYPE | NULL | KEY  | DEFAULT | EXTRA |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| boardgame_id | INT(11)  | NO  | PRI  | NULL | auto_increment  |
| boardgame_name  | VARCHAR(30)  | NO  | | NULL | |
| boardgame_max_player  | INT(11)  | NO  | | NULL |  |
| boardgame_description  | VARCHAR(150) | YES  | | NULL |  |

```MySQL
CREATE TABLE BOARDGAME(
	boardgame_id INT AUTO_INCREMENT PRIMARY KEY,
	boardgame_name VARCHAR(30) NOT NULL,
	boardgame_max_player INT NOT NULL,
	boardgame_description VARCHAR(150)
);
```

TABLE: LOBBY

| FIELD  | TYPE | NULL | KEY  | DEFAULT | EXTRA |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| lobby_id	 | INT(11)  | NO  | PRI  | NULL | auto_increment  |
| boardgame_id  | INT(11)  | NO  | PRI, MUL | NULL | |
| player_id  | INT(11)  | NO  | PRI, MUL | NULL |  |
| lobby_created_at  | DATE | YES  | | NULL |  |

```MySQL
CREATE TABLE LOBBY(
	lobby_id INT AUTO_INCREMENT,
	boardgame_id int NOT NULL,
	player_id int NOT NULL,
	lobby_created_at DATE,
	PRIMARY KEY (lobby_Id, boardgame_id, player_id),
	FOREIGN KEY (boardgame_id) REFERENCES BOARDGAME(boardgame_id),
	FOREIGN KEY (player_id) REFERENCES user(user_id)
);
```
