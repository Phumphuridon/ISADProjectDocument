
import DatabasePackage.Database;
import DatabasePackage.DatabaseInterrupt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phump
 */
public class Lobby {
    /**
     * 
     * @param boardgame_id
     * @param player_id
     * @param createTime Format {@code "YYYY-MM-DD HH:MM:SS"}
     * @param endTime Format {@code "YYYY-MM-DD HH:MM:SS"}
     * @throws DatabaseInterrupt 
     */
    public void create(int boardgame_id, int player_id, String createTime, String endTime) throws DatabaseInterrupt{
        String sql = String.format("INSERT INTO LOBBY(boardgame_id, player_id, lobby_created_at, lobby_ended_at) VALUES (%d, %d, '%s', '%s')", boardgame_id, player_id, createTime, endTime);
        Database.update(sql);
    }
}
