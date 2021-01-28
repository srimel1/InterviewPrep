import java.sql.*;

/***
 * Java program to establish database connection to mysql
 * and execute a query via select statements
 * uses mysql driver, mysql database
 * schema: practice
 * database table: employee(eid, name, phone, dob, salary)
 *
 * create table employee (
 *                           id int auto_increment primary key,
 *                           name varchar(50),
 *                           address varchar(200),
 *                           phone varchar(20),
 *                           dob varchar(20)
 * );
 ***/
class mys {
    public static void main(String args[]) {


        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/practice", "root", "uber");

            String query = "SELECT * FROM employee";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("eid");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                int salary = rs.getInt("salary");

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s\n", id, name, address, phone, dob, salary);

            }


        } catch (Exception e) {
            System.out.println(e);
        }


    }
}  