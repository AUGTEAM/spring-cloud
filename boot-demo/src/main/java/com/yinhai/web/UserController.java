package com.yinhai.web;

import com.yinhai.entity.UserEntity;
import com.yinhai.repository.UserRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Desc <p>Controller demo</p>
 * <p>Swagger demo</p>
 * Package com.yinhai.web
 * Created by 刘惠涛 on 2017/5/5.
 */
@RestController
@RequestMapping(value="/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<UserEntity> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递

        return userRepository.findAll();
    }

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "userEntity", value = "用户详细实体user", required = true, dataType = "UserEntity")
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUser(@ModelAttribute UserEntity userEntity) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        userRepository.save(userEntity);
        return "success";
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public UserEntity getUser(@PathVariable String id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return userRepository.findOne(Long.valueOf(id));
    }

    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "userEntity", value = "用户详细实体user", required = true, dataType = "UserEntity")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable String id, @ModelAttribute UserEntity userEntity) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        userEntity.setId(Long.valueOf(id));
        userRepository.save(userEntity);
        return "success";
    }

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        userRepository.delete(Long.valueOf(id));
        return "success";
    }
}
