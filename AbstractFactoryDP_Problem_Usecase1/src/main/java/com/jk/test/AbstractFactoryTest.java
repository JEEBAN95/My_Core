package com.jk.test;

import com.jk.comp.DAO;
import com.jk.daoFactory.DBDAOFactory;
import com.jk.daoFactory.ExcelDAOFactory;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		DAO dao = null;
		dao = DBDAOFactory.createDAO("student");
		dao.insert();
		dao=ExcelDAOFactory.createDAO("course");
		dao.insert();
		System.out.println("-------------------------------------------------------------");
		dao = DBDAOFactory.createDAO("student");
		dao.insert();
		dao=ExcelDAOFactory.createDAO("course");
		dao.insert();
	}
}
