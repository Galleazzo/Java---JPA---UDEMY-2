package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy1");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		List<Usuario> usuarios = query.getResultList();
		
		usuarios.forEach(us ->{
			System.out.println(us.getEmail());
		});
		
		
		em.close();
		emf.close();
		
	}
	
	
}
