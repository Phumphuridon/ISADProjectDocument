# Boardgame
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```Boardgame```](/Boardgame.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| boardgame_id | int(11) | NO | PRI | NULL | auto_increment |
| boardgame_name | varchar(50) | NO |  | NULL |  |
| boardgame_max_player | int(11) | NO |  | NULL |  |
| lobby_id | int(11) | YES | MUL | NULL |  |
| imageset_id | int(11) | NO | MUL | NULL |  |
| boardgame_description | varchar(3500) | YES |  | NULL |  |

## Code
```MySQL
CREATE TABLE BOARDGAME(
	boardgame_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	boardgame_name VARCHAR(50) NOT NULL,
	boardgame_max_player INT(11) NOT NULL,
	lobby_id INT(11),
	imageset_id INT(11) NOT NULL,
	boardgame_description VARCHAR(3500),
	FOREIGN KEY (lobby_id) REFERENCES LOBBY(lobby_id),
	FOREIGN KEY (imageset_id) REFERENCES IMAGESET(imageset_id)
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [Lobby](/Lobby.md) | 0..1 |  | (Lobby—Boardgame) |
| [ImageSet](/ImageSet.md) | 1 |  | (Boardgame—ImageSet) |

