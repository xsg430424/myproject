package com.sfc.es.rest;

import com.sfc.common.core.entity.vo.Result;
import com.sfc.common.core.exception.BaseException;
import com.sfc.common.core.exception.SystemErrorType;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AssetParam;
import com.sfc.es.entity.param.AssetSearchParam;
import com.sfc.es.entity.po.Asset;
import com.sfc.es.entity.vo.AssetVo;
import com.sfc.es.service.AssetService;
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
@RequestMapping("/asset")
public class AssetController {
    @Autowired
    private AssetService assetService;

    @GetMapping("/get/page")
    @ApiOperation(value = "分页查询", notes = "分页查询")
    public Result<PageInfo<Asset>> list(@Valid AssetSearchParam param, Page page) {
        PageInfo<Asset> pageInfo = assetService.findPageInfo(param, page);
        return Result.success(BeanUtil.copyPageInfo(pageInfo, Asset.class));
    }

    @GetMapping("/get/all")
    @ApiOperation(value = "查询所有", notes = "查询所有")
    public Result<List<Asset>> all() {
        List<Asset> pageInfo = assetService.findAll();
        return Result.success(BeanUtil.copyList(pageInfo, Asset.class));
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "通过id获取", notes = "通过id获取")
    public Result<Asset> get(@PathVariable("id") Integer id) {
        Asset asset = assetService.findById(id);
        return asset != null ? Result.success(BeanUtil.copyObject(asset, Asset.class)) : Result.fail(SystemErrorType.FIND_ERROR);
    }

    @PutMapping("/update")
    @ApiOperation(value = "编辑", notes = "编辑")
    public Result edit(@RequestBody @Valid AssetParam param) {
        Asset result = assetService.update(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.EDIT_ERROR);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加", notes = "添加")
    public Result add(@RequestBody @Valid AssetParam param) {
        Asset result = assetService.insert(param);
        return result != null ? Result.success() : Result.fail(SystemErrorType.ADD_ERROR);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public Result delete(@PathVariable("id") Integer id) {
        int result = assetService.deleteById(id);
        return result > 0 ? Result.success() : Result.fail(SystemErrorType.DELETE_ERROR);
    }

    @DeleteMapping(value = "/delete/batch")
    @ApiOperation(value = "批量删除", notes = "批量删除")
    public Result deleteBatch(@RequestBody Integer[] ids) {
        assetService.deleteBatch(ids);
        return Result.success();
    }
}
