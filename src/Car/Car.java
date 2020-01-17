package Car;

public class Car {
	int distance;
public void start () {
	System.out.println("Давай прокатимся");
}
public void stop() {
	System.out.println("Сегодня мы проехали "+ distance + 
			(" минут"));
	}
public int drive(int howlong) {
	distance = howlong * 60;
	return howlong;
}
	

}

