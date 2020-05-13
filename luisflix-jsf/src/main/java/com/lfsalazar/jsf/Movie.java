package com.lfsalazar.jsf;

public class Movie {

	private Long movieId ;
	
	private String name ;
	
	private String genre ;
	
	private String path ;
	
	public Movie(Long movieId, String name, String genre, String path) {
		this.movieId = movieId ;
		this.name = name ;
		this.genre = genre ;
		this.path = path ;
	}

	public Movie() {

	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
