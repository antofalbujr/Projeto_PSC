/**
 * 
 */
package dao;

import java.util.List;

/**
 * @author Ant�nio
 * @param <T>
 *
 */
public interface IGenericDAO<T> {

void inserir(T entidade);
	
	void atualizar(T entidade);
	
	void remover(long id);
	
	List<T> consultarTodos();
	
	T consultarPorId(long id);
	
}
