package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	//retorna um department
	Department findById(Integer id);
	//retorna uma lista de department
	List<Department> findAll();

}
