package runze.sprdata.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author wrzhxy@qq.com
 * @date 2017Äê10ÔÂ18ÈÕ
 */
@Entity
public class Employee {
	
	private @Id @GeneratedValue Long id;
	private String firstName, lastName, description;
	
	private Employee() {}

	public Employee(String firstName, String lastName, String description) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
	
}
