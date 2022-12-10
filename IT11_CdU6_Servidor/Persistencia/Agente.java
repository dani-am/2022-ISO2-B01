package Diagrama_de_clases_CdU6.Persistencia;

public class Agente {

	protected Agente miinstancia = null;
	protected Connection mBD;
	private String Driver = com.mysql.cj.jdbc.Driver;

	private Agente() {
		// TODO - implement Agente.Agente
		throw new UnsupportedOperationException();
	}

	public Agente getAgente() {
		// TODO - implement Agente.getAgente
		throw new UnsupportedOperationException();
	}

	public void conectar() {
		// TODO - implement Agente.conectar
		throw new UnsupportedOperationException();
	}

	public void desconectar() {
		// TODO - implement Agente.desconectar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public int insert(string SQL) {
		// TODO - implement Agente.insert
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public int delete(string SQL) {
		// TODO - implement Agente.delete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public int update(string SQL) {
		// TODO - implement Agente.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */
	public Vector<Vector<Object>> select(string SQL) {
		// TODO - implement Agente.select
		throw new UnsupportedOperationException();
	}

}