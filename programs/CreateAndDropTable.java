import myPack.Intro;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

public class CreateAndDropTable {
	public static void main(String[] args) {
		new Intro("create and delete a table in db");
		final String dbUrl = "jdbc:mysql://192.168.30.128:3306/test";
		final String username = "root";
		final String password = "root";
		Scanner sc = new Scanner(System.in);
		try (Connection con = DriverManager.getConnection(dbUrl, username, password)) {
			Statement stmt = con.createStatement();
			String sql_createTable = "create TABLE temp(id int(2), tname varchar(15))";
			String sql_dropTable = "drop TABLE temp";
			stmt.execute(sql_createTable);
			System.out.println("Table created!\n");
			System.out.println("Enter to delete table!\n");
			sc.nextLine();
			stmt.execute(sql_dropTable);
			System.out.println("Table Dropped!\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
