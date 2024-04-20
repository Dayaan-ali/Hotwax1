package in.sp.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.sp.entity.Person;

public class PersonDao {

	private DataSource ds;
	
	public void createPerson(Person person)throws SQLException{
		Connection con = ds.getConnection();
		
		
		
	}
	
}
