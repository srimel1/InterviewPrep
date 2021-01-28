import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class MysqlConn {
    public static void main(String args[]) {

        final String url = "jdbc:mysql://localhost:3306/practice";
        final String user = "root";
        final String password = "uber";

        Connection con;
        Statement stmt;
        ResultSet rs;
        String query ="select * from employee";




    }
}