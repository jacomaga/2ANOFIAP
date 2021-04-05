package br.com.fiap.jpa.api.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.api.entity.Filme;
import br.com.fiap.jpa.api.entity.Genero;

public class Pesquisa {

	public static void main(String[] args) {
	
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = ef.createEntityManager();
	
		Filme filme = em.find(Filme.class, 1);
		
		if (filme != null)
			System.out.println(filme.getNome());
		else
			System.out.println("FIlme não encontrado");
		
		em.close();
		ef.close();
	}
}
