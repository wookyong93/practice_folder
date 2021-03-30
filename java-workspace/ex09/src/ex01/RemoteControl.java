package ex01;

public interface RemoteControl {
	public int num= 100;
	void turnOn(); // public abstract 생략 -> 추상매서드
	void turnOff();

	
	default void setMute(boolean mute) {
		if(mute) {System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	}
