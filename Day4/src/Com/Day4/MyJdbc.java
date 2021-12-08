package Com.Day4;
import java.sql.*;
import com.mysql.*;


public class MyJdbc {

	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String connectionString="jdbc:mysql://localhost:3306/demo?characterEncoding=utf8";
		String userName="root";
		String password="root";
		Connection con=DriverManager.getConnection(connectionString,userName,password);
		if(con!=null)
		{
		System.out.println("connected");
		}
		else
		{
		System.out.println("Not connected");
		}

		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		}



		
	}


