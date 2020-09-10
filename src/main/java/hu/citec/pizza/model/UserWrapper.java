package hu.citec.pizza.model;

import java.util.ArrayList;
import java.util.List;

public class UserWrapper {
	private List<User> userList = new ArrayList<User>();

	public UserWrapper() {
		}

	public UserWrapper(List<User> userList) {
			this.userList = userList;
		}

	public void addUserToList(User user) {
		this.userList.add(user);
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "UserWrapper [userList=" + userList + "]";
	}
	
	
}
