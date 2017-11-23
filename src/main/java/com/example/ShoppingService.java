package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.exception.InvalidProductException;
import com.example.model.Product;

public class ShoppingService {
	
	private Map<Integer, Product> cart = new  HashMap<>();
	
	public void addItem(Product product){
		int pid = product.getId();
		if(cart.containsKey(pid)){
			Product existingProduct = cart.get(pid);
			existingProduct.setQuantity(existingProduct.getQuantity()+1);
		} else {
			cart.put(pid, product);
		}
		
	}
	
	
	public int countItems(){
		int count = 0;
		Collection<Product> products = cart.values();
		
		for(Product product : products){
			count = count + product.getQuantity();
			
		}
		return count;
		
	}
	
	
	public Collection<Product> cartDetails(){
		return cart.values();
	}
	
	public void removeItem(int pid) throws InvalidProductException{
		int count = 0;
		Product product = cart.get(pid);
		
		if(!cart.containsKey(pid)){
			throw new InvalidProductException("item not found");
			
		}
		if(product.getQuantity() ==1 ){
			cart.remove(pid);
		}
		else{
			product.setQuantity(product.getQuantity()-1);
		}
		
		
		
	}

}
