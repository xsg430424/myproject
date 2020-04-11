package com.sfc.es.rest;

import com.sfc.common.core.entity.vo.Result;
import com.sfc.common.core.exception.BaseException;
import com.sfc.common.core.exception.SystemErrorType;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.UserParam;
import com.sfc.es.entity.param.UserSearchParam;
import com.sfc.es.entity.po.User;
import com.sfc.es.entity.vo.UserVo;
import com.sfc.es.service.UserService;
import com.sfc.es.util.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Api(tags = "接口(肖水庚)")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get/page")
    @ApiOperation(value = "分页查询", notes = "分页查询")
    public Result<PageInfo<User>> list(@Valid UserSearchParam param, Page page) {
        PageInfo<User> pageInfo = userService.findPageInfo(param, page);
        return Result.success(BeanUtil.copyPageInfo(pageInfo, User.class));
    }

    @GetMapping("/get/all")
    @ApiOperation(value = "查询所有", notes = "查询所有")
    public Result<List<User>> all() {
        List<User> pageInfo = userService.findAll();
        return Result.success(BeanUtil.copyList(pageInfo, User.class));
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "通过id获取", notes = "通过id获取")
    public Result<User> get(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        return user != null ? Result.success(BeanUtil.copyObject(user, User.class)) : Result.fail(SystemErrorType.FIND_ERROR);
    }

    @PutMapping("/update")
    @ApiOperation(value = "编辑", notes = "编辑")
    public Result edit(@RequestBody @Valid UserParam param) {
        User result = userService.update(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.EDIT_ERROR);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加", notes = "添加")
    public Result add(@RequestBody @Valid UserParam param) {
        User result = userService.insert(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.ADD_ERROR);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public Result delete(@PathVariable("id") Integer id) {
        int result = userService.deleteById(id);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.DELETE_ERROR);
    }

    @DeleteMapping(value = "/delete/batch")
    @ApiOperation(value = "批量删除", notes = "批量删除")
    public Result deleteBatch(@RequestBody Integer[] ids) {
        userService.deleteBatch(ids);
        return Result.success();
    }
}
