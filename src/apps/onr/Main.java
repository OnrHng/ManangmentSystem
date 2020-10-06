package apps.onr;
import java.sql.*;


public class Main {

    private static final String username = "onur";
    private static final String password = "3000";
    private static final String dbConnect = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbConnect, username, password );
        System.out.println("connected");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select firstname from Student");
        while (rs.next()) {
            System.out.println("Name :" + rs.getString(1));
        }
    }
}
