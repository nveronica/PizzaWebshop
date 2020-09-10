package hu.citec.pizza.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaWrapper {
	private List<Pizza> pizzaList = new ArrayList<Pizza>();

	public PizzaWrapper() {
	}

	public PizzaWrapper(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}

	public void addPizzaToList(Pizza pizza) {
		this.pizzaList.add(pizza);
	}

	public List<Pizza> getPizzaList() {
		return pizzaList;
	}

	public void setPizzaList(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}

	@Override
	public String toString() {
		return "PizzaWrapper [pizzaList=" + pizzaList + "]";
	}
	
	
}
