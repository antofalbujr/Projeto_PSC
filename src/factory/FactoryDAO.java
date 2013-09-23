/**
 * 
 */
package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import daoImpl.FuncionarioDAOImpl;

/**
 * @author Antônio
 *
 */
public class FactoryDAO {

	/**
	 * 
	 */	
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static{
		factory = Persistence.createEntityManagerFactory("Projeto_PSC");
		if(entityManager == null || !entityManager.isOpen())
			entityManager = factory.createEntityManager();
	}
	
	public static FuncionarioDAOImpl getFuncionarioDAOImpl()
	{
		FuncionarioDAOImpl funcionarioDAOImpl = new FuncionarioDAOImpl();
		funcionarioDAOImpl.setManager(entityManager);
		return funcionarioDAOImpl;
	}
	

}
