package app.models;

public class Rental {
	
	private long id;
	private String name;
	private String location;
	
	public long getId() {
		return id;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}

}
