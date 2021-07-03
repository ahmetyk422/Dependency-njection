package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.DrinksService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.Dao;
import nLayeredDemo.entities.conretes.Drinks;

public class DrinksManager implements DrinksService {

	private Dao drinksdao;
	private LoggerService loggerService;

	public DrinksManager(Dao drinksdao, LoggerService loggerService) {
		super();
		this.drinksdao = drinksdao;
		this.loggerService = loggerService;
	}

	public void add(Drinks drink) {
		if (drink.getCategoryId() == 1) {
			System.out.println("No beverages are accepted in category ");
			return;
		}
		this.drinksdao.add(drink);
		this.loggerService.logTo("Drinks added" + drink.getDrinkName());
	}

	public List<Drinks> getAll() {

		return null;
	}

}
