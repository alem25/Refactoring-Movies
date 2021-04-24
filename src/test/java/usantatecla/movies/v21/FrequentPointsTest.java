package usantatecla.movies.v21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrequentPointsTest {
    @Test
	public void regularRentalWithoutFrequentPointsTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).regularBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(0).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void childrenRentalWithoutFrequentPointsTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).childrensBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(0).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void newReleaseRentalWithoutFrequentPointsTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(0).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

	@Test
	public void regularRental1DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).regularBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void childrensRental1DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).childrensBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void newReleaseRental1DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}
	
	@Test
	public void regularRental2DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).regularBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void childrensRental2DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).childrensBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void newReleaseRental2DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 2);
	}

	@Test
	public void regularRental3DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).regularBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void childrensRental3DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).childrensBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 1);
	}

    @Test
	public void newReleaseRental3DayFrequentPointsTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
        int result = rental.getFrequentRenterPoints();
		assertEquals(result, 2);
	}
}