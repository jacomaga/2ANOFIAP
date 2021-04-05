package br.com.fiap.jpa.api.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.api.entity.Filme;
import br.com.fiap.jpa.api.entity.Genero;

public class Cadastro {
	public static void main(String[] args) {
		
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = ef.createEntityManager();
	
		Filme filme = new Filme("Piratas do Caribe", new GregorianCalendar(1980, Calendar.JANUARY, 7)
				, Genero.AVENTURA, "Um pirata destemido e engraçado desbrava os sete-mares em busca de mais uma aventura!", true);
		
		em.persist(filme);
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
		em.close();
		ef.close();
	}
}
