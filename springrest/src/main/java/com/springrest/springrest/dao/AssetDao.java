package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.asset;

public interface AssetDao extends JpaRepository<asset, Long>{

}
