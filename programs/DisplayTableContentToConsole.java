import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import jkdatabase.DBconfig;
// import java.sql.
import myPack.Intro;

public class DisplayTableContentToConsole {
    public static void main(String[] args) {
        Intro.print("Display table content to console");
        Statement stmt = null;
        ResultSet rset = null;
        try (Connection con = DriverManager.getConnection(DBconfig.dbString, DBconfig.username, DBconfig.password)) {
            System.out.println("Connection stabilized");
            stmt = con.createStatement();
            String sql = "select * from employee";
            rset = stmt.executeQuery(sql);

            int i = 1;
            System.out.println("Employee table data : ");
            while (rset.next()) {
                int emp_id = rset.getInt(1);
                String name = rset.getString(2);
                int age = rset.getInt(3);
                String dept = rset.getString(4);

                System.out.printf("row %d : %d\t%s\t%d\t%s\n", i++, emp_id, name, age, dept);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null)rset.close();
                if (stmt != null)stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
