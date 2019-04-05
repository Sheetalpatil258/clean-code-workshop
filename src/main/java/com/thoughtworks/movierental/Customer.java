package com.thoughtworks.movierental;

import java.util.List;

public class Customer {
	
  private String name;
  private Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }
  
  public String statement() 
  {	  
	  return new TextStatement().display(this.getName(), this.rentals);
  }
  
  private class TextStatement{
	  
	  public String display(String name, Rentals rentals) {
		  String result = "Rental Record for " + getName() + "\n";
		  
		  for(Rental rental: rentals) {
			  //show figures for this rental
			  result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.amount()) + "\n";
		  }
	    //add footer lines result
	    result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
	    result += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints())
	        + " frequent renter points";
	    return result;
	  }
	  
  }
  
  public String htmlStatement() 
  {	  
	  String result = "<h1>Rental Record for <b>" + getName() + "</b></h1><br/>";
	  
	  for(Rental rental: rentals) {
		  //show figures for this rental
		  result += "\t" + rental.getMovie().getTitle() + " " + String.valueOf(rental.amount()) + "<br/>";
	  }
    //add footer lines result
    result += "Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b><br/>";
    result += "You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints())
        + "</b> frequent renter points";
    return result;
  }
  
 

}
  



