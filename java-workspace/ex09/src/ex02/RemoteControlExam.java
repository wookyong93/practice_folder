package ex02;

public class RemoteControlExam {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		RemoteControl.changeBattery();//���� �޼ҵ� �̱� ������ ��ü���� ȣ���� �� �� ����.
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
	}
}
