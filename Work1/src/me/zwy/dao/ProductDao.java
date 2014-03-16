package me.zwy.dao;

import java.awt.List;

import me.zwy.pojo.Product;

public interface ProductDao {

	public void addProduct(Product pro);

	public void deleteProduct(Product pro);

	public void updateProduct(Product pro);

	public Product findByName(String pName);

	public List findAll();

}
