package com;


// POJO Simple Class

public class Driver {
	
	
	private int id;
	
	private String name;
	
	private String category;
	
	private double distance;
	
	
	public Driver() {
		
	}


	public Driver(int id, String name, String category, double distance) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.distance = distance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", category=" + category + ", distance=" + distance + "]";
	}
	
	
	

}
