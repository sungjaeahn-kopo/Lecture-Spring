package di.anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	//@Resource(name="hankookTire")
	//@Qualifier("kumhoTire")
	@Resource
	@Qualifier("kumhoTire")
	private Tire tire;
	
	public Car() {
		System.out.println("Car()...");
	}
	
	//@Resource(name="hankookTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
	
}
