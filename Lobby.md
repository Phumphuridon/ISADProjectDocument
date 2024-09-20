# Lobby
[```ERDDiagram```](/ERDDiagram.md)::[```User```](/Lobby.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| lobby_id | int(11) | NO | PRI | NULL | auto_increment |
| lobby_created_at | datetime | YES |  | NULL |  |
| lobby_ended_at | datetime | YES |  | NULL |  |

## Code
```MySQL
CREATE TABLE LOBBY(
	lobby_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	lobby_created_at DATETIME,
	lobby_ended_at DATETIME
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [PlayerLobby](/PlayerLobby.md) | 0..* |  | (Lobby—PlayerLobby) |
| [Boardgame](/Boardgame.md) | 1 |  | (Lobby—Boardgame) |

