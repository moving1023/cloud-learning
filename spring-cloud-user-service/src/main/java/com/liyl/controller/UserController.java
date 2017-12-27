package com.liyl.controller;

import com.google.common.collect.Lists;
import com.liyl.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 李毅霖.
 * @Description:
 * @Date: 2017/12/27
 * @Modified by .
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@ApiOperation(value = "获取用户列表", notes = "可以根据此来获取全部用户信息")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<User> list() {
		return Lists.newArrayList(new User());
	}

	@ApiOperation(value = "根据ID获取用户信息", notes = "用于查看用户的详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable long id) {
		return new User();
	}
}
