import java.sql.*; 
import javax.swing.JOptionPane; 
class Inventory 
{     
	public static void main(String[] args) throws Exception 
	{         
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harshpreet_inevntory?user=root&password=root");         
		
		String n=JOptionPane.showInputDialog("Enter Name:");  
		String c=JOptionPane.showInputDialog("Enter Comapny:");
		String ct=JOptionPane.showInputDialog("Enter Category:");
		String item=JOptionPane.showInputDialog("Enter No of items");         
		int id =Integer.parseInt(item);         
		String s=JOptionPane.showInputDialog("Enter Price:");         
		float fs=Float.parseFloat(s);
		
		// ? : place holder or parameter (parameterized query)         
		String sql = "INSERT INTO inventory(name,company,category,noofitem,price) VALUE(?,?,?,?,?)";                    
		PreparedStatement st = con.prepareStatement(sql);         
		
		//bind data in PST         
		st.setString(1, n);// 1 specifies the first parameter in the query           
		st.setString(2, c);
		st.setString(3, ct);
		st.setInt(4, id);
		st.setFloat(5, fs);  // 2  specifies the second parameter in the query               
		st.executeUpdate(); //no agrument         
		st.close();         
		con.close();         
		System.out.println("---SQL executed successfully---");    
		System.out.println("Harshpreet");
		System.out.println("65");
	} 
} 