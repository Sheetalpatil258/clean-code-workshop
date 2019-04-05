package com.thoughtworks.movierental;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {
	
	private Customer customer ;
	
	
    @Test
    public void shouldBeAGeneratedTextStatement(){  	
    	customer = setup();
    	assertEquals("Rental Record for Sheetal\n"+
    				"\tGod Father\t3.5\n"+
    				"\tToy Story\t1.5\n"+
    				"\tAvengers\t12.0\n"+
    				"Amount owed is 17.0\n"+
    				"You earned 1 frequent renter points", customer.statement());
    }

    
    @Test
    public void shouldBeAGeneratedhtmlStatement(){  
    	 customer = setup();
    	assertEquals("<h1>Rental Record for <b>Sheetal</b></h1><br/>	God Father 3.5<br/>	Toy Story 1.5<br/>	Avengers 12.0<br/>Amount owed is <b>17.0</b><br/>You earned <b>1</b> frequent renter points", customer.htmlStatement());
    }
    
    private Customer setup() {
    	Customer customer=new Customer("Sheetal");
    	customer.addRental(new Rental(new Movie("God Father", Movie.REGULAR),3));
    	customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS),2));
    	customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE),4));
    	return customer;
	}
 
    
}