package in.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

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

	private DataSource ds;
	
	public void createParty(Party party) throws SQLException{
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into parrty (party_id,party_enum_type_id) values (?,?)");
		ps.setString(1, party.getPartyEnumTypeId());
		ps.setString(1, party.getparty_enum_type_id);
		
		int ex = ps.executeUpdate();
				if(ex>0) {
					System.out.println("Data Successfully Inserted");
				}
				else {
					System.err.println("Failed to Insert your data");
				}
		
	} 
	
}

