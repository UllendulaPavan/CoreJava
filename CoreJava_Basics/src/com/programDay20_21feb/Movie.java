package com.programDay20_21feb;

public class Movie {

	private String title;
	private int releaseyear;
	private String genre;
	public Movie(String title, int releaseyear, String genre) {
		super();
		this.title = title;
		this.releaseyear = releaseyear;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", releaseyear=" + releaseyear + ", genre=" + genre + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public static void main(String[] args) {
		Movie mv =new Movie("pushpa", 2024,"hhh");
		
		System.out.println(mv.getTitle());
		System.out.println(mv.getReleaseyear());
		System.out.println(mv.getGenre());
		
		//modify
		mv.setTitle("don");
		mv.setReleaseyear(2001);
		mv.setGenre("action");
		
		System.out.println("----------------");
		
		//diplay modify data
        System.out.println("title:"+mv.getTitle());
		System.out.println("release year:"+mv.getReleaseyear());
		System.out.println("Genre:"+mv.getGenre());
		
		
	}
	
}
