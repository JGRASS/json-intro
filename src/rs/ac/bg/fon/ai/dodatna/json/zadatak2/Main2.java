package rs.ac.bg.fon.ai.dodatna.json.zadatak2;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import rs.ac.bg.fon.ai.dodatna.json.zadatak2.domain.Movie;
import rs.ac.bg.fon.ai.dodatna.json.zadatak2.util.MovieJsonUtility;

public class Main2 {

	public static void main(String[] args) throws IOException {
		LinkedList<Movie> movies = new LinkedList<Movie>();

		Movie movie1 = new Movie();
		movie1.setImdbId("tt0112471");
		movie1.setTitle("Before Sunrise");
		movie1.setReleaseYear(1995);
		movies.add(movie1);

		Movie movie2 = new Movie();
		movie2.setImdbId("tt0381681");
		movie2.setTitle("Before Sunset");
		movie2.setReleaseYear(2004);
		movies.add(movie2);

		Movie movie3 = new Movie();
		movie3.setImdbId("tt2209418");
		movie3.setTitle("Before Midnight");
		movie3.setReleaseYear(2013);
		movies.add(movie3);

		// pretvaranje u JSON format
		JsonArray romanceMoviesJson = MovieJsonUtility.serializeMovies(movies);
		
		// kreiranje Gson objekta
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// cuvanje u fajl
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("data/romance.json")))) {
			String romanceMoviesString = gson.toJson(romanceMoviesJson);
			
			out.println(romanceMoviesString);
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
		
		
		// ucitavanje iz JSON formata
		try (FileReader reader = new FileReader("data/romance.json")) {
			JsonArray moviesJson = gson.fromJson(reader, JsonArray.class);
			LinkedList<Movie> newMovies = MovieJsonUtility.parseMovies(moviesJson);
			
			for (int i = 0; i < newMovies.size(); i++) {
				System.out.println(newMovies.get(i));
			}
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
	}
}
