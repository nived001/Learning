package learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectOracle {
	public static void main(String[] args) throws SQLException {

		String dbName = "jdbc:oracle:thin:@localhost:1521:PTS";
		String userName = "smf_owner";
		String password = "smfowner";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbName, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (connection != null) {
			System.out.println("Successfullly connected to Oracle DB");
		} else {
			System.out.println("Failed to connect to Oracle DB");
		}

		Statement st = connection.createStatement();

		ResultSet rs = st.executeQuery("select TICKER,SECURITYTYPE from smftable where symbol='AAPL'");
		while (rs.next()) {

			String TICKER = rs.getString("TICKER");
			String SecType = rs.getString("SECURITYTYPE");
			System.out.println("SECURITYTYPE"+"\t"+"TICKER");
			System.out.println(SecType+"\t"+TICKER);
		}

	}

}
