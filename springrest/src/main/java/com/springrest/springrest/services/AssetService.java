package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.asset;

public interface AssetService {
	public List<asset> getAsset();
	public asset getAsset1(long assetId);
	public asset addAsset(asset asset);
	public asset updateAsset(asset asset);
	public void deleteAsset(long parseLong);
}
