package com.jk.daoFactory;

import com.jk.comp.DAO;

public interface DAOFactory {	
	public DAO createDAO(String type);
}
