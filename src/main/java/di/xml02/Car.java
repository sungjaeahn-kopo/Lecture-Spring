package di.xml02;

public class Car {

	// 의존관계 발생
	private Tire tire;

	public Car() {
		System.out.println("Car() 호출...");
	}

	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 호출...");
	}
	
	public Car(Tire tire1, Tire tire2) {
		System.out.println("Car(Tire, Tire) 호출...");
	}
	
	public Car(Tire tire, String str) {
		System.out.println("Car(Tire, String) 호출...");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
