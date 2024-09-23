/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePackage;

/**
 *
 * @author phump
 */
public class DatabaseInterrupt extends Exception{
    public DatabaseInterrupt(){
        super();
    }
    
    public DatabaseInterrupt(String s){
        super(s);
    }
}
