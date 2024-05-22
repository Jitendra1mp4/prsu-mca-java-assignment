import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import jkdatabase.DBconfig ;
import myPack.Intro;
public class DBMetadataExample {

    // JDBC URL, username, and password of MySQL server
    public static void main(String[] args) {
        new Intro("printing database metadata");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(DBconfig.dbString, DBconfig.username, DBconfig.password);

            // Get DatabaseMetaData
            DatabaseMetaData dbMetaData = connection.getMetaData();

            // Print general database information
            System.out.println("Database Product Name: " + dbMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbMetaData.getDatabaseProductVersion());
            System.out.println("Database URL: " + dbMetaData.getURL());
            System.out.println("Database User: " + dbMetaData.getUserName());

            // Print tables in the database
            ResultSet tables = dbMetaData.getTables(null, null, "%", new String[]{"TABLE"});
            System.out.println("\nTables in the database:");
            // while (tables.next()) {
            //     System.out.println(tables.getString("emp_id"));
            // }

            // Create a statement to execute a query
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employee");

            // Get ResultSetMetaData
            ResultSetMetaData rsMetaData = resultSet.getMetaData();

            // Print column information
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("\nColumns in the Employee table:");
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i + ": " + rsMetaData.getColumnName(i) + " - " + rsMetaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources in reverse order of their creation
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
