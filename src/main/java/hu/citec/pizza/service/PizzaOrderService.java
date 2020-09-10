package hu.citec.pizza.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.citec.pizza.model.Pizza;
import hu.citec.pizza.model.User;
import hu.citec.pizza.repository.PizzaOrderRepository;

@Service
public class PizzaOrderService {
	
	@Autowired
	private PizzaOrderRepository pizzaRepo;
	
	public List<Pizza> getPizzaList(){
		return pizzaRepo.findAllPizza();
		
	}
	
	public List<User> getUserList(){
		return pizzaRepo.findAllUser();
	}

	public void placeOrder(HashMap<String, String> data) {
		
		
	}
	
}
