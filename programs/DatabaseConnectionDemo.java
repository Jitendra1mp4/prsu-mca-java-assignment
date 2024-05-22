import myPack.Intro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionDemo {
    public static void main(String[] args) {
        Intro.print("Establish connection to the database");
        final String dbString = "jdbc:mysql://localhost:3306/test";
        Connection con = null;
        Statement stmt = null;
        ResultSet rset = null;
        try {
        con = DriverManager.getConnection(dbString, "root", "");
            System.out.println("Connection stablized");

            stmt = con.createStatement();
            String query = "select id , sname from student ";
            rset = stmt.executeQuery(query);

            while (rset.next()) {
                System.out.println("id : " + rset.getInt("id") + " name : " + rset.getString("sname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) rset.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
