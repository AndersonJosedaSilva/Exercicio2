package br.edu.univas.si8.ta.hello.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.hello.ejb.entities.Client;


@Stateless
public class ClientDAO {
	@PersistenceContext(unitName = "Client")
	private EntityManager em;

	public void insert(Client client) {
		em.persist(client);
	}

	public List<Client> listAll() {
		return em.createQuery("from clients p", Client.class).getResultList();
	}

}
