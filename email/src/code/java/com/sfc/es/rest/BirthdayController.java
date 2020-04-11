package com.sfc.es.rest;

import com.sfc.common.core.entity.vo.Result;
import com.sfc.common.core.exception.BaseException;
import com.sfc.common.core.exception.SystemErrorType;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.BirthdayParam;
import com.sfc.es.entity.param.BirthdaySearchParam;
import com.sfc.es.entity.po.Birthday;
import com.sfc.es.entity.vo.BirthdayVo;
import com.sfc.es.service.BirthdayService;
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
@RequestMapping("/birthday")
public class BirthdayController {
    @Autowired
    private BirthdayService birthdayService;

    @GetMapping("/get/page")
    @ApiOperation(value = "分页查询", notes = "分页查询")
    public Result<PageInfo<Birthday>> list(@Valid BirthdaySearchParam param, Page page) {
        PageInfo<Birthday> pageInfo = birthdayService.findPageInfo(param, page);
        return Result.success(BeanUtil.copyPageInfo(pageInfo, Birthday.class));
    }

    @GetMapping("/get/all")
    @ApiOperation(value = "查询所有", notes = "查询所有")
    public Result<List<Birthday>> all() {
        List<Birthday> pageInfo = birthdayService.findAll();
        return Result.success(BeanUtil.copyList(pageInfo, Birthday.class));
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "通过id获取", notes = "通过id获取")
    public Result<Birthday> get(@PathVariable("id") Integer id) {
        Birthday birthday = birthdayService.findById(id);
        return birthday != null ? Result.success(BeanUtil.copyObject(birthday, Birthday.class)) : Result.fail(SystemErrorType.FIND_ERROR);
    }

    @PutMapping("/update")
    @ApiOperation(value = "编辑", notes = "编辑")
    public Result edit(@RequestBody @Valid BirthdayParam param) {
        Birthday result = birthdayService.update(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.EDIT_ERROR);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加", notes = "添加")
    public Result add(@RequestBody @Valid BirthdayParam param) {
        Birthday result = birthdayService.insert(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.ADD_ERROR);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public Result delete(@PathVariable("id") Integer id) {
        int result = birthdayService.deleteById(id);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.DELETE_ERROR);
    }

    @DeleteMapping(value = "/delete/batch")
    @ApiOperation(value = "批量删除", notes = "批量删除")
    public Result deleteBatch(@RequestBody Integer[] ids) {
        birthdayService.deleteBatch(ids);
        return Result.success();
    }
}
