package app.models;

public class Car {
	
	private long id;
	private String name;
	private String model;
	private long rental_id;
	
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
	
	public long getRental_id() {
		return rental_id;
	}
	public void setRental_id(long id) {
		this.rental_id = id;
	}
}
