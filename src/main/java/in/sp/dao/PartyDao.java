package in.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.sp.entity.Party;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PartyDao {
	
	@Autowired
	private DataSource ds;
	
	public void createParty(Party party) throws SQLException{
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into party (party_id,party_enum_type_id) values (?,?)");
		ps.setString(1, party.getPartyId());
		ps.setString(1, party.getPartyEnumTypeId());
		
		int ex = ps.executeUpdate();
				if(ex>0) {
					System.out.println("Data Successfully Inserted");
				}
				else {
					System.err.println("Failed to Insert your data");
				}
		
	} 
	
}

