package ex02;

public interface RemoteControl {
		int MAX_VOLUME = 10;
		// public static final ���� -> ����ʵ� -> ����ʵ���� ���� �빮�ڷ� ����ϴ°��� ��Ģ
		int MIN_VOLUME =0;
		void turnOn(); // public abstract ���� -> �߻�ż���
		void turnOff();
		void setVolume(int volume);
		
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
