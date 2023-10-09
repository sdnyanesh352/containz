package com.containz.containz.service;

import com.containz.containz.dto.ProfileCompletionDto;
import com.containz.containz.dto.UserDto;
import com.containz.containz.model.User;

/**
 * 
 */
public interface UserService {
    /**
     * Register a new user
     *
     * @param userDto
     * @return
     * @throws Exception 
     */
    UserDto signup(UserDto userDto) throws Exception;

    /**
     * Search an existing user
     *
     * @param email
     * @return
     */
    UserDto findUserByEmail(String email);

    /**
     * Update profile of the user
     *
     * @param userDto
     * @return
     */
    UserDto updateProfile(UserDto userDto);

    /**
     * Update password
     *
     * @param newPassword
     * @return
     */
    UserDto changePassword(UserDto userDto, String newPassword);
    
    ProfileCompletionDto getProfileCompletion(UserDto userDto);

	User FindByusername(String username);
	
	void SetLoginHistory();
}
