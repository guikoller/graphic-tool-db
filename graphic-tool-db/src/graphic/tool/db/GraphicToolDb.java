package graphic.tool.db;

import java.sql.*;

public class GraphicToolDb {

    public static void main(String[] args) {
        try{
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/livrosdb", "koller", "password");
            
            Statement stmt;
            stmt = conn.createStatement();
            
            ResultSet rs;
            rs = stmt.executeQuery("SHOW COLUMNS FROM livrosdb.books");
            
            while(rs.next()){
                System.out.print(rs.getString(1)+" ");
                System.out.print("PRI".equals(rs.getString(4)) ? "PK" : "");
                System.out.println("");
            }
            
            conn.close();
            
        }catch(SQLException  e){
            System.out.println(e);
        }
    }
}
