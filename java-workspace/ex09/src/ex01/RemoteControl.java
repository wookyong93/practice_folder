package ex01;

public interface RemoteControl {
	public int num= 100;
	void turnOn(); // public abstract ���� -> �߻�ż���
	void turnOff();

	
	default void setMute(boolean mute) {
		if(mute) {System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ���� �մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	}
