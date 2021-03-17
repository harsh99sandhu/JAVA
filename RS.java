import java.sql.*; 
class RS 
{     
	public static void main(String[] args) throws Exception 
	{         
		Class.forName("com.mysql.jdbc.Driver").newInstance();         
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root"); 
 
        String sql = "SELECT empId, name ,salary FROM emp1 WHERE empId <= ?";         
		PreparedStatement st = con.prepareStatement(sql);        
		// st.setInt(1, 3);//print data from index 1 to 3           
		st.setInt(1, 5);//print data from index 1 to 5 
 
        ResultSet rs = st.executeQuery();         
		while (rs.next()) 
		{             
			System.out.println(rs.getInt("empId")+" "+rs.getString("name")+ " "+rs.getFloat("salary"));         
		}         
		rs.close();        
		st.close();         
		con.close();         
		System.out.println("---SQL executed successfully---");     
	}
} 