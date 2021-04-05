package br.com.fiap.jpa.api.main;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.api.entity.Filme;
import br.com.fiap.jpa.api.entity.Genero;
import oracle.security.o3logon.a;

public class Atualizacao {

	public static void main(String[] args) {
		
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = ef.createEntityManager();
		
		Filme filme = new Filme(1, "Aventura", new GregorianCalendar(), Genero.ACAO, "Top", true);
		
		em.merge(filme);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		ef.close();
	}
}
