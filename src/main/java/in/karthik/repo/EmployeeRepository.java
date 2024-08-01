package in.karthik.repo;

//ctrl+shift+O
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.karthik.entity.Employee;


public interface EmployeeRepository 
	extends JpaRepository<Employee, Long>
{

	@Modifying
	@Query("UPDATE Employee SET empName=:ename WHERE empId=:eid")
	int updateEmployeeName(String ename, Long eid);
}
