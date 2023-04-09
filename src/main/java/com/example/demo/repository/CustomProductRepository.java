package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.demo.dto.ProductDTO;

public interface CustomProductRepository {
	List<ProductDTO> getProductBySearch(Pageable pageable);
}
