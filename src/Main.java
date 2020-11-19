import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		
		try {
			
			// TODO Especifique a URL de conexão na linha abaixo
			Connection conn = DriverManager.getConnection("");
			
			
			System.out.println("Connected: " + conn.isValid(3));
			// usaria a conexão aqui
			conn.close();
			System.out.println("Connected: " + conn.isValid(3));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
