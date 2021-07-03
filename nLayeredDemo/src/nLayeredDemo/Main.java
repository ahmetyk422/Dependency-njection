package nLayeredDemo;

import nLayeredDemo.business.abstracts.DrinksService;
import nLayeredDemo.business.concretes.DrinksManager;
import nLayeredDemo.core.LogManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.HibernateDao;
import nLayeredDemo.entities.conretes.Drinks;

public class Main {

	public static void main(String[] args) {
		DrinksService drinkService = new DrinksManager(new HibernateDao(), new LogManagerAdaptor());
		Drinks drink = new Drinks("coffee", 3, 2);
		drinkService.add(drink);

	}

}
