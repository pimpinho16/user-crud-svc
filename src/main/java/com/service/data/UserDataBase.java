package com.service.data;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.service.entity.SvcUsrUser;
import com.service.pojo.User;
import com.service.repository.UserRepository;


@Service("UserDataBase")
public class UserDataBase implements IUserData{
	
	private UserRepository repo;
	private Logger log;
	
	public UserDataBase(UserRepository repo) {
		this.repo = repo;
		this.log = org.slf4j.LoggerFactory.getLogger("com.services");
	}

	@Override
	public Boolean createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Function which delete an user by Id
	 * @Return Boolean
	 */
	@Override
	public Boolean deleteUser(Integer id) {
		try {
			repo.deleteById(id);
			return true;
		}catch(Exception ex) {
			log.error("Error trying delete user",ex);
			
		}
		return false;
	}

	@Override
	public List<User> getUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Function which return all the users storaged in Table
	 * @Return List<User> 
	 */
	@Override
	public List<User> getUsers() {
		List<SvcUsrUser> lstDb = new ArrayList<>();
		List<User> lstUser = new ArrayList<>();
		lstDb = repo.findAll(); 
		if (!lstDb.isEmpty()) {
			lstUser = convertToUserType(lstDb);
		}
		
		return lstUser;
	}

	/**
	 * Function which return user by Id
	 * @Return User
	 */
	@Override
	public User getUser(Integer id) {
		try{
			SvcUsrUser db = repo.getById(id);
			User user = new User();
			user.setId(db.getUsrId());
			user.setAge(db.getUsrAge());
			user.setName(db.getUsrFirstName());
			user.setLastName(db.getUsrLastName());
			return user;
		}catch(Exception ex) {
			log.error("Error trying User",ex);
		}
		return null;
	}
	
	public List<User> convertToUserType(List<SvcUsrUser> listRequest){
		List<User> lstResult = new ArrayList<>();
		try {
			for(SvcUsrUser row : listRequest) {
				User user = new User();
				user.setId(row.getUsrId());
				user.setAge(row.getUsrAge());
				user.setName(row.getUsrFirstName());
				user.setLastName(row.getUsrLastName());
				lstResult.add(user);
			}
		}catch(Exception ex) {
			log.error("Error trying to get User List",ex);
		}
		
		return lstResult;
		
	}

}
