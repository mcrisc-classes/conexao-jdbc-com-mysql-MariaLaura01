import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			
			// TODO Especifique a URL de conexão na linha abaixo
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useTimezone=true&serverTimezone=UTC", "root", "abcD-123456S2");
			//("jdbc:mysql://localhost:3306/world?useTimezone=true&serverTimezone=UTC" + "user=root&password=abcD-123456S2");
			
			System.out.println("Connected: " + conn.isValid(3));
			
			conn.close();
			System.out.println("Connected: " + conn.isValid(3));
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
