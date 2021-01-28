import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlTest {
    public MysqlTest() {
    }

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patterns","root", "uber");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
