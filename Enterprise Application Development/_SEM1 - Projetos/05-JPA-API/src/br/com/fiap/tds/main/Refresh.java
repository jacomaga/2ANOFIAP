package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Filme;

public class Refresh {

	//Atualiza o objeto com os valores do banco
	public static void main(String[] args) {
		//Obter a fabrica e o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o filme de código 1
		Filme filme = em.find(Filme.class, 1);
		
		//Exibir o nome do filme
		System.out.println(filme.getNome());
		
		//Alterar o nome do filme no objeto (setNome)
		filme.setNome("Justice League");
		
		//Exibir o nome do filme
		System.out.println(filme.getNome());
		
		//Refresh
		em.refresh(filme);
		
		//Exibir o nome do filme
		System.out.println(filme.getNome());
		
		//Fechar
		em.close();
		fabrica.close();
	}
	
}
