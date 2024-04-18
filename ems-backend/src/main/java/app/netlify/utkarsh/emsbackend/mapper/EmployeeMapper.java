package app.netlify.utkarsh.emsbackend.mapper;

import app.netlify.utkarsh.emsbackend.dto.EmployeeDto;
import app.netlify.utkarsh.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
          employee.getId(),
          employee.getFirstName(),
          employee.getLastName(),
          employee.getEmail()

        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
          employeeDto.getId(),
          employeeDto.getFirstName(),
          employeeDto.getLastName(),
          employeeDto.getEmail()

        );
    }
}
