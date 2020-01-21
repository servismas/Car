import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) {
		int size = 4;
		Car car = new Car(1, "Audi", "A6", 2010, "black", 10000, "II000II", "sedan");
		Car car1 = new Car(2, "BMW", "X6", 2010, "silver", 15000, "BOOMER", "SUV");
		Car car2 = new Car(3, "Fiat", "Panda", 2007, "yellow", 5000, "BK1973AM", "Hatchback");
		Car car4 = new Car(4, "BMW", "X3", 2015, "white", 12000, "asasd", "SUV");
		Car[] cars = new Car[size];

		cars[0] = car;
		cars[1] = car1;
		cars[2] = car2;
		cars[3] = car4;

		Scanner s = new Scanner(System.in);
		System.out.println("input make");
		String make = s.next();

		for (int i = 0; i < cars.length; i++) {
			// System.out.println(cars[i].make.equals(make));
			if (cars[i].make.equals(make)) {
				System.out.println(cars[i]);
			}
		}
		System.out.println();

		System.out.println("input model");
		String model = s.next();
		System.out.println("input age");
		int age = 0;
		try {
			age = s.nextInt();
		} catch (Exception e) {
		}

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Kiev"));
		int currentYear = cal.get(Calendar.YEAR);
		boolean check = false;
		for (int i = 0; i < cars.length; i++) {
			check = cars[i].year < currentYear - age;
			if (cars[i].model.equals(model) && check) {
				System.out.println(cars[i]);
			}
		}
		System.out.println();

		
		System.out.println("input year of manufacturing and price");
		int year = 0;
		int price = 0;
		try {
			year = s.nextInt();
			price = s.nextInt();
		} catch (Exception e) {
		}
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].price > price && cars[i].year == year) {
				System.out.println(cars[i]);
			}
		}
		
		s.close();
	}

}