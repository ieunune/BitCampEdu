package com.model2.mvc.service.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


public interface ProductService {
	
	public void addProduct(Product product) throws Exception;

	public Product getProduct(int prodNo) throws Exception;

	public Map<String, Object> getProductList(Map<String, Object> searchMap) throws Exception;

	public void updateProduct(Product product) throws Exception;

	public List<String> getProductSearchList(Map<String, Object> searchMap) throws Exception;
	
	public void updateProdAmount(Product product) throws Exception;
}