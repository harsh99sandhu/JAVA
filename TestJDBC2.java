import java.sql.*;
class TestJDBC2
{
	public static void main(String[] args) throws Exception
{
	//1. Collect Database and Driver Info
	String driverClassName = "com.mysql.jdbc.Driver";

	String url="jdbc:mysql://localhost/jdbc";
	String user="root";
	String pwd= "root";//root
	
	//2. Load JDBC Driver / Register a Driver
	Class.forName(driverClassName).newInstance();
	
	//3. Open a Connection
	Connection con = DriverManager.getConnection(url,user,pwd);
	System.out.println("con---->"+con);
	
	//4. Create Statement and execute sql
	Statement st = con.createStatement();
	String sql = "UPDATE emp1 SET name='Raj', salary=50000 where empId=4";
	st.executeUpdate(sql);
	
	//5. close st and con : use finally block
	st.close();
	con.close();
	System.out.println("---SQL executed successfully---");
}
}
