package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy1");
		EntityManager em = emf.createEntityManager();
		
		Usuario user = em.find(Usuario.class, 2);
		System.out.println(user.getNome());
		
		em.close();
		emf.close();
		
	}
	
}
