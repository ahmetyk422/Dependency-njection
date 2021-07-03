package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.Dao;
import nLayeredDemo.entities.conretes.Drinks;

public class HibernateDao implements Dao {

	public void add(Drinks drink) {
		System.out.println("Added with hibernate : " + drink.getDrinkName());
	}

	public void update(Drinks drink) {

	}

	public void delete(Drinks drink) {

	}

	public Drinks getId(int id) {

		return null;
	}

	public List<Drinks> getAll() {

		return null;
	}

}
