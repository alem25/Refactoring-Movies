package usantatecla.movies.v21;

public abstract class Movie {

	private String title;
	
	public Movie(String title) {
		this.title = title;
	}

	private static final int FREQUENT_RENTER_POINTS = 1;
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return Movie.FREQUENT_RENTER_POINTS;
	}
	
	public String getTitle() {
		return title;
	}
	
}
