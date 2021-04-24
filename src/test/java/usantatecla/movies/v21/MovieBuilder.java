package usantatecla.movies.v21;

public class MovieBuilder {

	private String title;
	
	public MovieBuilder() {
		title = "movieName";
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public Movie childrensBuild() {
		return new ChildrenMovie(title);
	}
	
	public Movie regularBuild() {
		return new RegularMovie(title);
	}
	
	public Movie newReleaseBuild() {
		return new NewReleaseMovie(title);
	}
}
