package rs.ac.bg.fon.ai.dodatna.json.zadatak2.util;

import java.util.LinkedList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.ai.dodatna.json.zadatak2.domain.Movie;

public class MovieJsonUtility {

	public static JsonArray serializeMovies(LinkedList<Movie> movies) {
		JsonArray moviesArray = new JsonArray();
		
		for (int i = 0; i < movies.size(); i++) {
			Movie m = movies.get(i);
			
			JsonObject movieJson = new JsonObject();
			movieJson.addProperty("id", m.getImdbId());
			movieJson.addProperty("title", m.getTitle());
			movieJson.addProperty("year", m.getReleaseYear());
			
			moviesArray.add(movieJson);
		}
		
		return moviesArray;
	}
	
	public static LinkedList<Movie> parseMovies(JsonArray moviesJson) {
		LinkedList<Movie> movies = new LinkedList<Movie>();
		
		for (int i = 0; i < moviesJson.size(); i++) {
			JsonObject movieJson = (JsonObject) moviesJson.get(i);
			
			Movie m = new Movie();
			m.setImdbId(movieJson.get("id").getAsString());
			m.setTitle(movieJson.get("title").getAsString());
			m.setReleaseYear(movieJson.get("year").getAsInt());
			
			movies.add(m);
		}
		
		return movies;
	}
}
