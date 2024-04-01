package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	IProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);

	}

	public void updateProduct(int productId, double price) {
		productRepository.updateProduct(productId, price);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteProduct(productId);

	}

	@Override
	public Product getById(int productId) {
		
		Product product = productRepository.findById(productId);
		if (product == null) {
			throw new ProductNotFoundException("dxgfchvjbkn");
		} else
			return product;
	}

//	@Override
//	public List<Product> getAll() {
//		List<Product> products = details.showBooks();
//        return books;
//	}

	@Override
	public List<Product> getByBrand(String brand) {
		List<Product> products=productRepository.findByBrand(brand);
		if(products.isEmpty())
			throw new ProductNotFoundException("product not found ");
		else
		return products;
	}

	@Override
	public List<Product> getByLessPrice(double price) {
		List<Product> products=productRepository.findByLessPrice(price);
		if(products.isEmpty())
			throw new ProductNotFoundException("product not found ");
		else
		return products;
	}

	@Override
	public List<Product> getByCategoryandPrice(String category, double price) {
		List<Product> products=productRepository.findByCategoryandPrice(category, price);
		if(products.isEmpty())
			throw new ProductNotFoundException("product not found ");
		else
		return products;
	}

	@Override
	public List<Product> getAll() {
		List<Product> products=productRepository.findAll();
		if(products.isEmpty())
			throw new ProductNotFoundException("product not found ");
		else
		return products;
	}

}
