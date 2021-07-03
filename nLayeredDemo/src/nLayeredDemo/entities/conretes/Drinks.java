package nLayeredDemo.entities.conretes;

import nLayeredDemo.entities.abstracts.Space;

public class Drinks implements Space {
	private String drinkName;
	private int id;
	private int categoryId;

	public Drinks() {
	}

	public Drinks(String drinkName, int id, int categoryId) {
		super();
		this.drinkName = drinkName;
		this.id = id;
		this.categoryId = categoryId;

	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
