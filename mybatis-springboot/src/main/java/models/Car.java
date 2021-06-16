package models;

public class Car {
	
	private long id;
	private String name;
	private String model;
	private Rental rental;
	
	public long getId() {
		return id;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Rental getRental() {
		return rental;
	}
	public void setRental(Rental rental) {
		this.rental = rental;
	}
}
