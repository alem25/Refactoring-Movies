package usantatecla.movies.v21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Customer {

	private String name;
	
	private List<Rental> rentals;

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<Rental>();
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		String result = "Rental Record for " + this.getName() + "\n";
		result = this.rentals.stream().map(Rental::getMovieTitleAndCharge).reduce(result, (total, str) -> total + str);
		result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		return this.rentals.stream().map(Rental::getCharge).reduce(0.0, (result, charge) -> result + charge);
	}
	
	private int getTotalFrequentRenterPoints() {
		return this.rentals.stream().map(Rental::getFrequentRenterPoints).reduce(0, (result, frequentRenterPoints) -> result + frequentRenterPoints);
	}
}
