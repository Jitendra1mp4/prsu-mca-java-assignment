import myPack.Intro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import jkdatabase.DBconfig;
public class InsertMultipleWithPrepare {
    public static void main(String[] args) {
        Intro.print("Multiple Insert Using Prepare Statement");
        Statement stmt = null;
        ResultSet rset = null;
        try (Connection con = DriverManager.getConnection(DBconfig.dbString, DBconfig.username, DBconfig.password)) {
           String insertQuery = "insert into employee (emp_id, emp_name, age , dept) values (?,?,?,?)";
           PreparedStatement prepStmt = con.prepareStatement(insertQuery);

            System.out.println("connection established!"); 

            con.setAutoCommit(false);
            prepStmt.setString(1, "1");
            prepStmt.setString(2, "Jitendra Sahu");
            prepStmt.setString(3, "21");
            prepStmt.setString(4, "CS&IT");
            prepStmt.addBatch();

            prepStmt.setString(1, "2");
            prepStmt.setString(2, "Mohan Markam");
            prepStmt.setString(3, "26");
            prepStmt.setString(4, "Social");
            prepStmt.addBatch();

            prepStmt.setString(1, "3");
            prepStmt.setString(2, "Kanhaiya");
            prepStmt.setString(3, "41");
            prepStmt.setString(4, "LibraryScience");
            prepStmt.addBatch();

            int[] affectedRecords = prepStmt.executeBatch();
            con.commit();

            System.out.println("Rows inserted : " + affectedRecords.length);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) rset.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
