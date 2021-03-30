package ex08;

public class Kia extends Car{


	@Override
	public void input(String carName, int speed, int engine, int price) {
		// TODO Auto-generated method stub
		
		this.carName = carName;
		this.engine = engine;
		this.speed= speed;
		this.price = price;
		
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("자동차명 : "+carName);
		System.out.println("최고속도 : "+speed);
		System.out.println("배기량 : "+engine);
		System.out.println("차량가격 : "+price);
		
	}

}
