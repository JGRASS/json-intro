package rs.ac.bg.fon.ai.dodatna.json.domain;

public class Movie {

	private String imdbId;
	private String title;
	private int releaseYear;
	private double rating;
	
	public Movie(String imdbId, String title, int releaseYear) {
		super();
		this.imdbId = imdbId;
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [imdbId=" + imdbId + ", title=" + title + ", releaseYear=" + releaseYear + ", rating=" + rating + "]";
	}

}
