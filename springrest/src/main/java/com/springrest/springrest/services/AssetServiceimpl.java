package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.AssetDao;
import com.springrest.springrest.entities.asset;

@Service
public class AssetServiceimpl implements AssetService {
	@Autowired
	private AssetDao assetDao;

	public AssetServiceimpl() {

	}

	@Override
	public List<asset> getAsset() {

		return assetDao.findAll();
	}

	@Override
	public asset getAsset1(long assetId) {

		return assetDao.getOne(assetId);
	}

	@Override
	public asset addAsset(asset asset) {
		assetDao.save(asset);
		return asset;
	}

	@Override
	public asset updateAsset(asset asset) {
		assetDao.save(asset);
		return asset;
	}

	@Override
	public void deleteAsset(long parseLong) {
	asset entity=assetDao.getOne(parseLong);
	assetDao.delete(entity);
	}

}
