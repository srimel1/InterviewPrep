import java.sql.*;

public class JavaMysqlSelectExample {

    public static void main(String[] args)
    {
        try
        {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "uber");

            // our SQL SELECT query.
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM employee";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                int salary = rs.getInt("salary");

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s\n", id, name, address, phone, dob, salary);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Oops you messed up");
            System.err.println(e.getMessage());
        }
    }
}

