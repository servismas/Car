
public class Car {

	public int id;
	public String make;
	public String model;
	public int year;
	public String color;
	public int price;
	public String number;
	protected String type;
	
	public Car(int id, String make, String model, int year, String color, int price, String number, String type) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.number = number;
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return (make + " " + model + " " + year);
	}
}
