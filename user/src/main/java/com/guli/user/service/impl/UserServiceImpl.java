package com.guli.user.service.impl;

import com.common.service.impl.ExampleSupportServiceImpl;
import com.guli.user.entity.User;
import com.guli.user.mapper.UserMapper;
import com.guli.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * User
 *
 * @author Runhu-Wu
 * @since 1.0
 */
@Service
public class UserServiceImpl extends ExampleSupportServiceImpl<User> implements UserService {

	public UserServiceImpl(UserMapper mapper) {
		super(mapper);
	}
}