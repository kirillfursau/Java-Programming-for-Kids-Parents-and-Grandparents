package Car;

public class Car {
	int distance;
public void start () {
	System.out.println("����� ����������");
}
public void stop() {
	System.out.println("������� �� �������� "+ distance + 
			(" �����"));
	}
public int drive(int howlong) {
	distance = howlong * 60;
	return howlong;
}
	

}

