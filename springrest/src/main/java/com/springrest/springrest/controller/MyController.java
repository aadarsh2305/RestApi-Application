package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.asset;
import com.springrest.springrest.services.AssetService;

@RestController
public class MyController {
	@Autowired
	private AssetService assetService;

	@GetMapping("/asset")
	public List<asset> getAsset() {

		return this.assetService.getAsset();
	}

	@GetMapping("/asset/{assetId}")
	public asset getAsset1(@PathVariable String assetId) {
		return this.assetService.getAsset1(Long.parseLong(assetId));
	}

	@PostMapping("/asset")
	public asset addAsset(@RequestBody asset asset) {
		return this.assetService.addAsset(asset);
	}
	@PutMapping("/asset")
	public asset updateAsset(@RequestBody asset asset) {
		return this.assetService.updateAsset(asset);
	}
	@DeleteMapping("/asset/{assetId}")
	public ResponseEntity<HttpStatus> deleteAsset(@PathVariable String assetId){
		try {
			this.assetService.deleteAsset(Long.parseLong(assetId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
