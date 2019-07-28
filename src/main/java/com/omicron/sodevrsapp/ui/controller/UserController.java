package com.omicron.sodevrsapp.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.omicron.sodevrsapp.service.UserService;
import com.omicron.sodevrsapp.shared.dto.ProUserDto;
import com.omicron.sodevrsapp.shared.dto.UserDto;
import com.omicron.sodevrsapp.ui.model.request.ProUserRequestModel;
import com.omicron.sodevrsapp.ui.model.request.UserRequestModel;
import com.omicron.sodevrsapp.ui.model.response.ProUserResponseModel;
import com.omicron.sodevrsapp.ui.model.response.UserResponseModel;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(
			path = "/{userId}",
			produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	)
	public UserResponseModel getUser(@PathVariable String userId) {

		UserDto userDto = userService.getUserByUserId(userId);
		UserResponseModel userResponseModel = (userDto instanceof ProUserDto)? new ProUserResponseModel():new UserResponseModel();
		BeanUtils.copyProperties(userDto,userResponseModel);
		return userResponseModel;
	}
	
	@PostMapping(
			path = "/create",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
	)
	public UserResponseModel createUser(@RequestBody UserRequestModel userRequestModel) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequestModel, userDto);
		
		UserDto createdUser = userService.createUser(userDto);
		
		UserResponseModel userResponseModel = new UserResponseModel();
		BeanUtils.copyProperties(createdUser, userResponseModel);
		return userResponseModel;
	}

	@PostMapping(
			path = "/create/pro",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
	)
	public ProUserResponseModel createProUser(@RequestBody ProUserRequestModel proUserRequestModel) {
		ProUserDto proUserDto = new ProUserDto();
		BeanUtils.copyProperties(proUserRequestModel, proUserDto);
		
		ProUserDto createdUser = userService.createUser(proUserDto);
		
		ProUserResponseModel proUserResponseModel = new ProUserResponseModel();
		BeanUtils.copyProperties(createdUser, proUserResponseModel);
		return proUserResponseModel;
	}

	@PutMapping(
			path = "/update/{userId}",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
	)
	public UserResponseModel updateUser(@PathVariable String userId,@RequestBody UserRequestModel userRequestModel){
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequestModel, userDto);

		UserDto updatedUser = userService.updateUser(userId,userDto);

		UserResponseModel userResponseModel = new UserResponseModel();
		BeanUtils.copyProperties(updatedUser, userResponseModel);
		return userResponseModel;
	}

	@PutMapping(
			path = "/update/pro/{userId}",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
	)
	public ProUserResponseModel updateProUser(@PathVariable String userId,@RequestBody ProUserRequestModel proUserRequestModel){
		ProUserDto proUserDto = new ProUserDto();
		BeanUtils.copyProperties(proUserRequestModel, proUserDto);

		ProUserDto updatedUser = userService.updateUser(userId,proUserDto);

		ProUserResponseModel proUserResponseModel = new ProUserResponseModel();
		BeanUtils.copyProperties(updatedUser, proUserResponseModel);
		return proUserResponseModel;
	}
}
