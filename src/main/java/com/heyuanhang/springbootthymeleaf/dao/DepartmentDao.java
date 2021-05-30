package com.heyuanhang.springbootthymeleaf.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.heyuanhang.springbootthymeleaf.entities.Department;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {

	private static Map<Integer, Department> departments = null;
	
	static{
		departments = new HashMap<Integer, Department>();
		
		departments.put(101, new Department(101, "研发部"));
		departments.put(102, new Department(102, "市场部"));
		departments.put(103, new Department(103, "开发部"));
		departments.put(104, new Department(104, "测试部"));
		departments.put(105, new Department(105, "运维部"));
	}

	/**
	 * 获取所有的部门
	 * @return
	 */
	public Collection<Department> getDepartments(){
		return departments.values();
	}

	/**
	 * 根据key获得部门信息
	 * @param id key
	 * @return
	 */
	public Department getDepartment(Integer id){
		//根据key获得部门信息
		return departments.get(id);
	}
	
}
