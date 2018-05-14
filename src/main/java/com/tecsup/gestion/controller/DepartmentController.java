package com.tecsup.gestion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.services.DepartmentService;



public class DepartmentController {
	
private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/{department_id}")
	public ModelAndView home(@PathVariable int department_id, ModelMap model) {

		ModelAndView modelAndView = null;
		System.out.println("demo1");
		Department dep = new Department();
		try {
			dep = departmentService.find(department_id);
			System.out.println("demo");
			logger.info(dep.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelAndView = new ModelAndView("home", "command", dep);

		return modelAndView;
	}

}
