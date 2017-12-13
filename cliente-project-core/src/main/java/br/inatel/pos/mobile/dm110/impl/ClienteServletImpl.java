package br.inatel.pos.mobile.dm110.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.mobile.dm110.api.ClienteService;
import br.inatel.pos.mobile.dm110.interfaces.ClienteRemote;

@RequestScoped
public class ClienteServletImpl implements ClienteService {
	
	@EJB(lookup="java:app/cliente-project-ejb-1.0.0-SNAPSHOT/ClienteBean!br.inatel.pos.mobile.dm110.interfaces.ClienteRemote")
	private ClienteRemote clienteBean;

	@Override
	public void addNewCliente(String clienteName, String clienteEmail) {
		// TODO Auto-generated method stub
		clienteBean.addNewCliente(clienteName, clienteEmail);
	}

	@Override
	public String[] listClienteNames() {
		return clienteBean.listClienteNames();
	}
	
}
