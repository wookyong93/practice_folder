package ex01;

public class RemoteControlService {
	public static void main(String[] args) {
		RemoteControlImpl rc = new RemoteControlImpl();
		
//		rc.nue = 200; // ���� ������ �� ����.
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		rc.setMute(true);
	}
}
