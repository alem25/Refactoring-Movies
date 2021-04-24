package usantatecla.movies.v21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChargeTest {

    private static double delta = 0.001;

    @Test
	public void regularRentalZeroDaysChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).regularBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(0).build();
        double result = rental.getCharge();
		assertEquals(result, 2.0, delta);
	}

    @Test
	public void childrensRentalZeroDaysChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).childrensBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(0).build();
        double result = rental.getCharge();
		assertEquals(result, 1.5, delta);
	}

    @Test
	public void newReleaseRentalZeroDaysChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(0).build();
        double result = rental.getCharge();
		assertEquals(result, 3.0, delta);
	}

    @Test
	public void regularRental1DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).regularBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
        double result = rental.getCharge();
		assertEquals(result, 2.0, delta);
	}

    @Test
	public void childrensRental1DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).childrensBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
        double result = rental.getCharge();
		assertEquals(result, 1.5, delta);
	}

    @Test
	public void newReleaseRental1DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
        double result = rental.getCharge();
		assertEquals(result, 3.0, delta);
	}

    @Test
	public void regularRental2DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).regularBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
        double result = rental.getCharge();
		assertEquals(result, 2.0, delta);
	}

    @Test
	public void childrensRental2DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).childrensBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
        double result = rental.getCharge();
		assertEquals(result, 1.5, delta);
	}

    @Test
	public void newReleaseRental2DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
        double result = rental.getCharge();
		assertEquals(result, 3.0, delta);
	}

    @Test
	public void regularRental3DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).regularBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
        double result = rental.getCharge();
		assertEquals(result, 3.5, delta);
	}

    @Test
	public void childrensRental3DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).childrensBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
        double result = rental.getCharge();
		assertEquals(result, 1.5, delta);
	}

    @Test
	public void newReleaseRental3DayChargeTest() {
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
        double result = rental.getCharge();
		assertEquals(result, 3.0, delta);
	}

    @Test
	public void regularRental4DayChargeTest() {
        int rentalDays = 4;
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).regularBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(rentalDays).build();
        double result = rental.getCharge();
        double expectedCharge = ((rentalDays - 2.0) * 1.5) + 2.0;
		assertEquals(result, expectedCharge, delta);
	}

    @Test
	public void childrensRental4DayChargeTest() {
        int rentalDays = 4;
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).childrensBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(rentalDays).build();
        double result = rental.getCharge();
        double expectedCharge = ((rentalDays - 1.0) * 1.5) + 1.5;
		assertEquals(result, expectedCharge, delta);
	}

    @Test
	public void newReleaseRental4DayChargeTest() {
        int rentalDays = 4;
        String movieName = "movieName";
        Movie movie = new MovieBuilder().title(movieName).newReleaseBuild();
        Rental rental = new RentalBuilder().movie(movie).daysRented(rentalDays).build();
        double result = rental.getCharge();
        double expectedCharge = 3.0;
		assertEquals(result, expectedCharge, delta);
	}
}