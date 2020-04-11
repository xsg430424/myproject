package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.AssetMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.AssetParam;
import com.sfc.es.entity.param.AssetSearchParam;
import com.sfc.es.entity.po.Asset;
import com.sfc.es.service.AssetService;
import com.sfc.es.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Service
@Slf4j
public class AssetServiceImpl implements AssetService {
	@Autowired
	private AssetMapper assetMapper;

	@Override
	public PageInfo<Asset> findPageInfo(AssetSearchParam param, Page page) {
		Asset asset = BeanUtil.copyObject(param, Asset.class);
		asset.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(assetMapper.findPageInfo(asset));
	}

	@Override
	public List<Asset> findAll() {
		List<Asset> list = assetMapper.findPageInfo(new Asset());
		return list;
	}

	@Override
	public List<Asset> find(AssetSearchParam param) {
		Asset asset = BeanUtil.copyObject(param, Asset.class);
		List<Asset> list = assetMapper.findPageInfo(asset);
		return list;
	}

	@Override
	public Asset findById(Integer id) {
		return assetMapper.findById(id);
	}

	@Override
	public Asset insert(AssetParam param){
		Asset asset = BeanUtil.copyObject(param, Asset.class);
		asset.setCreateBy(UserContextHolder.getInstance().getUserId());
		asset.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = assetMapper.insert(asset);
        if(count == 0){
            return null;
        }
        return asset;
	}

    @Override
	public Asset update(AssetParam param) {
		Asset asset = BeanUtil.copyObject(param, Asset.class);
		asset.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = assetMapper.update(asset);
		if(count == 0){
            return null;
        }
        return asset;
	}

    @Override
    public int deleteById(Integer id) {
    	Asset asset=new Asset();
		asset.setId(id);
		asset.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return assetMapper.delete(asset);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}
