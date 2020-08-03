package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Employee;

@Repository
public interface EmployeeDao {
	public List<Employee> getList(Employee emp);
}
