import java.sql.*; 
import javax.swing.JOptionPane; 
class Corona_sql 
{     
	public static void main(String[] args) throws Exception 
	{         
		Class.forName("com.mysql.jdbc.Driver").newInstance();   
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/harshpreet_corona?user=root&password=root");         
		
		String n=JOptionPane.showInputDialog("Enter Name of the State");         
		String nc=JOptionPane.showInputDialog("Enter New cases");         
		long ncase=Long.parseLong(nc);
		String rc=JOptionPane.showInputDialog("Enter Recovered cases");         
		long rcase=Long.parseLong(rc);
		String d=JOptionPane.showInputDialog("Enter Deaths");         
		long dcase=Long.parseLong(d);   
		
		if(n.equals("Punjab"))
		{
			String sql="Update corona_analysis1 set Confirmed_cases=Confirmed_cases+?,New_cases=?,Recovered_cases=Recovered_cases+?,Deaths=Deaths+? where Serial_no=1";
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1, ncase);        
			st.setLong(2, ncase);                
			st.setLong(3, rcase);
			st.setLong(4, dcase);
			st.executeUpdate();   
			st.close();
				
		}
		else if(n.equals("Uttarakhand"))
		{
			String sql="Update corona_analysis1 set Confirmed_cases=Confirmed_cases+?,New_cases=?,Recovered_cases=Recovered_cases+?,Deaths=Deaths+? where Serial_no=2";
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1, ncase);        
			st.setLong(2, ncase);                
			st.setLong(3, rcase);
			st.setLong(4, dcase);
			st.executeUpdate();   
			st.close();
		}
		else if(n.equals("Maharashtra"))
		{
			String sql="Update corona_analysis1 set Confirmed_cases=Confirmed_cases+?,New_cases=?,Recovered_cases=Recovered_cases+?,Deaths=Deaths+? where Serial_no=3";
			PreparedStatement st = con.prepareStatement(sql); 
			st.setLong(1, ncase);        
			st.setLong(2, ncase);                
			st.setLong(3, rcase);
			st.setLong(4, dcase);
			st.executeUpdate();   
			st.close();
		}
		else 
		{
			String sql="Update corona_analysis1 set Confirmed_cases=Confirmed_cases+?,New_cases=?,Recovered_cases=Recovered_cases+?,Deaths=Deaths+? where Serial_no=4";
			PreparedStatement st = con.prepareStatement(sql);  
			st.setLong(1, ncase);        
			st.setLong(2, ncase);                
			st.setLong(3, rcase);
			st.setLong(4, dcase);
			st.executeUpdate();   
			st.close();
		}
		     
		                 
		con.close();         
		System.out.println("---SQL executed successfully---");     
		System.out.println("Harshpreet");
		System.out.println("65");
	} 
} 