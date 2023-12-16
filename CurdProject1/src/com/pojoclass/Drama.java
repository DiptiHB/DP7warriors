package com.pojoclass;

public class Drama {
	private int id;
	private String dramaName;
	private int releaseYear;
	private String genre;
	private float rating;
	public Drama() 
	{
		
	}
	public Drama(int id, String dramaName, int releaseYear, String genre, float rating)
	{
		this.id = id;
		this.dramaName = dramaName;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDramaName() {
		return dramaName;
	}
	public void setDramaName(String dramaName) {
		this.dramaName = dramaName;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Drama id: " + id + "\ndramaName: " + dramaName + "\nreleaseYear: " + releaseYear + "\ngenre: " + genre
				+ "\nrating: " + rating;
	}
}
