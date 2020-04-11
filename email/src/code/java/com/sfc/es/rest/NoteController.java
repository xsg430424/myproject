package com.sfc.es.rest;

import com.sfc.common.core.entity.vo.Result;
import com.sfc.common.core.exception.BaseException;
import com.sfc.common.core.exception.SystemErrorType;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.NoteParam;
import com.sfc.es.entity.param.NoteSearchParam;
import com.sfc.es.entity.po.Note;
import com.sfc.es.entity.vo.NoteVo;
import com.sfc.es.service.NoteService;
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
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/get/page")
    @ApiOperation(value = "分页查询", notes = "分页查询")
    public Result<PageInfo<Note>> list(@Valid NoteSearchParam param, Page page) {
        PageInfo<Note> pageInfo = noteService.findPageInfo(param, page);
        return Result.success(BeanUtil.copyPageInfo(pageInfo, Note.class));
    }

    @GetMapping("/get/all")
    @ApiOperation(value = "查询所有", notes = "查询所有")
    public Result<List<Note>> all() {
        List<Note> pageInfo = noteService.findAll();
        return Result.success(BeanUtil.copyList(pageInfo, Note.class));
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "通过id获取", notes = "通过id获取")
    public Result<Note> get(@PathVariable("id") Integer id) {
        Note note = noteService.findById(id);
        return note != null ? Result.success(BeanUtil.copyObject(note, Note.class)) : Result.fail(SystemErrorType.FIND_ERROR);
    }

    @PutMapping("/update")
    @ApiOperation(value = "编辑", notes = "编辑")
    public Result edit(@RequestBody @Valid NoteParam param) {
        Note result = noteService.update(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.EDIT_ERROR);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加", notes = "添加")
    public Result add(@RequestBody @Valid NoteParam param) {
        Note result = noteService.insert(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.ADD_ERROR);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public Result delete(@PathVariable("id") Integer id) {
        int result = noteService.deleteById(id);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.DELETE_ERROR);
    }

    @DeleteMapping(value = "/delete/batch")
    @ApiOperation(value = "批量删除", notes = "批量删除")
    public Result deleteBatch(@RequestBody Integer[] ids) {
        noteService.deleteBatch(ids);
        return Result.success();
    }
}
