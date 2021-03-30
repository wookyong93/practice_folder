package ex08;

public class Hyndai extends Car {

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
		System.out.println("제조사명 : "+this.carName);
		System.out.println(carName+"자동차 평균속도 : "+this.speed);
		System.out.println("배기량 : "+this.engine);
		System.out.println("차량가격 : "+this.price);
		
	}

}
