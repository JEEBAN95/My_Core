package com.jk.daoFactory;

import com.jk.comp.CourseDBDAO;
import com.jk.comp.DAO;
import com.jk.comp.StudentDBDAO;
import com.jk.daoType.DaoType;

public class DBDAOFactory {

	public static DAO createDAO(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase(DaoType.STUDENT_TYPE)) {
			dao = new StudentDBDAO();
		} // if
		else if (type.equalsIgnoreCase(DaoType.COURSE_TYPE)) {
			dao = new CourseDBDAO();
		} // else
		return dao;
	}// createDAO
}
