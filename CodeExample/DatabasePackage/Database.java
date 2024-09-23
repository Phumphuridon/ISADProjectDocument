package DatabasePackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author phump
 */
public class Database{
    
    private static Connection connect = null;
    private static Statement statement = null;

    
    private static final String url = "jdbc:mysql://localhost:3306/boardzonedb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String user = "root";
    private static final String password = "1234";
    
    
    /**
     * The method for initialized connection to the database.
     * @throws DatabaseInterrupt 
     */
    public static void createConnection() throws DatabaseInterrupt{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
            throw new DatabaseInterrupt("com.mysql.cj.jdbc.Driver is Not found.");
        } catch (SQLException sqle){
            sqle.printStackTrace();
            throw new DatabaseInterrupt("SQLException Occur.");
        }
    }
    
    /**
     * 
     * @return Connection to the database
     */
    public static Connection getConnection(){
        return connect;
    }
    
    /**
     * 
     * @param sql - an SQL Data Manipulation Language (DML) statement, such as INSERT, {@code UPDATE} or {@code DELETE}; or an SQL statement that returns nothing, such as a DDL statement.
     * @return either (1) the row count for SQL Data Manipulation Language (DML) statements or (2) 0 for SQL statements that return nothing
     * @throws DatabaseInterrupt 
     */
    public static int update(String sql) throws DatabaseInterrupt {
        try{
            statement = connect.createStatement();
            int count = statement.executeUpdate(sql);
            return count;
        } catch(SQLException ex){
            ex.printStackTrace();
            throw new DatabaseInterrupt("SQLException Occur");
        } catch(NullPointerException ex){
            throw new DatabaseInterrupt("Connection might not have been initialized.");
        }
    }
    
    /**
     * 
     * @param sql an SQL statement to be sent to the database, typically a static SQL SELECT statement.
     * @return a {@code ResultSet} object that contains the data produced by the given query.
     * @throws DatabaseInterrupt
     */
    public static ResultSet getSelect(String sql) throws DatabaseInterrupt{
        try{
            statement = connect.createStatement();
            ResultSet rec = statement.executeQuery(sql);
            return rec;
        } catch(SQLException ex){
            ex.printStackTrace();
            throw new DatabaseInterrupt("SQLException Occur");
        } catch(NullPointerException ex){
            throw new DatabaseInterrupt("Connection might not have been initialized.");
        }
    }
    
    /**
     * Releases both {@code statement} and {@code connection} object's database and JDBC resources immediately instead of waiting for them to be automatically released.
     * @throws DatabaseInterrupt 
     */
    public static void close() throws DatabaseInterrupt{
        if (connect != null){
            try {
                statement.close();
                connect.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                throw new DatabaseInterrupt("SQLException Occur");
            }
        }
    }
}
