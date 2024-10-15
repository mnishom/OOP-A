package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    public static Connection hubungkan(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("pos"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection c = m.getConnection();
            System.out.println("Sukses terhubung");
            
            return c;
            
        } catch (SQLException e) {
            System.err.println("GAGAL terhubung\n"+e.getMessage());
        }
        
        return null;        
    }
}
