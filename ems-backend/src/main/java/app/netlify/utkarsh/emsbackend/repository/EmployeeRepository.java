package app.netlify.utkarsh.emsbackend.repository;

import app.netlify.utkarsh.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
