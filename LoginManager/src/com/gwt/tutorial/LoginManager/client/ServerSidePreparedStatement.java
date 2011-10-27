package com.gwt.tutorial.LoginManager.client;

//import com.google.gwt.core.client.EntryPoint;
//import com.google.gwt.user.client.ui.RootPanel;
import java.sql.*;

public class ServerSidePreparedStatement 
{

	public static void main(String args[]) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://10.1.6.18:5432/ok";
		Connection conn = DriverManager.getConnection(url,"july","july2005");

		PreparedStatement pstmt = conn.prepareStatement("SELECT ����� from �����; ");

		// cast to the pg extension interface
		org.postgresql.PGStatement pgstmt = (org.postgresql.PGStatement)pstmt;

		// on the third execution start using server side statements
		pgstmt.setPrepareThreshold(3);
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next())
		{
			//pstmt.;
			//boolean usingServerPrepare = pgstmt.isUseServerPrepare();
			//System.out.println("Execution: "+i+", Used server side: " + usingServerPrepare + ", Result: "+rs.getInt(1));
			System.out.println("Result: "+rs.getString(1));
		}

		//rs.close();
		pstmt.close();
		conn.close();
	}
}

//public class TestBase implements EntryPoint {

//	public void onModuleLoad() {
//		RootPanel rootPanel = RootPanel.get();
//	}

//}