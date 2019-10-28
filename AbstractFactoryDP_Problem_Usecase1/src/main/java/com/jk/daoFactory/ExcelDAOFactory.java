package com.jk.daoFactory;

import com.jk.comp.CourseExcelDAO;
import com.jk.comp.DAO;
import com.jk.comp.StudentDBDAO;
import com.jk.comp.StudentExcelDAO;
import com.jk.daoType.DaoType;

public class ExcelDAOFactory {
	
	public static DAO createDAO(String type) {
		DAO dao = null;
		
		if(type.equalsIgnoreCase(DaoType.STUDENT_TYPE)) {
			dao = new StudentExcelDAO();
		}
		else if(type.equalsIgnoreCase(DaoType.COURSE_TYPE)) {
			dao = new CourseExcelDAO();
		}
		return dao;	
	}
}
