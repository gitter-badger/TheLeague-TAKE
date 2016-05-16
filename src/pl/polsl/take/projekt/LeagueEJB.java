package pl.polsl.take.projekt;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class LeagueEJB {
	
	@PersistenceContext(name="league")
	EntityManager manager;

	
	public void create(Team car) {
		System.out.println("Creating car!");
		manager.persist(car);
	}

	public void delete(int idc) {
		Team car = manager.find(Team.class, idc);
		manager.remove(car);
	}

	public List<Team> findByMake(String make) {
		Query q = manager.createQuery("select c from Car c where c.make like :make");
		q.setParameter("make", make);
		@SuppressWarnings("unchecked")
		List<Team> lista =q.getResultList();
		return lista;
	}

	public Team find(int idc) {
		return manager.find(Team.class, idc);
	}

	public List<Team> get() {
		Query q = manager.createQuery("select c from Car c");
		@SuppressWarnings("unchecked")
		List<Team> list = q.getResultList();
		return list;
	}

	public void update(Team car) {
		car = manager.merge(car);
	}

	
}
