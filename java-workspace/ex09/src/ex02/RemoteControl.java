package ex02;

public interface RemoteControl {
		int MAX_VOLUME = 10;
		// public static final 생략 -> 상수필드 -> 상수필드명은 전부 대문자로 사용하는것이 규칙
		int MIN_VOLUME =0;
		void turnOn(); // public abstract 생략 -> 추상매서드
		void turnOff();
		void setVolume(int volume);
		
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
