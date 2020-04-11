package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AssetParam;
import com.sfc.es.entity.param.AssetSearchParam;
import com.sfc.es.entity.po.Asset;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AssetService {
    PageInfo<Asset> findPageInfo(AssetSearchParam param, Page page);
    List<Asset> findAll();
    List<Asset> find(AssetSearchParam param);
    Asset findById(Integer id);
    Asset insert(AssetParam param);
    Asset update(AssetParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}