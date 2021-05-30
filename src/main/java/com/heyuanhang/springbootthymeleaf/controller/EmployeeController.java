package com.heyuanhang.springbootthymeleaf.controller;

import com.heyuanhang.springbootthymeleaf.dao.DepartmentDao;
import com.heyuanhang.springbootthymeleaf.dao.EmployeeDao;
import com.heyuanhang.springbootthymeleaf.entities.Department;
import com.heyuanhang.springbootthymeleaf.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.Collection;
import java.util.List;

/**
 * @Author 何远航
 * @Date: 2021/5/29 20:09
 * @Version 1.8
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String empsList(Model model) {
        //获取所有员工信息
        Collection<Employee> emps = employeeDao.getAll();
        model.addAttribute("emps", emps);
        return "list";
    }


    /**
     * 跳转到添加员工页面
     */

    @GetMapping("/emp")
    public String addEmp(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/addEmp";
    }

    /**
     * 添加员工
     *
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addemp(Employee employee) {
        //添加员工
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 跳转到修改员工页面
     */

    @GetMapping("/emp/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        //通过id获得员工信息
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);
        return "emp/update";
    }
    /**
     * 修改员工
     */

    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        //添加员工
      employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @ResponseBody
    @DeleteMapping("/emp/{id}")
    public Integer deleteEmp(@PathVariable("id") Integer id){
        //根据id进行删除
        employeeDao.delete(id);
        return 1;
    }

}
