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
		System.out.println("�ڵ����� : "+carName);
		System.out.println("�ְ�ӵ� : "+speed);
		System.out.println("��ⷮ : "+engine);
		System.out.println("�������� : "+price);
		
	}

}
