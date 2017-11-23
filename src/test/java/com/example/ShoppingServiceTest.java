package com.example;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import com.example.model.Product;

public class ShoppingServiceTest {
	
	@Test
	public void addingItemInCartShouldMakeCartSizeByOne(){
		
	
	double rs;
		Product laptop =  new Product(100, "Hp laptop", 1500.00, 1);
		ShoppingService shopping = new ShoppingService();
		shopping.addItem(laptop);
		assertEquals(1, shopping.countItems());

}
	
	
	@Test
	public void addingMultipleItemInCartShouldMakeCartSize(){
		
	
	double rs;
		Product laptop =  new Product(100, "Hp laptop", 1500.00, 1);
		Product watch =  new Product(101, "Rolex watch", 800000.00, 1);
		Product mobile =  new Product(102, "Samsung Mobile", 23000.00, 1);
		
		ShoppingService shopping = new ShoppingService();
		shopping.addItem(laptop);
		shopping.addItem(laptop);
		shopping.addItem(watch);
		shopping.addItem(mobile);
		shopping.addItem(mobile);
		
		assertEquals(5, shopping.countItems());

}
	
	
	@Test
	public void checkingDuplicatetemInCart(){
		
	
	double rs;
		Product laptop =  new Product(100, "Hp laptop", 1500.00, 1);
		
		ShoppingService shopping = new ShoppingService();
		shopping.addItem(laptop);
		shopping.addItem(laptop);
		Collection<Product> details = shopping.cartDetails();
		for(Product p: details){
				assertEquals(2, shopping.countItems());
		}
		

}
	
	
	@Test
	public void addingLaptopnInCartShouldAddLaptopOnly(){
		
		Product laptop =  new Product(100, "Hp laptop", 1500.00, 1);
		ShoppingService shopping = new ShoppingService();
		shopping.addItem(laptop);
		
		Collection<Product> products = shopping.cartDetails();
		for(Product p: products){
			assertEquals(100, p.getId());
			assertTrue(p.getName().equals("Hp laptop"));
		}

}
	
	@Test
	public void cartDetailsareNILIfEmptyCart(){
		
		Product laptop =  new Product(100, "Hp laptop", 1500.00, 1);
		ShoppingService shopping = new ShoppingService();
		shopping.addItem(laptop);
		
		Collection<Product> products = shopping.cartDetails();
		for(Product p: products){
			assertEquals(100, p.getId());
			assertTrue(p.getName().equals("Hp laptop"));
		}

}
	
	
	@Test
	public void emptyCartShouldHaveZeroItems(){
		ShoppingService shopping = new ShoppingService();
		assertNotNull(shopping.cartDetails());
		assertEquals(0, shopping.cartDetails().size());

}


}
