import java.sql.*; 
import javax.swing.JOptionPane; 
class DynamicInsertPST1 
{     
	public static void main(String[] args) throws Exception 
	{         
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");         
		
		String n=JOptionPane.showInputDialog("Enter Name:");         
		String s=JOptionPane.showInputDialog("Enter Salary:");         
		float fs=Float.parseFloat(s);
		String sid=JOptionPane.showInputDialog("Enter Id");         
		int id =Integer.parseInt(sid);         
		
		// ? : place holder or parameter (parameterized query)         
		String sql = "UPDATE emp1 SET name=?,salary=? WHERE empId=?";                  
		PreparedStatement st = con.prepareStatement(sql);         
		
		//bind data in PST         
		st.setString(1, n);// 1 specifies the first parameter in the query           
		st.setFloat(2, fs);  // 2  specifies the second parameter in the query               
		st.setInt(3, id); //PK 
		st.executeUpdate(); //no agrument         
		st.close();         
		con.close();         
		System.out.println("---SQL executed successfully---");     
	} 
} 