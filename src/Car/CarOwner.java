package Car;

public class CarOwner {

	public static void main(String[] args) {
	
	Car myCar = new Car();
	myCar.start();
	System.out.println("Сколько минут мы ехали?");
	myCar.drive(3);
	myCar.stop();
	}

}
