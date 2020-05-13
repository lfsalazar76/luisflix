package com.lfsalazar.jsf;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Named
public class MovieFormBean implements Serializable {

	private Movie movie = new Movie() ;
	
	private List<Movie> movies = new ArrayList<>();
	
	public String addMovie() {
		long movieId = this.movies.size() + 1 ;
		
		this.movies.add(new Movie(movieId,this.movie.getName(),this.movie.getGenre(),this.movie.getPath()));
		this.movies.stream().forEach(movie ->{
				System.out.println(movie.toString());
		});
		return "list?faces-redirect=true";
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
}
