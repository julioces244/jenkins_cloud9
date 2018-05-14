package com.tecsup.gestion.services;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;


public interface DepartmentService {
	
	Department find(int department_id) throws DAOException, EmptyResultException;
}
