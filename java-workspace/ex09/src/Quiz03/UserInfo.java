package Quiz03;

public interface UserInfo {
   int MAX_USER = 10; // public static final 자동으로 추가된다.
   int MIN_USER = 0;
   
   Score userInput(Score s); // public abstract 자동으로 추가된다.
   void UserOutput(Score s);
}
