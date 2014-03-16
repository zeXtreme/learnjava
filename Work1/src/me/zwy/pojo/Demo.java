package me.zwy.pojo;

import java.awt.List;

import me.zwy.dao.ProductDao;

public class Demo {
		
		    ProductDao dao=new ProductDao(){
			@Override
			public void addProduct(Product pro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void deleteProduct(Product pro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void updateProduct(Product pro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Product findByName(String pName) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List findAll() {
				// TODO Auto-generated method stub
				return null;
			}
		};

}
