package ex02;

public class Audio implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("���� �ִ� �����Դϴ�.");
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("���� ���� ���� �Դϴ�.");}
		else {
			System.out.println("���� ������ "+volume+"�Դϴ�.");
		}
		}

}
