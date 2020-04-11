package com.sfc.es.dao;

import com.sfc.es.entity.po.Asset;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface AssetMapper {
    List<Asset> findPageInfo(Asset asset);
    Asset findById(Integer id);
    int insert(Asset asset);
    int insertBatch(List<Asset> list);
    int update(Asset asset);
    int delete(Asset asset);
}