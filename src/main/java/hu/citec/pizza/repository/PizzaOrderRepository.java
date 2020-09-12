package hu.citec.pizza.repository;

import hu.citec.pizza.model.Pizza;
import hu.citec.pizza.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzaOrderRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Pizza> findAllPizza() {
		String query ="SELECT * FROM pizza";
		List<Pizza> pizzaList= jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Pizza.class));
		return pizzaList;
	}
	
	public List<User> findAllUser(){
		String query = "SELECT user_id AS userId, name, email, phone_number AS phoneNumber, adress FROM user";
		List<User> userList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(User.class));;
		return userList;
	}
}
