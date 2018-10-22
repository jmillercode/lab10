package lab10;

import java.util.List;
import java.util.ArrayList;


public class Movie {
	
	private String movieTitle;
	private String category;
	
	public Movie(){}
	
	public Movie(String movieTitle, String category) {
		this.movieTitle = movieTitle;
		this.category = category;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String movieCategory) {
		this.category = category;
	}


}
