package com.tecsup.gestion.dao;
import static org.junit.Assert.fail;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration

public class DepartmentDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOTest.class);

	@Autowired
	private DepartmentDAO departmentDAO;


	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");
	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}
	
	
//	@Test
//	public void testCreateDepartment() {
//
//		String name = "videojuegos";
//		logger.info(name);
//		String description = "dep de videojuegos";
//		String city = "Lima";
//		
//
//		try {
//			//
//			departmentDAO.create(name, description, city);
//
//			//
//			Department dep = departmentDAO.findDepartmentByName(name);
//
//			
//			Assert.assertEquals(description, dep.getDescription());
//			Assert.assertEquals(city, dep.getCity());
//			
//
//		} catch (DAOException e) {
//			fail(e.getMessage());
//		} catch (EmptyResultException e) {
//			fail(e.getMessage());
//		}
//
//	}
	
	
	@Test
	public void testFindDepartmentByName() {

		try {
			//
			Department dep = departmentDAO.findDepartmentByName("departamento memes");

//			Assert.assertEquals("123456", dep.getDescription());
//			Assert.assertEquals("Jaime", dep.getCity());
//			
			logger.info(dep.toString());
		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}
	
	
//	@Test
//	public void testUpdateEmployee() {
//		String name = "videojuegos";
////		String PWD = "123";
////		String FIRSTNAME = "Jaime";
////		String LASTNAME = "Gomez";
////		int SALARY = 3000;
////		int DEPT_ID = 14;
//		
//		String description = "un nuevo departamento";
//		String city = "Lima-SantaAnita";
//		
//		
//		try {
//			//
////			employeeDAO.create(LOGIN, PWD, FIRSTNAME, LASTNAME, SALARY, DEPT_ID);
//			//
//			departmentDAO.update(name, description, city);
//			//
//			Department dep = departmentDAO.findDepartmentByName(name);
//
//			Assert.assertEquals(description, dep.getDescription());
//			Assert.assertEquals(city, dep.getCity());
//			
//
//		} catch (DAOException e) {
//			fail(e.getMessage());
//		} catch (EmptyResultException e) {
//			fail(e.getMessage());
//		}
//	}
	
	
	
	
//	@Test
//	public void testDeleteDepartment() {
//
//		String name = "videojuegos";
//		String PWD = "123";
//		String FIRSTNAME = "Juan";
//		
//
////		try {
////			//
////			employeeDAO.create(LOGIN, PWD, FIRSTNAME, LASTNAME, SALARY, DEPT_ID);
////
////		} catch (DAOException e) {
////			fail(e.getMessage());
////		}
//		try {
//
//			departmentDAO.delete(name);
//
//			departmentDAO.findDepartmentByName(name);
//
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (EmptyResultException e) {
//			// Departamento borrado 
//			return;
//		}
//	}
	
	@After
	public void after() {
		logger.info("Despues de cada metodo");
	}
	
	@AfterClass
	public static void afterClass() {
		logger.info("Despues de todos los metodos");
	}


}