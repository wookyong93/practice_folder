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
		RemoteControl.changeBattery();//정적 메소드 이기 떄문에 객체에서 호출해 올 수 없다.
		
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
