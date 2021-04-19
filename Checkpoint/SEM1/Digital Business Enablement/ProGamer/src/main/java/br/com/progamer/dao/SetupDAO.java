package br.com.progamer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.progamer.model.Setup;

public class SetupDAO {

	public void save(Setup setup) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProGamer-persistence-unit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
	}

}
