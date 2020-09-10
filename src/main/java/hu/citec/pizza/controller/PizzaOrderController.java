package hu.citec.pizza.controller;

import hu.citec.pizza.model.Pizza;
import hu.citec.pizza.model.PizzaWrapper;
import hu.citec.pizza.model.User;
import hu.citec.pizza.model.UserWrapper;
import hu.citec.pizza.service.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class PizzaOrderController {
	@Autowired
	private PizzaOrderService pizzaService;
	
	@GetMapping("/")
	public String pizzaOrderForms(Model model) {
		PizzaWrapper wrapPizzaAndOrder = new PizzaWrapper();
		List<Pizza> pizzaList = pizzaService.getPizzaList();
		
		for (int i = 0; i < pizzaList.size(); i++) {
			wrapPizzaAndOrder.addPizzaToList(pizzaList.get(i));
	    }
		System.out.println(wrapPizzaAndOrder.toString());
		model.addAttribute("pizzaList", wrapPizzaAndOrder);
	
		return "index";
	}
	
	@PostMapping("/")
	public String pizzaOrderSubmit(@ModelAttribute PizzaWrapper wrapPizzaAndOrder, Model model) {
		System.out.println(wrapPizzaAndOrder);
		return "place-order";
	}
	@GetMapping("/place-order")
	public String userDataSubmit(Model model) {
		UserWrapper userWrapper = new UserWrapper();
		List<User>userList = pizzaService.getUserList();
		for (int i = 0; i <= userList.size(); i++) {
			userWrapper.addUserToList(userList.get(i));
	    }
		System.out.println(userList);
		model.addAttribute("userList", userWrapper);
		
		return "/place-order";
	}
	@PostMapping("/place-order")
	public String submit() {
		return null;
	}
}
