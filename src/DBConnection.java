import java.sql.Connection;
import java.sql.DriverManager;

//Avinash Jadhav Batch-212

public class DBConnection {
    public static Connection getDBConnection(){
        Connection con = null;
        try{
            String driver = "oracle.jdbc.driver.OracleDriver";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "system";
            String password = "5252";
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(con!=null){
            System.out.println("Database Connected Successfully ✅");
            return con;
        }else {
            System.out.println("Database Not Connected ❌");
            return null;
        }
    }
}
