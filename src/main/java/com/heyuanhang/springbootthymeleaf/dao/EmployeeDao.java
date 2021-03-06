package com.heyuanhang.springbootthymeleaf.dao;

import com.heyuanhang.springbootthymeleaf.entities.Department;
import com.heyuanhang.springbootthymeleaf.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static{
		employees = new HashMap<Integer, Employee>();

		employees.put(1001, new Employee(1001, "张三", "aa@163.com", 1, new Department(101, "研发部")));
		employees.put(1002, new Employee(1002, "李四", "bb@163.com", 1, new Department(102, "市场部")));
		employees.put(1003, new Employee(1003, "王五", "cc@163.com", 0, new Department(103, "开发部")));
		employees.put(1004, new Employee(1004, "小王", "dd@163.com", 0, new Department(104, "测试部")));
		employees.put(1005, new Employee(1005, "heyuanhang", "ee@163.com", 1, new Department(105, "运维部")));
	}
	
	private static Integer initId = 1006;
	
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	
	public Collection<Employee> getAll(){
		return employees.values();
	}

	/**
	 * 根据key获得员工
	 * @param id
	 * @return
	 */
	public Employee get(Integer id){
		return employees.get(id);
	}
	
	public void delete(Integer id){
		employees.remove(id);
	}
}
