package com.dicksoy.provider.serviceImpl;

import com.dicksoy.api.service.UserService;

public class UserServiceImpl implements UserService {

	public String sayHello(String name) {
		return "hello : " + name;
	}

}
