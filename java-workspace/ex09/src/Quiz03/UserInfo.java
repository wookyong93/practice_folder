package Quiz03;

public interface UserInfo {
   int MAX_USER = 10; // public static final �ڵ����� �߰��ȴ�.
   int MIN_USER = 0;
   
   Score userInput(Score s); // public abstract �ڵ����� �߰��ȴ�.
   void UserOutput(Score s);
}
