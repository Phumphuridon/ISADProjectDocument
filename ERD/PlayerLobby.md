# PlayerLobby
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```PlayerLobby```](/ERD/PlayerLobby.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| player_id | int(11) | NO | PRI | NULL |  |
| lobby_id | int(11) | NO | PRI | NULL |  |

## Code
```MySQL
CREATE TABLE PLAYERLOBBY(
	player_id INT(11),
	lobby_id INT(11),
	PRIMARY KEY (player_id, lobby_id),
	FOREIGN KEY (player_id) REFERENCES USER(user_id),
	FOREIGN KEY (lobby_id) REFERENCES LOBBY(lobby_id)
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [Lobby](/ERD/Lobby.md) | 1 |  | (Lobby—PlayerLobby) |
| [User](/ERD/User.md) | 1 |  | (User—PlayerLobby) |

