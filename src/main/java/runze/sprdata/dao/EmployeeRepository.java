package runze.sprdata.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import runze.sprdata.pojo.Employee;

/**
 * @author wrzhxy@qq.com
 * @date 2017Äê10ÔÂ18ÈÕ
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	Employee findByFirstName(String firstName);
	List<Employee> findByLastName(String lastName);
}
