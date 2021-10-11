package com.service.process;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.service.data.IUserData;
import com.service.pojo.User;

@Service("UserProcess")
public class UserProcess implements IUserProcess {
	private IUserData data;
	private Logger log;
	
	
	public UserProcess(@Qualifier("BeanDataUser") IUserData data) {
		this.data = data;
		this.log = LoggerFactory.getLogger("com.services");
	}
	
	public List<User> getUsers(){
		List<User> lstUser = new ArrayList<>();
		try {
			lstUser = data.getUsers();
		}catch(Exception ex) {
			log.error("Error trying to get Users",ex);
			
		}
		return lstUser;
	}
	
}
