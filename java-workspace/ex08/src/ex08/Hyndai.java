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
		System.out.println("������� : "+this.carName);
		System.out.println(carName+"�ڵ��� ��ռӵ� : "+this.speed);
		System.out.println("��ⷮ : "+this.engine);
		System.out.println("�������� : "+this.price);
		
	}

}
