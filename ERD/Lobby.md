# Lobby
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```Lobby```](/ERD/Lobby.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| lobby_id | int(11) | NO | PRI | NULL | auto_increment |
| lobby_description | datetime | YES |  | NULL |  |
| lobby_created_at | datetime | NO |  | NULL |  |
| lobby_ended_at | datetime | NO |  | NULL |  |

## Code
```MySQL
CREATE TABLE LOBBY(
	lobby_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	lobby_description VARCHAR(150),
	lobby_created_at DATETIME NOT NULL,
	lobby_ended_at DATETIME NOT NULL
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [PlayerLobby](/ERD/PlayerLobby.md) | 0..* |  | (Lobby—PlayerLobby) |
| [Boardgame](/ERD/Boardgame.md) | 1 |  | (Lobby—Boardgame) |

