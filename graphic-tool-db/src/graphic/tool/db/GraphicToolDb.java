package graphic.tool.db;

//import java.sql.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GraphicToolDb {

    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter writer;
            writer = new BufferedWriter(new FileWriter("text.txt"));
            writer.write("dblivros\n");
            writer.write("koller\n");
            writer.write("password\n");
            writer.close();
        } catch (IOException ex) {
            throw ex;
        }
    }
}