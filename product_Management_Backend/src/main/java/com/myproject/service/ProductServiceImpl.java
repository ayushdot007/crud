package com.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.model.Product;
import com.myproject.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private  ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product editProduct(Product p, Integer id) {
		// TODO Auto-generated method stub
		Product oldProduct = productRepo.findById(id).get();
		
		oldProduct.setProductName(p.getProductName());
		oldProduct.setDescription(p.getDescription());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());
		return productRepo.save(oldProduct);
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(id).get();
		
		if(product != null) {
			productRepo.delete(product);
			return "Product Delete Sucessfully";
		}
		return "Something Wrong on Server";
	}
  
	
	
}
