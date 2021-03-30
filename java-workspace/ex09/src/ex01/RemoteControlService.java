package ex01;

public class RemoteControlService {
	public static void main(String[] args) {
		RemoteControlImpl rc = new RemoteControlImpl();
		
//		rc.nue = 200; // 값을 변경할 수 없다.
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		rc.setMute(true);
	}
}
