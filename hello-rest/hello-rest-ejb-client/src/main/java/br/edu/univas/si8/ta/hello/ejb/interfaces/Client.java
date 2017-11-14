package br.edu.univas.si8.ta.hello.ejb.interfaces;

public interface Client {
	
	void createNewClient(String clientName, String clientEmail);

	String[] listClientNames();
	String[] listClientEmail();

}
