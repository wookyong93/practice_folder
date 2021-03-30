package ex02;

public class Television implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("텔레비젼을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("텔레비젼을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("현재 최대 음량입니다.");
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("현재 최저 음량 입니다.");}
		else {
			System.out.println("현재 볼륨은 "+volume+"입니다.");
		}
		}

}
