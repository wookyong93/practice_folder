package ex08;

import javax.swing.AbstractAction;

public abstract class Car {
	public String carName;
	public int speed;
	public int engine;
	public int price;
	
	public abstract void input(String carName,int speed,int engine,int price);

	public abstract void output();
	
}
