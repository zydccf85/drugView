package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.EmployeeDao;
import entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Resource
	private EmployeeDao ed;
	@RequestMapping("/getEmployee.do")
	@ResponseBody
	public List<Employee> getEmployee(){
		return ed.getList(null);
	}
}
