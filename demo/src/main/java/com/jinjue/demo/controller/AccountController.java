package com.jinjue.demo.controller;

import com.jinjue.demo.common.entity.Result;
import com.jinjue.demo.common.exception.SystemErrorType;
import com.jinjue.demo.common.utils.BeanUtil;
import com.jinjue.demo.common.utils.PageInfo;
import com.jinjue.demo.po.Account;
import com.jinjue.demo.service.AccountService;
import com.jinjue.demo.vo.request.AccountParam;
import com.jinjue.demo.vo.request.AccountSearchParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Api(tags = "帐号接口(肖水庚)")
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/get/page")
    @ApiOperation("分页查询")
    public Result<PageInfo<Account>> list(AccountSearchParam param) {
        PageInfo<Account> pageInfo = accountService.findPageInfo(param);
        return Result.success(BeanUtil.copyPageInfo(pageInfo, Account.class));
    }

    @GetMapping("/get/all")
    @ApiOperation(value = "查询所有", notes = "查询所有")
    public Result<List<Account>> all() {
        List<Account> pageInfo = accountService.findAll();
        return Result.success(BeanUtil.copyList(pageInfo, Account.class));
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "通过id获取", notes = "通过id获取")
    public Result<Account> get(@PathVariable("id") Integer id) {
        Account account = accountService.findById(id);
        return account != null ? Result.success(BeanUtil.copyObject(account, Account.class)) : Result.fail(SystemErrorType.FIND_ERROR);
    }

    @PutMapping("/update")
    @ApiOperation(value = "编辑", notes = "编辑")
    public Result edit(@RequestBody @Valid AccountParam param) {
        Account result = accountService.update(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.EDIT_ERROR);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加", notes = "添加")
    public Result add(@RequestBody @Valid AccountParam param) {
        Account result = accountService.insert(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.ADD_ERROR);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public Result delete(@PathVariable("id") Integer id) {
        int result = accountService.deleteById(id);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.DELETE_ERROR);
    }

    @DeleteMapping(value = "/delete/batch")
    @ApiOperation(value = "批量删除", notes = "批量删除")
    public Result deleteBatch(@RequestBody Integer[] ids) {
        accountService.deleteBatch(ids);
        return Result.success();
    }
}
