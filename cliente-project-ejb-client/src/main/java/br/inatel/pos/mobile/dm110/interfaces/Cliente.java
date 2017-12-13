package br.inatel.pos.mobile.dm110.interfaces;

public interface Cliente {
	
	void addNewCliente(String clienteName, String clienteEmail);

	String[] listClienteNames();

}
