package controllers;

import java.sql.Connection;
import java.sql.DriverManager;

import play.db.DB;
 
import com.dhtmlx.connector.*;


public class BasicConnector extends ConnectorServlet {
	@Override
	protected void configure() {
                //obtain DB connection
		Connection conn=null;
		Connection connection =null;
		 
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			//conn = DriverManager.getConnection("jdbc:mysql://localhost/sampleDB", "root", "");
			connection = DB.getConnection();
			conn = connection;
		} catch (Throwable e) {
			e.printStackTrace();
		}
 
                //Initialize connector
		SchedulerConnector c = new SchedulerConnector(conn,DBType.MySQL);
                //configure used table and fields
		c.render_table("grid50000", "item_id", "item_nm,item_cd");
	}
}