package runze.sprdata.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import runze.sprdata.pojo.Employee;

/**
 * @author wrzhxy@qq.com
 * @date 2017��10��18��
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	Employee findByFirstName(String firstName);
	List<Employee> findByLastName(String lastName);
}
