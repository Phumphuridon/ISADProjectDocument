/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DatabasePackage.*;
/**
 *
 * @author phump
 */
public class main {
    public static void main(String[] args) throws DatabaseInterrupt {
        Database.createConnection();
        Lobby lob = new Lobby();
        lob.create(1, 1, "2024-09-15 14:30:00", "2024-09-15 14:30:01");
        Database.close();
    }
}
