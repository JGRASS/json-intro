package rs.ac.bg.fon.ai.dodatna.json.zadatak2.domain;

public class Movie {

	private String imdbId;
	private String title;
	private int releaseYear;
	private double rating;

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
