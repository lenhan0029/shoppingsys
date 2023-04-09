package com.example.demo.repository.impl;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.demo.dto.ProductDTO;
import com.example.demo.repository.CustomProductRepository;

public class CustomProductRepositoryImpl implements CustomProductRepository{

	@Override
	public List<ProductDTO> getProductBySearch(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
