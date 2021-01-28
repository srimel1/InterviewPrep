import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class LoadDriver {
    public LoadDriver() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("ver. mysql-connector-java-8.0.21").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306");
    }


}

