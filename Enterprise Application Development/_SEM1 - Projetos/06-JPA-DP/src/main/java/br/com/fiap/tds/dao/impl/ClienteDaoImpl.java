package main.java.br.com.fiap.tds.dao.impl;

import br.com.fiap.tds.dao.ClienteDao;
import br.com.fiap.tds.entity.Cliente;


import javax.persistence.EntityManager;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente, Integer> implements ClienteDao {

	public ClienteDaoImpl(EntityManager em) {
		super(em);
	}

}