package com.example;

import org.junit.*;

import com.example.exception.InvalidSalaryException;

public class PayrollServiceTest{

	@Test
	public void testHrs(){
		
	PayrollService pay = new PayrollService();
	double rs;
	try {
		rs = pay.hrs(10000.00);
		Assert.assertEquals(6000.00,rs,2);
	} catch (InvalidSalaryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	

}
	
	@Test(expected=InvalidSalaryException.class)
	public void testHrashouldProduceException() throws InvalidSalaryException{
		
	PayrollService pay = new PayrollService();
	double rs;
	rs = pay.hrs(-10000.00);	

}
	
	@Test
	public void testDAshouldbeMorethanTestPercent(){
		
	PayrollService pay = new PayrollService();
	double rs;
	try {
		rs = pay.da(10000.00);
		Assert.assertEquals(1000.00,rs,2);
	} catch (InvalidSalaryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	

}
	
	@Test(expected=InvalidSalaryException.class)
	public void testdashouldProduceException() throws InvalidSalaryException{
		
	PayrollService pay = new PayrollService();
	double rs;
	rs = pay.da(-10000.00);	

}



}





