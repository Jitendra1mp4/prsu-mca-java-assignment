// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class MySQLJDBCExample {
//     public static void main(String[] args) {
//         // URL of the MySQL database
//         final String dbName = "test" ;
//         final String jdbcUrl = "jdbc:mysql://localhost:3306/"+dbName;
//         final String username = "root"; // Update with your database username
//         final String password = ""; // Update with your database password

//         Connection connection = null;
//         Statement statement = null;
//         ResultSet resultSet = null;

//         try {
//             // Load the MySQL JDBC driver (optional for JDBC 4.0 and later)
//             // Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish the connection
//             connection = DriverManager.getConnection(jdbcUrl, username, password);
//             System.out.println("Connection established successfully.");

//             // Create a statement
//             statement = connection.createStatement();

//             // Execute a query
//             String sql = "SELECT * FROM student"; // Update with your SQL query
//             resultSet = statement.executeQuery(sql);

//             // Process the result set
//             while (resultSet.next()) {
//                 // Example: Retrieve data by column name
//                 int id = resultSet.getInt("id");
//                 String name = resultSet.getString("sname");
//                 System.out.println("ID: " + id + ", Name: " + name);
//             }
//         }
//         //  catch (ClassNotFoundException e) {
//         //     e.printStackTrace();
//         // }
//          catch (SQLException e) {
//             e.printStackTrace();
//         } finally {
//             // Close resources in the reverse order of their creation
//             try {
//                 if (resultSet != null) resultSet.close();
//                 if (statement != null) statement.close();
//                 if (connection != null) connection.close();
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * MySQLJDBCExample
 */
public class MySQLJDBCExample {

	public static void main(String[] args) throws Exception{
        final String dbString = "jdbc:mysql://localhost:3306/test" ;

        Connection con = null ;
        Statement stmt = null ;
        ResultSet rset = null ;

        try{
			con = DriverManager.getConnection(dbString,"root","");
			System.out.println("Connection stablized") ;
			
			stmt = con.createStatement();
			String query = "select id , sname from student " ;
			rset = stmt.executeQuery(query) ;
			
			while(rset.next() ){
				System.out.println("id : "+ rset.getInt("id") + " name : "+rset.getString("sname"));
			}
			
		}catch(SQLException e){
			e.printStackTrace() ;
		}finally{
			try{
				if (rset != null ) rset.close() ;
				if (stmt != null ) stmt.close() ;
				if (con != null ) con.close() ;
			}catch(SQLException e){
				e.printStackTrace() ;
			}
		}

    }
}
