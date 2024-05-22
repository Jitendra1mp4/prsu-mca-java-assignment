import myPack.Intro ;
import java.sql.Statement ;
import java.sql.Connection ;
import java.sql.SQLException ;
import java.sql.DriverManager ;

public class CreateEmployeeTable {
    public static void main(String[] args) {
		new Intro("create employee table in db") ;
        final String dbUrl = "jdbc:mysql://192.168.30.128:3306/test" ;
		final String username = "root" ;
		final String password = "root" ;
	
		try(Connection con = DriverManager.getConnection(dbUrl,username,password) ){
			Statement stmt = con.createStatement() ;
			String sql = "create TABLE employee(emp_id int(2), emp_name varchar(15),age int(2), dept varchar(20))" ;
			stmt.execute(sql) ;
			System.out.println("Table created!\n") ;
		}catch(SQLException e){
			e.printStackTrace() ;
		}
    }
}
