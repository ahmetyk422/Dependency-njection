package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.conretes.Drinks;

public interface Dao {
	void add(Drinks drink);

	void update(Drinks drink);

	void delete(Drinks drink);

	Drinks getId(int id);

	List<Drinks> getAll();
}
