package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JDBC {

	public static void main(String[] args) {

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/java2novice","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			Statement stmt1=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)
			+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
			
	
			
int rows=stmt1.executeUpdate("INSERT INTO EMPLOYEES (EMP_ID, NAME, DEPARTMENT, SALARY, JOINED_ON) VALUES (5, 'Ashish Sharma', 'IT', 40000, CURRENT_TIMESTAMP");
			//int rows=stmt.executeUpdate(insertQuery);
	        
ResultSet rs2=null;
			while(rs2.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)
				+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
			
			con.commit();
			con.close();  
			}catch(Exception e){ System.out.println(e);}
	}

}
