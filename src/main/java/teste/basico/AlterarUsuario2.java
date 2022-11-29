package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy1");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario user = em.find(Usuario.class, 2);
		
		em.detach(user);
		
		user.setNome("Jose");
		
		em.merge(user);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
