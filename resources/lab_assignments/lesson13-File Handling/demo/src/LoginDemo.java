


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDemo {


		public static void main(String[] args) {
			
						try {
	           				
				Connection cn;
				ResultSet rs;
				
				cn=DriverManager.getConnection(
		                "jdbc:ucanaccess://C:/Users/admin1/Desktop/FPP-Aug-2015/login_DB.accdb");
				
				Statement stmt = cn.createStatement();
				
	            stmt.executeUpdate("insert into login values('Raja','Rani')");
	            stmt.executeUpdate("insert into login values('Pari','Ramu')");
	            rs = stmt.executeQuery("select * from login");
	            String i1 = "", i2="";
	            while(rs.next())
	            {
	            	i1 = rs.getString(1);
	            	i2 = rs.getString(2);
	            	System.out.println("User id = " + i1 + " Password =" + i2 );
	            
		 	}
			}
	            catch(Exception e)
	            {
	            	 System.out.println("ERROR: " + e);
	            }
	}
}
