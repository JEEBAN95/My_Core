package com.jk.daoFactory;

public class DAOFactoryCreater {

	public static DAOFactory factoryBuilder(String storeType) {
		DAOFactory factory = null;
		if (storeType.equalsIgnoreCase("db")) {
			factory = new DBDAOFactory();
		} // if
		else if (storeType.equalsIgnoreCase("excel")) {
			factory = new ExcelDAOFactory();
		} // else if
		return factory;
	}// factoryBuilder
}
