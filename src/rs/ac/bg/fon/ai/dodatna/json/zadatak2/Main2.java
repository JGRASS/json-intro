package rs.ac.bg.fon.ai.dodatna.json.zadatak2;

import java.io.IOException;
import java.util.LinkedList;

import rs.ac.bg.fon.ai.dodatna.json.domain.Movie;

public class Main2 {

	public static void main(String[] args) throws IOException {
		LinkedList<Movie> movies = new LinkedList<Movie>();

		Movie movie1 = new Movie("tt0112471", "Before Sunrise", 1995);
		movies.add(movie1);

		Movie movie2 = new Movie("tt0381681", "Before Sunset", 2004);
		movies.add(movie2);

		Movie movie3 = new Movie("tt2209418", "Before Midnight", 2013);
		movies.add(movie3);

		// convert Java list into JSON list

		
		// create Gson object

		
		// save JSON to the file "data/romance.json"

		
		// read JSON from the file "data/romance.json"

		
	}
}
