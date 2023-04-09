package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.ProductDTO;

import jakarta.websocket.server.PathParam;

@Controller
public class ProductListController {
	@GetMapping("/product")
	public String viewListProduct(Model model,
			@RequestParam(name = "page", defaultValue = "1", required = false)int page,
			@RequestParam(name = "productName",required = false) String productName,
			@RequestParam(name = "productTypeId", required = false) String productTypeId,
			@RequestParam(name = "productDescription", required = false) String productDescription
			) {
		List<ProductDTO> list = new ArrayList<>();
		ProductDTO maygiat1 = new ProductDTO("maygiat1.jpg","Sanyo","giat nhanh");
		ProductDTO maygiat2 = new ProductDTO("maygiat2.jpg","Toyota","giat sach");
		ProductDTO maygiat3 = new ProductDTO("maygiat3.jpg","Sanyo","giat nhanh");
		ProductDTO maygiat4 = new ProductDTO("maygiat4.jpg","Toyota","giat sach");
		ProductDTO maygiat5 = new ProductDTO("maygiat5.jpg","Sanyo","giat nhanh");
		ProductDTO maygiat6 = new ProductDTO("maygiat6.jpg","Toyota","giat sach");
		list.add(maygiat1);
		list.add(maygiat2);
		list.add(maygiat3);
		list.add(maygiat4);
		list.add(maygiat5);
		list.add(maygiat6);
		if(productName != null) {
			for (int i = 0; i < list.size(); i++) {
				if(!list.get(i).getName().equals(productName)) {
					list.remove(i);
				}
			}
			
		}
		model.addAttribute("products", list);
		model.addAttribute("page", page);
		return "productlist";
	}
}
