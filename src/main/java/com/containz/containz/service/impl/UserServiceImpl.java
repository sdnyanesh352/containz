package com.containz.containz.service.impl;


import org.springframework.stereotype.Component;

import com.containz.containz.dto.ProfileCompletionDto;
import com.containz.containz.dto.UserDto;
import com.containz.containz.model.User;
import com.containz.containz.service.UserService;
/**
 * 
 */
@Component
public class UserServiceImpl implements UserService {

	@Override
	public UserDto signup(UserDto userDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateProfile(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto changePassword(UserDto userDto, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProfileCompletionDto getProfileCompletion(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User FindByusername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetLoginHistory() {
		// TODO Auto-generated method stub
		
	}

}
