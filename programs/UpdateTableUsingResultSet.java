import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import jkdatabase.DBconfig;
import myPack.Intro;

public class UpdateTableUsingResultSet {
    public static void main(String[] args) {
        Intro.print("Update row using ResultSet");
        Statement stmt = null;
        ResultSet rset = null;
        try (Connection con = DriverManager.getConnection(DBconfig.dbString, DBconfig.username, DBconfig.password)) {
            System.out.println("Connection stabilized");
            stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "select * from employee";
            rset = stmt.executeQuery(sql);

            int i = 1;
            System.out.println("Employee table data before update : ");
            while (rset.next()) {
                int emp_id = rset.getInt(1);
                String name = rset.getString(2);
                int age = rset.getInt(3);
                String dept = rset.getString(4);
                System.out.printf("row %d : %d\t%s\t%d\t%s\n", i++, emp_id, name, age, dept);
            }
            // update starts from here
            
            Scanner sc = new Scanner(System.in);
            System.out.println("|\nEnter name for id = 2");
            String newName = sc.nextLine();
            // re-initialize rset so it again point to starting record 
            rset  = stmt.executeQuery(sql) ;
            System.out.println("Employee table data after update : ");
            i = 1 ;
            while (rset.next()) {
                int emp_id = rset.getInt(1);
                if (emp_id == 2){
                    rset.updateString("emp_name",newName) ;
                    rset.updateRow(); 
                }
                String name = rset.getString(2);
                int age = rset.getInt(3);
                String dept = rset.getString(4);
                System.out.printf("row %d : %d\t%s\t%d\t%s\n", i++, emp_id, name, age, dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null)
                    rset.close();
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
