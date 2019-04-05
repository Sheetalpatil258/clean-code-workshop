package com.thoughtworks.movierental;

public class Application {

	public static void main(String[] args) {
		Customer customer=new Customer("Sheetal");
		String statement=customer.statement();
		System.out.println(statement);
		System.out.println(customer.htmlStatement());

	}

}
