package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Terminal {
	
	public static void main(String[] args) {
	
		//Fabrica de entitymanager
		EntityManagerFactory fabrica =
				Persistence.createEntityManagerFactory("oracle"); 
		
		EntityManager em = fabrica.createEntityManager();
		
		em.close();
		fabrica.close();
	}
}
