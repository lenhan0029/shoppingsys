package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

	@Id
    @Column(name = "id")
    private String id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "image")
    private String image;
	
	@Column(name = "price")
    private Integer price;
	
	@Column(name = "quantity")
    private Integer quantity;
	
	@Column(name = "description")
    private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type")
	private Type type;
	
}
