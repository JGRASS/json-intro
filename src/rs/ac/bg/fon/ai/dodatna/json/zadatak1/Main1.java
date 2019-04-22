package rs.ac.bg.fon.ai.dodatna.json.zadatak1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.ai.dodatna.json.domain.Movie;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// create Gson object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Movie beforeSunrise = null;
		
		// deserialize JSON to Java object
		try (FileReader reader = new FileReader("data/movie.json")) {
			beforeSunrise = gson.fromJson(reader, Movie.class);
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
	
		beforeSunrise.setRating(9);
		
		// serialize Java object to JSON
		try (FileWriter writer = new FileWriter("data/updatedMovie.json")) {
			writer.write(gson.toJson(beforeSunrise));
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		}
	}
}
