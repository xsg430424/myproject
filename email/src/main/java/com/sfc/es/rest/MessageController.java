package com.sfc.es.rest;

import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.MessageParam;
import com.sfc.es.entity.param.MessageSearchParam;
import com.sfc.es.entity.po.Message;
import com.sfc.es.entity.vo.Result;
import com.sfc.es.exception.SystemErrorType;
import com.sfc.es.service.MessageService;
import com.sfc.es.utils.BeanUtil;
import com.sfc.es.utils.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Des:
 * @Date: 2019/07/07
 * @Author: Gavin Shaw
 */
@Api(tags = "常用信息表接口(肖水庚)")
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/get/page")
    @ApiOperation(value = "分页查询常用信息表", notes = "分页查询常用信息表")
    public Result<PageInfo<Message>> list(@Valid MessageSearchParam param, Page page) {
        PageInfo<Message> pageInfo = messageService.findPageInfo(param, page);
        return Result.success(BeanUtil.copyPageInfo(pageInfo, Message.class));
    }

    @GetMapping("/get/all")
    @ApiOperation(value = "查询所有常用信息表", notes = "查询所有常用信息表")
    public Result<List<Message>> all() {
        List<Message> pageInfo = messageService.findAll();
        return Result.success(BeanUtil.copyList(pageInfo, Message.class));
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "通过id获取常用信息表", notes = "通过id获取常用信息表")
    public Result<Message> get(@PathVariable("id") Integer id) {
        Message message = messageService.findById(id);
        return message != null ? Result.success(BeanUtil.copyObject(message, Message.class)) : Result.fail(SystemErrorType.FIND_ERROR);
    }

    @PutMapping("/update")
    @ApiOperation(value = "编辑常用信息表", notes = "编辑常用信息表")
    public Result edit(@RequestBody @Valid MessageParam param) {
        int result = messageService.update(param);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.EDIT_ERROR);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加常用信息表", notes = "添加常用信息表")
    public Result add(@RequestBody @Valid MessageParam param) {
        int result = messageService.insert(param);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.ADD_ERROR);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除常用信息表", notes = "删除常用信息表")
    public Result delete(@PathVariable("id") Integer id) {
        int result = messageService.deleteById(id);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.DELETE_ERROR);
    }

    @DeleteMapping(value = "/delete/batch")
    @ApiOperation(value = "批量删除常用信息表", notes = "批量删除常用信息表")
    public Result deleteBatch(@RequestBody Integer[] ids) {
        messageService.deleteBatch(ids);
        return Result.success();
    }


}
