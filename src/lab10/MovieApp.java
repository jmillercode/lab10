package lab10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class MovieApp {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String userContinue = "yes";
		String userCategory = "";
		String loop = "loop";
		
		while (userContinue.equals("yes")){
			//reset values
			userCategory = "";
			loop = "loop";
			//prompt and validation
			while (loop.equals("loop")) {
				System.out.println("Enter one of the following catigories to display the films in that catagory.");
				System.out.println("Horror       Action");
				System.out.println("Animated     SciFi");
				userCategory = scnr.next();
				if (userCategory.equals("horror") || userCategory.equals("scifi") || userCategory.equals("animated") || userCategory.equals("action")) {
					loop = "Stop";
				}
				else {
					System.out.println("Please enter an availible category.");
				}
			}
			//create movie objects and list of movie objects
			Movie movie1 = new Movie("Fight Club", "action");
			Movie movie2 = new Movie("Spirited Away", "animated");
			Movie movie3 = new Movie("Haloween", "horror");
			Movie movie4 = new Movie("Starwars", "scifi");
			Movie movie5 = new Movie("Your Name", "animated");
			Movie movie6 = new Movie("Indiana Jones", "action");
			Movie movie7 = new Movie("Amityvile Horror", "horror");
			Movie movie8 = new Movie("Alien", "scifi");
			Movie movie9 = new Movie("Venom", "action");
			Movie movie10 = new Movie("Akira", "animated");
			Movie[] movieArray = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
			List<Movie> listOfMovies = new ArrayList<Movie>();
			for (int i = 0; i < movieArray.length; ++i) {
				listOfMovies.add(movieArray[i]);
			}
			
			//compares user category with categories in movie objects
			System.out.println("The movies in your category are:");
			for (Movie movie : listOfMovies) {
				if (movie.getCategory().equals(userCategory)) {
					System.out.println(movie.getMovieTitle());
				}
			}
			
			//loop program
			System.out.println("would you like to continue? (yes/no)");
			userContinue = scnr.next();
		}
	}

}
