package com.backend.printmedianenterprise.Entity;

import java.math.BigDecimal;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Lob
	private String description;
	
	private BigDecimal price;
	
	@Lob
	@Column(columnDefinition = "Longblob") 
	private byte[] img;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="category_id",nullable = false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore 
	private Category category;
	
}
