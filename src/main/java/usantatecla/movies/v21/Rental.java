package usantatecla.movies.v21;

public class Rental {

	private Movie movie;
	
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public double getCharge() {
		return movie.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}
	
	public int getDaysRented() {
		return daysRented;
	}
	
	public Movie getMovie() {
		return movie;
	}

	public String getMovieTitleAndCharge() {
		return "\t" + this.getMovie().getTitle() + "\t" + String.valueOf(this.getCharge()) + "\n";
	}
	
}
