package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public void setStuentService(StudentService studentService)
	{
		this.studentService = studentService;
	}

	@RequestMapping(value="insert", method=RequestMethod.GET)
	public String insertPage()
	{
		
		return "insert";
	}
	
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public String insert(HttpServletRequest request)
	{
		
		studentService.insert(request);
		request.setAttribute("msg", "Record Inserted");
		return "insert";
	}
	
	
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String updatePage()
	{
		
		return "update";
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String update(HttpServletRequest request)
	{
		studentService.update(request);
		request.setAttribute("msg", "Record Updated");
		return "update";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String deletePage()
	{
		
		return "delete";
	}
	@RequestMapping(value="delete")
	public String delete(HttpServletRequest request)
	{
		
		studentService.delete(request);
		request.setAttribute("msg", "Record Deleted");
		return "delete";
	}
	
	@RequestMapping(value="display", method= RequestMethod.GET)
	public String displayPage(HttpServletRequest request)
	{
		
		List<Student> li = studentService.getAll();
		
		request.setAttribute("list", li);
		return "display";
	}
	
	
}
