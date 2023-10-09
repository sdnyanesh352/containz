package com.containz.containz.model.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.containz.containz.dto.UserDto;
import com.containz.containz.dto.response.Response;
import com.containz.containz.model.request.UserSignupRequest;
import com.containz.containz.service.UserService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * Handles the incoming POST API "/v1/user/signup"
     *
     * @param userSignupRequest
     * @return
     * @throws Exception 
     */
    @PostMapping("/signup")
    public Response signup(@RequestBody UserSignupRequest userSignupRequest) throws Exception {
        return Response.ok().setPayload(registerUser(userSignupRequest, false));
    }

    /**
     * Register a new user in the database
     *
     * @param userSignupRequest
     * @return
     * @throws Exception 
     */
    private UserDto registerUser(UserSignupRequest userSignupRequest, boolean isAdmin) throws Exception {
        UserDto userDto = new UserDto()
                .setEmail(userSignupRequest.getEmail())
                .setPassword(userSignupRequest.getPassword())
                .setFirstName(userSignupRequest.getFirstName())
                .setLastName(userSignupRequest.getLastName())
                .setMobileNumber(userSignupRequest.getMobileNumber())
                .setRef(userSignupRequest.getRef())
                .setAdmin(isAdmin);

        return userService.signup(userDto);
    }
}
