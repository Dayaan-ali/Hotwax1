package in.sp.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import in.sp.entity.Person;
@Component
public class PersonDao {

	private DataSource ds;
	
	public void createPerson(Person person)throws SQLException{
		Connection con = ds.getConnection();
		
		
		
	}
	
}
