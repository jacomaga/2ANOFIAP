package br.com.progamer.bean;

import javax.annotation.ManagedBean;

import br.com.progamer.dao.SetupDAO;
import br.com.progamer.model.Setup;

@ManagedBean
public class SetupBean {
	
	private Setup setup = new Setup();
	
	public void save() {
		new SetupDAO().save(this.setup);
	}

	public Setup getsetup() {
		return setup;
	}

	public void setsetup(Setup setup) {
		this.setup = setup;
	}	
	
}
