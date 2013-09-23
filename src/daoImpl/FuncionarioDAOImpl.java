package daoImpl;

import java.util.List;

import classes.Funcionario;

import dao.IFuncionarioDAO;

public class FuncionarioDAOImpl extends GenericDAOImpl<Funcionario> implements IFuncionarioDAO{

	public FuncionarioDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inserir(Funcionario entidade) {
		// TODO Auto-generated method stub
		this.getManager().getTransaction().begin();
		this.getManager().persist(entidade);
		this.getManager().getTransaction().commit();
	}

	@Override
	public void atualizar(Funcionario entidade) {
		// TODO Auto-generated method stub
		this.getManager().getTransaction().begin();
		this.getManager().merge(entidade);
		this.getManager().getTransaction().commit();
	}

	@Override
	public void remover(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Funcionario> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario consultarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
