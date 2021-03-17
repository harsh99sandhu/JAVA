import java.sql.*; 
import javax.swing.JOptionPane; 
class Cal_sql 
{     
	public static void main(String[] args) throws Exception 
	{         
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harshpreet_bank?user=root&password=root");         
		
		String n=JOptionPane.showInputDialog("Enter Name:");         
		String s=JOptionPane.showInputDialog("Enter deposit amount:");         
		float fs=Float.parseFloat(s);
		String ss=JOptionPane.showInputDialog("Enter withdrawal amount:");         
		float ws=Float.parseFloat(ss);
		float bal=fs-ws;
		
		// ? : place holder or parameter (parameterized query)         
		String sql = "INSERT INTO details(name,balance) VALUE(?,?)";              
		PreparedStatement st = con.prepareStatement(sql);         
		
		//bind data in PST         
		st.setString(1, n);// 1 specifies the first parameter in the query           
		st.setFloat(2, bal);  // 2  specifies the second parameter in the query               
		st.executeUpdate(); //no agrument         
		st.close();         
		con.close();         
		System.out.println("---SQL executed successfully---");     
		System.out.println("Harshpreet");
		System.out.println("65");
	} 
} 