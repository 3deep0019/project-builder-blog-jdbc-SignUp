  
package dao;

import model.User;

interface UserDaoInterface{
	
	int SignUp(User user);
	boolean LoginUser(User user);
}