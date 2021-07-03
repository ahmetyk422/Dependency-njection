package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.conretes.Drinks;

public interface DrinksService {
	void add(Drinks drink);

	List<Drinks> getAll();
}
