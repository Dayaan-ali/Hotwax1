package in.sp.ctl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.dao.PersonDao;
import in.sp.entity.Person;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class PersonCtl {

	@Autowired
	private PersonDao Persondao;

	@PostMapping("/api/person")
	public ResponseEntity<String> createPerson(@RequestBody Person person) {
		try {
			System.out.println(person);
			Persondao.createPerson(person);

		} catch (SQLException e) {
			e.printStackTrace();
			return ResponseEntity.ok("Failed to create person");
		}
		return ResponseEntity.ok("Person created successfully");
	}

}
