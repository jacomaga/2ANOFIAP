package br.com.fiap.jpa.api.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Refresh {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = ef.createEntityManager();
		
		int look = (int) Math.random();
		
		
		
		em.close();
		ef.close();
	}
}
