package graphic.tool.db;

import java.sql.Statement;

public class Connection {
    String database_name;
    String user;
    String password;
    
    public void setDatabase(String name){
        this.database_name = name;
    }
    public String getDatabase(){
        return this.database_name;
    }
    
    public void setUser(String name){
        this.user = name;
    }
    public String getUser(){
        return this.user;
    }
    
    public void setPassword(String pwd){
        this.password = pwd;
    }
    public String getPassword(){
        return this.password;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
